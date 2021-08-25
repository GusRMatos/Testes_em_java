package DesafiodeCodigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Desafio
//       Crie um programa que leia 6 valores. Você poderá receber valores negativos
//       e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida
//       , apresente a quantidade de valores positivos digitados.

//Entrada
//      Você receberá seis valores, negativos e/ou positivos.

//Saída
//      Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido
//      abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

public class Quantidade_de_Numeros_Positivos {
    public static void main(String[] args) throws IOException {
        String array;
        Double transformanum;
        int positivos, cont;

        positivos = 0;
        cont = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(cont < 6){
            array = br.readLine();
            transformanum = Double.parseDouble(array);
            if(transformanum > 0.0){
                positivos++;
            }
            cont++;
        }
        System.out.println("" + positivos + " valores positivos");
    }
}