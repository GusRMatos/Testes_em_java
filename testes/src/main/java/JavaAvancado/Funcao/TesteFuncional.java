package JavaAvancado.Funcao;

import java.util.Arrays;

public class TesteFuncional {

    public static void main(String[] args) {
        //Função com lambda que encontra numeros pares em um array os multiplica por 2 e printa o resultado
        //Array
        int[] valores = {1,2,3,4,5,6,7,8};

        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
