package Datas.Comparardatas;

import java.text.ParseException;

public class Descobrindosenasciantesde2010 {

    public static void main(String[] args) throws ParseException {

        //CALCULANDO MINHA DATA
        java.text.SimpleDateFormat minhadata = new java.text.SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataminha = minhadata.parse("11/10/1997");
        System.out.printf("Você nasceu em: %tF\n",dataminha);

        //CALCULANDO DATA DE REFERENCIA
        java.text.SimpleDateFormat referencia = new java.text.SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataref = referencia.parse("15/05/2010");
        System.out.printf("A data dada como referencia foi: %tF\n",dataref);

        //COMPARANDO DATAS
        int compara = dataminha.compareTo(dataref);

        //SAIDA DO SISTEMA
        if (compara >= 1){
            System.out.println("Você nasceu após a data de referencia");
        }
        else if(compara == 0){
            System.out.println("Você nasceu na data de referencia");
        }
        else{
            System.out.println("Você nasceu antes da data de referencia");
        }

    }
}
