package JavaCollections.Optional;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("------------------------------------------------------\n");

        //CRIA O OPTIONAL OF
        Optional<String> optionalString = Optional.of(msg + "Valor Opcional");
        optionalString.ifPresent(System.out::println);

        //APRESENTA SE O OPTIONAL TA VAZIO OU PRESENTE E RETORNA BOOLEANO
        System.out.println(msg + optionalString.isPresent());








    }
}
