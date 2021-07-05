package JavaBasico.Operadores;

public class Relacionais {

    public static void main(String[] args){

        final var condicao1 = 0;

        //condição de maior que
        if (condicao1 > 0){
            System.out.println("O valor é maior zero");
        }
        else{
            System.out.println("O valor é menor que zero");
        }

        //condição de menor que
        if (condicao1 < 0){
            System.out.println("O valor é menor zero");
        }
        else{
            System.out.println("O valor é maior que zero");
        }
    }
}
