package POO.HerancaePoliformismo;

public class Funcionario {

    //CLASSE MÂE
    public Funcionario(){
    }

    //DECLARAÇÃO
    private Integer idade;
    private String nome;
    private Integer salario;
    private String cpf;

    //GETS
    public Integer getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public Integer getSalario(){
        return salario;
    }
    public String getCpf() {
        return cpf;
    }

    //SETS
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetSalario(Integer salario){
        this.salario = salario;
    }
    public void SetCpf(String cpf) {
        this.cpf = cpf;
    }
    public void SetIdade(Integer idade) {
        this.idade = idade;
    }
    public double CalculaImposto(){
        return this.salario * 0.001;
    }
}
