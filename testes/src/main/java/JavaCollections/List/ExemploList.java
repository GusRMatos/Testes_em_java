package JavaCollections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        //DECLARAÇÃO DA LISTA
        List<String> nomes = new ArrayList<>();

        //INSERÇÃO DOS DADOS NA LISTA
        nomes.add("Jessica");
        nomes.add("Paula");
        nomes.add("Roberta");
        nomes.add("Vitoria");
        nomes.add("Pedro");
        nomes.add("Paulo");
        nomes.add("José");
        nomes.add("Manoel");

        System.out.println(nomes);

        //INSERE UM DADO NUMA POSIÇÃO SOBREPONDO O DADO EXISTENTE
        nomes.set(4, "Barbara");

        //ORDENAÇÃO DA LISTA EM ORDEM ALFABETICA
        Collections.sort(nomes);
        System.out.println(nomes);

        //REMOVE DADO PELO INDICE
        nomes.remove(3);
        System.out.println(nomes);

        //REMOVE DADO PELO NOME
        nomes.remove("Paula");
        System.out.println(nomes);

        //RETORNA O TAMANHO DA LISTA
        int tamanho = nomes.size();
        System.out.println(tamanho);

        //BUSCA UM DADO PELO SEU INDICE
        String nome =nomes.get(4);
        System.out.println(nome);

        //BUSCA UM DADO PELO SEU NOME E RETORNA UM BOOLEANO;
        boolean contemnome = nomes.contains("Vitoria");
        System.out.println(contemnome);

        //INFORMA SE A LISTA ESTA VAZIA ATRAVES DE UM BOOLEANO
        boolean tavazio = nomes.isEmpty();
        System.out.println(tavazio);

        //RETORNA O INDICE DE UM DADO DE ACORDO COM SEU NOME;
        int posicao = nomes.indexOf("Barbara");
        System.out.println(posicao);
        
        // FOREACH PERCORRE A LISTA E INTERAGE COM OS DADOS
        for (String dado : nomes) {
            System.out.println("Nome: " + dado);
        }

        //APAGA TODOS OS DADOS DA LISTA
        nomes.clear();
        boolean vazio = nomes.isEmpty();
        System.out.println(vazio);

    }
}
