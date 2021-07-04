package Datas.Localdatetime;

import java.time.LocalDateTime;

public class Manipulandodatas {

    public static void main(String[] args) {

        //RECEBE A DATA ESPECIFICADA
        LocalDateTime data = LocalDateTime.of(2010,5,15,10,0,0);

        //DA A SAIDA DA DATA E HORA
        System.out.printf("Data e horario inicial: %s\n",data);

        //SOMA OS VALORES ESPECIFICADOS NA DATA ANTERIOR
        LocalDateTime futuro = data.plusYears(4).minusMonths(6).plusHours(13);

        //DA A SAIDA DA DATA E HORA
        System.out.printf("Data e horario apos o acrescimo %s",futuro);
    }
}
