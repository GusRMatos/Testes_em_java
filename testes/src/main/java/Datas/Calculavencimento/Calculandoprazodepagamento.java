package Datas.Calculavencimento;

import java.util.Calendar;
import java.util.Date;

public class Calculandoprazodepagamento {

    public static void main(String[] args) {

        //1 RECEBE DATA DE VENCIMENTO
        Calendar vencimento = Calendar.getInstance();
        vencimento.set(2013, Calendar.FEBRUARY, 28);
        Date data = vencimento.getTime();

        //2 SOMA 10 DIAS
        vencimento.add(Calendar.DATE, + 10);

        //3 VERIFICA SE PAGAMENTO CAI NO SABADO OU DOMINGO
        //4 SE CAIR NO SABADO SOMA DOIS DIAS
        if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            vencimento.add(Calendar.DATE, 2);
            System.out.printf("O vencimento caiu no sabado, seu pagamento pode ser feito no maximo ate o dia: %s"
                    ,vencimento.getTime());
        }
        //5 SE CAIR NO DOMINGO SOMA UM DIA
        else if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            vencimento.add(Calendar.DATE, 1);
            System.out.printf("O vencimento caiu no domingo, seu pagamento pode ser feito no maximo ate o dia: %s"
                    ,vencimento.getTime());
        }
        //SE NAO COBRA JUROS
        else {
            System.out.printf("Seu ultimo prazo antes do vencimento é hoje dia: %s",vencimento.getTime());
        }
    }
}
