package JavaCollections.Streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosStreamApi {

    public static void main(String[] args) {

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("------------------------------------------------------\n");

        //CRIA A COLEÇÃO DE PESSOAS
        List<String> pessoas = new ArrayList<>();

        pessoas.add("Gustavo");
        pessoas.add("Carlos");
        pessoas.add("Italo");
        pessoas.add("Marilene");
        pessoas.add("Beto");

        //RETORNA A CONTAGEM DE ELEMENTOS DA LISTA
        System.out.println(msg + "Quantidade: " + pessoas.stream().count());

        //RETORNA O ELEMENTO COM MAIOR NUMERO DE LETRAS DA LISTA
        System.out.println(msg + "Maior numero de letras: " + pessoas.stream().
                max(Comparator.comparing(String::length)));

        //RETORNA O ELEMENTO COM MENOR NUMERO DE LETRAS DA LISTA
        System.out.println(msg + "Menor numero de letras: " + pessoas.stream().
                min(Comparator.comparing(String::length)));

        //RETORNA OS ELEMENTOS QUE POSSUEM A LETRA ESPECIFICADA
        System.out.println(msg + "Possui letra r:" + pessoas.stream().filter((pessoa) ->
                pessoa.toLowerCase().contains("r")).collect(Collectors.toList()));

        //RETORNA OS OBJETOS COM SUA QUANTIDADE DE CARACTERES
        System.out.println(msg + "Nomes e quantidade de letras: " + pessoas.stream().map(pessoa ->
                pessoa.concat(" - ").concat(String.valueOf(pessoa.length()))).collect(Collectors.toList()));

        //RETORNA OS TRES PRIMEIROS OBJETOS
        System.out.println(msg + "Primeiros nomes: " + pessoas.stream().limit(3).collect(Collectors.toList()));

        //EXIBE CADA ELEMENTO SEPARADO DEPOIS A LISTA COMPLETA
        System.out.println(msg + "Retorna os elementos: " + pessoas.stream()
                .peek(System.out::println).collect(Collectors.toList()));

        //EXIBE OS ELEMENTOS SEM APRESENTAR A LISTA NO FIM
        System.out.println(msg + "Apresenta os elementos: ");
        pessoas.stream().forEach(System.out::println);

        //RETORNA TRUE SE TODOS OS OBJETOS POSSUIREM O CARACTERE ESPECIFICADO
        System.out.println(msg + "Todos possuem o caractere? " + pessoas.stream().allMatch((elemento) ->
                elemento.contains("e")));

        //RETORNA TRUE SE ALGUM DOS ELEMENTOS POSSUI A LETRA ESPECIFICADA NO NOME
        System.out.println(msg + "Possui a letra no nome? " + pessoas.stream().anyMatch((elemento) ->
                elemento.contains("a")));

        //RETORNA TRUE SE NENHUM ELEMENTO POSSUIR A LETRA ESPECIFICADA
        System.out.println(msg + "Não possui a letra no nome? " + pessoas.stream().noneMatch((elemento) ->
                elemento.contains("a")));

        //RETORNA O PRIMEIRO OBJETO DA COLEÇÃO
        System.out.println(msg + "Primeiro objeto: ");
        pessoas.stream().findFirst().ifPresent(System.out::println);


    }
}
