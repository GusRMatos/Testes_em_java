package JavaBasico.POO.Metodos;

public class Carro {

    //Declaração do objeto
    public Carro(String marca,String nome,Integer ano){
        this.marca = marca;
        this.nome = nome;
        this.ano = ano;
    }

    //Declaração dos atributos
    private String marca;
    private String nome;
    private Integer ano;
    private String variante;

    //Declaração dos metodos
    //GETS
    public String getMarca(){
        return marca;
    }
    public String getNome(){
        return nome;
    }
    public Integer getAno(){
        return ano;
    }
    public String getVariante() {
        return variante;
    }

    //SETS
    public void SetMarca(String marca){
        this.marca = marca;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetAno(Integer ano){
        this.ano = ano;
    }
    public void setVariante(String variante) {
        this.variante = variante;
    }
}
