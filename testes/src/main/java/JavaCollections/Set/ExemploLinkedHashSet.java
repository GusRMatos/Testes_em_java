package JavaCollections.Set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        //GARANTE A ORDEM DE INSERÇÃO POREM APRESENTA MENOR PERFORMAÇE

        //INSTANCIA UMA NOVA LINKEDHASHSET
        LinkedHashSet<Integer> sequenciadedados = new LinkedHashSet<>();

        //INSERE OS OBJETOS NA LINKEDHASHSET
        sequenciadedados.add(1);
        sequenciadedados.add(2);
        sequenciadedados.add(4);
        sequenciadedados.add(8);
        sequenciadedados.add(16);
        sequenciadedados.add(32);
        sequenciadedados.add(64);

        System.out.println(sequenciadedados);

        //REMOVE OS DADOS
        sequenciadedados.remove(16);
        System.out.println(sequenciadedados);

        //RETORNA A QUANTIDADE DE OBJETOS
        System.out.println(sequenciadedados.size());

        //PERCORRE TODOS OS OBJETOS
        for (int dado : sequenciadedados) {
            System.out.printf("Numero: %d\n",dado);
        }

        //ESVAZIA A LISTA
        sequenciadedados.clear();

        //RETORNA SE A LISTA ESTA VAZIA
        System.out.println(sequenciadedados.isEmpty());

    }
}
