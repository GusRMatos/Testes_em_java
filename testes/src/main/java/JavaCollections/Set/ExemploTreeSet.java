package JavaCollections.Set;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        //MONTA UMA ARVORE BINARIA

        //INSTANCIA UMA NOVA ARVORE BINARIA
        TreeSet<String> capitais = new TreeSet<>();

        //INSERE OS OBJETOS NA ARVORE
        capitais.add("Salvador");
        capitais.add("Aracaju");
        capitais.add("Recife");
        capitais.add("Natal");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Amapa");

        System.out.println(capitais);

        //RETORNA O TOPO DA ARVORE
        System.out.println(capitais.first());

        //RETORNA O FIM DA ARVORE
        System.out.println(capitais.last());

        //RETORNA O PRIMEIRO OBJETO E REMOVE O MESMO APOS A APRESENTAÇÃO
        System.out.println(capitais.pollFirst());
        System.out.println(capitais);

        //RETORNA O ULTIMO OBJETO E REMOVE O MESMO APOS A APRESENTAÇÃO
        System.out.println(capitais.pollLast());
        System.out.println(capitais);

        //APRESENTA O OBJETO ABAIXO DO OBJETO ESPECIFICADO
        System.out.println(capitais.lower("Natal"));

        //APRESENTA O OBJETO ACIMA DO OBJETO ESPECIFICADO
        System.out.println(capitais.higher("Natal"));

        //PERCORRE A ARVORE INTEIRA
        for (String objeto : capitais) {
            System.out.printf("Capital: %s\n",objeto);
        }
    }
}
