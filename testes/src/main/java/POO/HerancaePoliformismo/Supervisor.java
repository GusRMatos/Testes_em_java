package POO.HerancaePoliformismo;

public class Supervisor extends Funcionario{

    //Classe filha de Funcionario

    //Calculo com porsentagem para Supervisor
    public double CalculaImposto(){
        return this.getSalario() * 0.05;
    }
}
