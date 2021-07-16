package JavaCollections.Map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        //INICIALIZA A TREEMAP
        TreeMap<String, String> capitalestado = new TreeMap<>();

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("-------------------------------------------------------------------\n");

        //INSERE OS DADOS NO TREEMAP COM CHAVE VALOR
        capitalestado.put("PA", "Belém");
        capitalestado.put("MT", "Curitiba");
        capitalestado.put("MG", "Belo Horizonte");
        capitalestado.put("SE", "Aracaju");
        capitalestado.put("BA", "Salvador");
        capitalestado.put("SP", "São Paulo");


        System.out.println(msg + capitalestado);

        //RETORNA O TOPO DA ARVORE
        System.out.println(msg + capitalestado.firstKey());

        //RETORNA O FIM DA ARVORE
        System.out.println(msg + capitalestado.lastKey());

        //APRESENTA O OBJETO ABAIXO DO OBJETO ESPECIFICADO
        System.out.println(msg + capitalestado.lowerKey("Natal"));

        //APRESENTA O OBJETO ACIMA DO OBJETO ESPECIFICDO
        System.out.println(msg + capitalestado.higherKey("Natal"));

        //RETORNA O OBJETO NO TOPO DA ARVORE
        System.out.println(msg + capitalestado.firstEntry().getKey() + "--" + capitalestado.firstEntry().getValue());

        //RETORNA O OBJETO NO FIM DA ARVORE
        System.out.println(msg + capitalestado.lastEntry().getKey() + "--" + capitalestado.lastEntry().getValue());

        //RETORNA A PRIMEIRA CHAVE VALOR ABAIXO DO VALOR INDICADO
        System.out.println(msg + capitalestado.lowerEntry("PA").getKey() + "--"
                + capitalestado.lowerEntry("PA").getValue());

        //RETORNA A PRIMEIRA CHAVE VALOR ABAIXO DO VALOR INDICADO
        System.out.println(msg + capitalestado.higherEntry("PA").getKey() + "--"
                + capitalestado.higherEntry("PA").getValue());

        //MOSTRA O PRIMEITO OBJETO DA ARVORE E REMOVE O MESMO DA LISTA
        Map.Entry<String, String> firstEntry = capitalestado.pollFirstEntry();
        System.out.println(msg + firstEntry.getKey() + "--" + firstEntry.getValue());
        System.out.println(capitalestado);

        //MOSTRA O ULTIMO OBJETO DA ARVORE E REMOVE O MESMO DA LISTA
        Map.Entry<String, String> lastEntry = capitalestado.pollLastEntry();
        System.out.println(msg + lastEntry.getKey() + "--" + lastEntry.getValue());
        System.out.println(capitalestado);

        //PERCORRE A ARVORE
        for (String capital : capitalestado.keySet()) {
            System.out.println(msg + capital + "--" + capitalestado.get(capital));
        }

        //LIMPA A ARVORE
        capitalestado.clear();
        System.out.println(msg + capitalestado);


    }
}