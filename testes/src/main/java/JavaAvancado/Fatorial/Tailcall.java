package JavaAvancado.Fatorial;

public class Tailcall {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static double fatorial(double valor){
        return fatorialtc(valor,1);
    }
    public static double fatorialtc(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialtc(valor - 1, numero * valor);

    }
}
