package JavaBasico.POO.HerancaePoliformismo;

import JavaBasico.POO.HerancaePoliformismo.Funcionario;

public class Gerente extends Funcionario {

    //Classe filha de Funcionario

    //Calculo com porsentagem para gerente
    public double CalculaImposto(){
        return this.getSalario() * 0.1;
    }
}
