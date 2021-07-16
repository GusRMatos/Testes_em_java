package JavaCollections.Comparators;

public class Funcionario implements Comparable<Funcionario>{

    private final String nome;
    private final Integer idade;

    public Funcionario(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    @Override
    public String toString(){
        return nome + "--" + idade;
    }

    @Override
    public int compareTo(Funcionario o){
        return this.getIdade() - o.getIdade();
    }

}
