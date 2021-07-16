package JavaAvancado.ProcessamentoAssicronoeParalelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ApiFuture {
    //define quantos threads serão usados no maximo
    private static final ExecutorService threadatividades = Executors.newFixedThreadPool(3);

    //main com exeption Interrupted
    public static void main(String[] args) throws InterruptedException {
        //inicialização do objeto casa
        Casa casa = new Casa(new Quarto());

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("----------------------------------------------");

        //implementação da lista future
        List<Future<String>> futuros =
        //lambda para ler os dados da lista
        new CopyOnWriteArrayList<>(casa.obterAfazeresdaCasa().stream()
                .map(atividade -> threadatividades.submit(() -> {
                        try {
                            return atividade.realizar();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
                )
                .collect(Collectors.toList()));

        //loop para percorrer a lista
        while (true) {
            //inicializaçãp das atividades
            int Numerodeatividadesnaofinalizadas = 0;
            //loop pra verificar se a atividade foi concluida
            for (Future<?> Futuro : futuros) {
                //if para validar a verificação
                if (Futuro.isDone()) {
                    //try para efetuar o print de atividade concluida e remover a mesma da lista
                    try {
                        System.out.printf("\nParabens você terminou de %s", Futuro.get());
                        futuros.remove(Futuro);
                    //catchs para interromper o loop
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                  //else para implementar atividades
                } else {
                    Numerodeatividadesnaofinalizadas++;
                }
            }
            //lambda para fazer o loop com o numero de atividades a serem finalizadas
            if (futuros.stream().allMatch(Future::isDone)) {
                break;
            }
            //print com a saida e timer de 500 milisegundos para cada print
            System.out.printf("\nNumero de atividades não finalizadas: %s\n%s", Numerodeatividadesnaofinalizadas,msg);
            Thread.sleep(500);
            }
        //shutdown para parar as threads apos o fim do processo
        threadatividades.shutdown();
        }
    }
//classe casa com lista de comodos em um array e afazeres dos comodos
class Casa{
    private List<Comodo> comodos;

    //array casa e seus comodos
    Casa(Comodo...comodos){
        this.comodos = Arrays.asList(comodos);
    }

    //lambda para obter os afazeres da casa
    List<Atividade> obterAfazeresdaCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresdoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}
//interface com a realização das atividades
interface Atividade{
    String realizar()throws InterruptedException;
}
//classe abstrata comodo
abstract class Comodo{
    abstract List<Atividade> obterAfazeresdoComodo();
}

//classe quarto
class Quarto extends Comodo {
    //sobsecreveometodo
    @Override
    List<Atividade> obterAfazeresdoComodo() {

        //implementa as atividades
        return Arrays.asList(
                this::arrumarcama,
                this::varrerquarto,
                this::arrumarguardaroupa
        );
    }

    //metodo arrumar guarda roupa
    private String arrumarguardaroupa() throws InterruptedException {
        Thread.sleep(5000);
        String arrumar_o_guarda_roupa = "\nArrumar o guarda roupa";
        return arrumar_o_guarda_roupa;
    }

    //metodo varrer quarto
    private String varrerquarto() throws InterruptedException {
        Thread.sleep(7000);
        String varrer_o_quarto = "\nVarrer o quarto";
        System.out.println(varrer_o_quarto);
        return varrer_o_quarto;
    }

    //metodo arrumar cama
    private String arrumarcama() throws InterruptedException {
        Thread.sleep(10000);
        String arrumar_a_cama = "\nArrumar a cama";
        System.out.println(arrumar_a_cama);
        return arrumar_a_cama;
    }
}
