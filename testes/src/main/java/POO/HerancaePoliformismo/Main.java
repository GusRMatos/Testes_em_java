package POO.HerancaePoliformismo;

public class Main {

    public static void main(String[] args){

        //PROGRAMA

        //CRIAÇÃO DOS OBJETOS
        Funcionario funcionario = new Funcionario();
        Funcionario Gerente = new Gerente();
        Funcionario Supervisor = new Supervisor();
        Funcionario Atendente = new Atendente();

        //IMPLEMENTAÇÃO DOS ATRIBUTOS DE CADA OBJETO
        funcionario.SetCpf("001.002.003-04");
        funcionario.SetNome("Gustavo");
        funcionario.SetSalario(2000);
        funcionario.SetIdade(23);

        Gerente.SetCpf("005.006.007-08");
        Gerente.SetNome("Albert");
        Gerente.SetSalario(4000);
        Gerente.SetIdade(20);

        Supervisor.SetCpf("009.010.011-12");
        Supervisor.SetNome("Jefrey");
        Supervisor.SetSalario(1800);
        Supervisor.SetIdade(34);

        Atendente.SetCpf("013.014.015-16");
        Atendente.SetNome("Mary");
        Atendente.SetSalario(1100);
        Atendente.SetIdade(18);

        //SAIDA FORMATADA DO SISTEMA
        System.out.printf("\nCargo: Funcionario\nNome: %s\nCpf: %s\nIdade: %d\nSalario: R$%d\nTaxa de Imposto: R$%.2f\n",
                funcionario.getNome(),funcionario.getCpf(),funcionario.getIdade(),
                funcionario.getSalario(),funcionario.CalculaImposto());

        System.out.printf("\nCargo: Gerente\nNome: %s\nCpf: %s\nIdade: %d\nSalario: R$%d\nTaxa de Imposto: R$%.2f\n",
                Gerente.getNome(),Gerente.getCpf(),Gerente.getIdade(),
                Gerente.getSalario(),Gerente.CalculaImposto());

        System.out.printf("\nCargo: Supervisor\nNome: %s\nCpf: %s\nIdade: %d\nSalario: R$%d\nTaxa de Imposto: R$%.2f\n",
                Supervisor.getNome(),Supervisor.getCpf(),Supervisor.getIdade(),
                Supervisor.getSalario(),Supervisor.CalculaImposto());

        System.out.printf("\nCargo: Atendente\nNome: %s\nCpf: %s\nIdade: %d\nSalario: R$%d\nTaxa de Imposto: R$%.2f\n",
                Atendente.getNome(),Atendente.getCpf(),Atendente.getIdade(),
                Atendente.getSalario(),Atendente.CalculaImposto());
    }
}
