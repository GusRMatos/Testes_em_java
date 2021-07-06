package JavaAvancado.Fatorial;

public class Recursividade {

    public static void main(String[] args) {

        System.out.println(fatorial(10));

    }
    public static int fatorial ( int valor){
        if (valor == 1) {
            return valor;
        }
        else {
            return valor * fatorial(valor - 1);
        }
    }
}