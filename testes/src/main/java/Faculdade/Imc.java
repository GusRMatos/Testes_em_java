package Faculdade;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

//      Requisitos do sistema
//      Calcular o imc de um usuario atraves do calculo de massa/(altura * altura)
//      Informar o imc ao usuario e se ele esta em situação de magreza, normal, sobrepeso ou obesidade

        float Weight, height;
        Scanner reader = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        Weight = reader.nextFloat();
        System.out.println("Informe sua altura: ");
        height = reader.nextFloat();

        float bmi = Weight / (height * height);

        System.out.println(bmi);

        if (bmi < 18.5){
            System.out.printf("seu imc foi: %.2f e você esta em situação de magreza",bmi);
        }
        else if (bmi > 18.5 && bmi < 24.9){
            System.out.printf("seu imc foi: %.2f e você esta em situação normal",bmi);
        }
        else if (bmi > 24.9 && bmi < 30){
            System.out.printf("seu imc foi: %.2f e você esta em situação de sobrepeso",bmi);
        }
        else {
            System.out.printf("seu imc foi: %.2f e você esta em situação de obesidade",bmi);
        }
    }
}
