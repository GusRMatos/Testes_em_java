package DesafiodeCodigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tartaruga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            int index = Integer.parseInt(sc.nextLine());
            List<Integer> turtle = new ArrayList<>();
            String[] tt = new String[index];
            String aux = sc.nextLine();
            tt = aux.split(" ");

            for(int i=0 ; i<index ; i++)

                turtle.add(Integer.parseInt(tt[i]));
            Collections.sort(turtle);
            Collections.reverse(turtle);

            if(turtle.get(0)>=20){
                System.out.println("3");
            }
            else if(turtle.get(0)<20 && turtle.get(0)>=10){
                System.out.println("2");
            }
            else{
                System.out.println("1");
            }
        }
        sc.close();
    }
}
