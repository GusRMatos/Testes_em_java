package Operadores;

public class Condicionais {

    public static void main(String[] args) {

        //condicionais simples
        final var condicao = true;

        if (condicao) {
            System.out.println("Mostra o valor se a confição for verdadeira");
            System.out.println("Verdadeiro !");
        } else {
            System.out.println("Mostra o valor se a confição for falsa");
            System.out.println("Falso !");
        }

        // Ternario onde se faz a verificação de duas condições em uma unica constante
        final var ternario = condicao ? "Verdadeiro ! " : "Falso !";

        System.out.println(ternario);

        //Exemplo de operadores

        final var condicao1 = 0;
        final var condicao2 = "A";

        // condição de igualdade com inteiro
        if (condicao1 == 0) {
            System.out.println("O valor é zero");
        }
        else if(condicao1 == 1){
            System.out.println("O valor é um");
        }
        else {
            System.out.println("O valor não é zero");
        }

        // condição de igualdade com String
        if("A".equals(condicao2)){
            System.out.println("A string é A");
        }
        else if("B".equals(condicao2)){
            System.out.println("A string é B");
        }
        else{
            System.out.println("A string é diferente");
        }

        //confição de diferente com inteiro
        if(condicao1 != 1){
            System.out.println("O valor nao é um");
        }
        else {
            System.out.println("O valor é um");
        }
    }
}
