package DesafiodeCodigo;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double
        double rain;
        double area;

        //continue a solucao

        rain = scan.nextDouble();
        area = 3.14159 * (Math.pow(rain ,2));

        System.out.printf("A=%.4f\n", area);
        }
    }

