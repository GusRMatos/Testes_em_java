package JavaBasico.Lacos;

public class While {

    public static void main(String[] args){

        var x = 0;

        while (x <= 10){
            System.out.println("X = " + x);
            x ++;
        }

        do{
            System.out.println("X = " + x);
            x ++;
        }while (x <= 20);
    }
}
