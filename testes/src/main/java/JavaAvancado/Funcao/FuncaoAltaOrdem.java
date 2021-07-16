package JavaAvancado.Funcao;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        //Lambda que estipula a operação
        Calculo Soma = Integer::sum;
        Calculo Subtracao = (a, b) -> a - b;
        Calculo Multiplicacao = (a, b) -> a * b;
        Calculo Divisao = (a , b) -> a / b;

        //CONSTANTE PARA ORGANIZAR SAIDA
        final String msg = ("---------------------------------\n");


        //Saida do calculo
        System.out.printf("%sSoma: %s\n%s",msg,ExecutaOperacao(Soma, 4, 5),msg);
        System.out.printf("Subtração: %s\n%s",ExecutaOperacao(Subtracao, 14, 5),msg);
        System.out.printf("Multiplicação: %s\n%s",ExecutaOperacao(Multiplicacao, 3, 3),msg);
        System.out.printf("Divisão: %s\n%s",ExecutaOperacao(Divisao, 27, 3),msg);
    }

    //Função que recebe os parametros da interface e executa o calculo
    public static int ExecutaOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
}
//Interface que da o parametro do calculo
@FunctionalInterface
public interface Calculo{
    int calcular(int a, int b);
}
}
