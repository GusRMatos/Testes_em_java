package JavaCollections.Optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivo {

    public static void main(String[] args) {

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("------------------------------------------------------\n");

        //OPTIONAL COM NUMERO INTEIRO
        System.out.println(msg + "Valor Inteiro Opcional");
        OptionalInt.of(12).ifPresent(System.out::println);

        //OPTIONAL COM NUMERO DECIMAL
        System.out.println(msg + "Valor Decimal Optional");
        OptionalDouble.of(15.12).ifPresent(System.out::println);

        //OPTIONAL COM LONG
        System.out.println(msg + "Valor Long Optional");
        OptionalLong.of(13L).ifPresent(System.out::println);
    }
}
