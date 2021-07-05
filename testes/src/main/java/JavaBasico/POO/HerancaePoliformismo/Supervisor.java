package JavaBasico.POO.HerancaePoliformismo;

import JavaBasico.POO.HerancaePoliformismo.Funcionario;

public class Supervisor extends Funcionario {

    //Classe filha de Funcionario

    //Calculo com porsentagem para Supervisor
    public double CalculaImposto(){
        return this.getSalario() * 0.05;
    }
}
