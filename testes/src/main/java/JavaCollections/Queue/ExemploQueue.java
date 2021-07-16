package JavaCollections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        //DECLARAÇÃO DA QUEUE
        Queue<String> filaatendimento = new LinkedList<>();

        //INSERÇÃO DOS DADOS NA FILA
        filaatendimento.add("Andrea");
        filaatendimento.add("Veronica");
        filaatendimento.add("Julia");
        filaatendimento.add("Pedro");
        filaatendimento.add("Marcos");

        System.out.println(filaatendimento);

        //REMOVE O DADO NA ORDEM DE ENTRADA
        String atendimento = filaatendimento.poll();
        System.out.println(atendimento);
        System.out.println(filaatendimento);

        //MOSTRA O PRIMEIRO DADO A SER CHAMADO
        String ordemdechamada = filaatendimento.peek();
        System.out.println(ordemdechamada);
        System.out.println(filaatendimento);

        //MOSTRA O PRIMEIRO DADO A SER CHAMADO E APRESENTA ERRO CASO A QUEUE ESTEJA VAZIA
        String ordemchamdaouerro = filaatendimento.element();
        System.out.println(ordemchamdaouerro);
        System.out.println(filaatendimento);

        // FOREACH PERCORRE A LISTA E INTERAGE COM OS DADOS
        for (String cliente : filaatendimento) {
            System.out.println("Nome: " + cliente);
        }

        //RETORNA O TAMANHO DA LISTA
        int tamanho = filaatendimento.size();
        System.out.println(tamanho);
    }
}
