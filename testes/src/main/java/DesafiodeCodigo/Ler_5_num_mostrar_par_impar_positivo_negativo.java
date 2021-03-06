package DesafiodeCodigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Desafio
//      Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados
//      são pares, quantos valores informados são ímpares, quantos valores informados são positivos e
//      quantos valores informados são negativos.

//Entrada
//      Você receberá 5 valores inteiros.

//Saída
//      Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo
//      o final de linha após cada uma.

public class Ler_5_num_mostrar_par_impar_positivo_negativo {

    public static void main(String[] args) throws IOException {
//declare suas variaveis corretamente
        String line;
        int Pos = 0, Neg = 0, Pair = 0, odd = 0, num = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//continue a solução
        for (int i = 0; i < 5; i++) {
            line = br.readLine();
            num = Integer.parseInt(line);

            if (num % 2 == 0) {
                Pair++;
            } else {
                odd++;
            }

            if (num > 0) Pos++;
            if (num < 0) Neg++;
        }
//insira suas variaveis corretamente
        System.out.println(Pair +" valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(Pos + " valor(es) positivo(s)");
        System.out.println(Neg + " valor(es) negativo(s)");
    }
}
