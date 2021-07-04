package Operadores;

public class Logicos {

    public static void main(String[] args){

        final var numero = 2;
        final var letra = "A";

        if (numero == 2 && letra.equals("A")){
            System.out.println("O valor numero é igua a 2 e a string letra é A");
        }
        else if(numero != 2 && letra.equals("A")){
            System.out.println("O valor numero é diferente de 2 e a string letra é A");
        }
        else {
            System.out.println("Os valores São diferentes");
        }

    }
}
