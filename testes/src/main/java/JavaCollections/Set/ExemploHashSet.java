package JavaCollections.Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        //NÃO RESPEITA A ORDEM DE INSERÇÃO DOS DADOS PARA GARANTIR MAIOR PERFORMACE

        //INSTANCIA UMA NOVA HASHSET
        Set<Double> notas = new HashSet<>();

        //INSERE OBJETOS NA HASHSET
        notas.add(9.8);
        notas.add(4.5);
        notas.add(7.3);
        notas.add(5.2);
        notas.add(10.0);
        notas.add(8.5);

        System.out.println(notas);

        //REMOVE OS DADOS
        notas.remove(10.0);
        System.out.println(notas);

        //RETORNA A QUANTIDADE DE OBJETOS
        System.out.println(notas.size());

        //PERCORRE TODOS OS OBJETOS
        for (double nota : notas) {
            System.out.printf("Nota: %.2f\n",nota);
        }

        //ESVAZIA A LISTA
        notas.clear();

        //RETORNA SE A LISTA ESTA VAZIA
        System.out.println(notas.isEmpty());
    }
}
