package POO.HerancaePoliformismo;

public class Atendente extends Funcionario{

    //Classe filha de Funcionario

    //Calculo com porsentagem para Atendente
    public double CalculaImposto(){
        return this.getSalario() * 0.01;
    }
}
