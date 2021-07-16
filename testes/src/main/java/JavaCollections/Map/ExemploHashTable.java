package JavaCollections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        //INSTANCIA UM HASHTABLE COM CHAVE VALOR
        Hashtable<String, Integer> pessoa = new Hashtable<>();

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("------------------------------------------------------\n");

        //INSERE OS DADOS NO HASHTABLE COM CHAVE VALOR
        pessoa.put("Gustavo", 23);
        pessoa.put("Italo", 13);
        pessoa.put("Albert", 31);
        pessoa.put("João", 21);
        pessoa.put("Pedro", 69);
        pessoa.put("Ana", 12);

        System.out.println(msg + pessoa);

        //ATUALIZA VALOR DA CHAVE
        pessoa.put("Gustavo", 24);
        System.out.println(msg + pessoa);

        //RETORNA O VALOR ATRAVES DA SUA CHAVE
        System.out.println(msg + pessoa.get("Italo"));

        //VERIFICA SE UMA DETERMINADA CHAVE EXISTE NO MAP
        System.out.println(msg + pessoa.containsKey("Ana"));

        //VERIFICA SE UM DETERMINADO EXISTE NO MAP
        System.out.println(msg + pessoa.containsValue(24));

        //REMOVE UMA CHAVE DO MAP
        pessoa.remove("Pedro");
        System.out.println(msg + pessoa);

        //RETORMA O TAMANHO DO MAP
        System.out.println(msg + pessoa.size());

        //PERCORRE O MAP
        for (String key : pessoa.keySet()) {
            System.out.println(msg + key + "---" + pessoa.get(key));
        }

        //REMOVE TODOS OS OBJETOS DO MAP
        pessoa.clear();
        System.out.println(msg + pessoa);
    }
}
