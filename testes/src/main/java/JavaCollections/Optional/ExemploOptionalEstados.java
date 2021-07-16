package JavaCollections.Optional;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("------------------------------------------------------\n");

        //INICIALIZA O OPTIONAL PRESENTE
        Optional<String> optionalString = Optional.of("Valor Presente");
        System.out.println(msg + "Valor opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

        //INICIALIZA O OPTIONAL QUE NAO ESTA PRESENTE
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println(msg + "Valor opcional que nao esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = nao esta presente"));

        //VALOR OPTIONAL QUE NAO ESTA PRESENTE
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(msg + "Valor opcional que nao esta presente");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = nao esta presente"));

        //VALOR OPTIONAL QUE RETORNA ERRO NULLPOINTEREXEPTION
        Optional<String> optionalNullError = Optional.of(null);
        System.out.println(msg + "Valor opcional que retorna Erro de Exeption");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = nao esta presente"));
    }
}
