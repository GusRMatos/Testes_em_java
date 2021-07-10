package JavaAvancado.Funcao;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        //Lambda que estipula a operação
        Calculo Soma = Integer::sum;
        Calculo Subtracao = (a, b) -> a - b;
        Calculo Multiplicacao = (a, b) -> a * b;
        Calculo Divisao = (a , b) -> a / b;


        //Saida do calculo
        System.out.printf("Soma: %s\n",ExecutaOperacao(Soma, 4, 5));
        System.out.printf("Subtração: %s\n",ExecutaOperacao(Subtracao, 14, 5));
        System.out.printf("Multiplicação: %s\n",ExecutaOperacao(Multiplicacao, 3, 3));
        System.out.printf("Divisão: %s\n",ExecutaOperacao(Divisao, 27, 3));
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
