package DesafiodeCodigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QtdeNumerosPositivos {
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