package Banco.Jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//DECLARA QUE A CLASSE FAZ REFERENCIA A UMA TABELA NO BANCO DE DADOS
@Entity
public class Estado {

    //DECLARA QUE O OBJETO É UM ID E QUE BUSCA O VALOR AUTOMATICO DO BANCO
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //DECLARA QUE ESSE OBJETO É UMA COLUNA NO BANCO E QUE NAO PODE SER NULA
    @Column(nullable = false)
    private String nome;

    //DECLARA QUE ESSE OBJETO É UMA COLUNA NO BANCO E QUE NAO PODE SER NULA
    @Column(nullable = false)
    private String sigla;

    //DECLARA QUE ESSE OBJETO PODE RECEBER DIVERSOS OBJETOS COMO REFERENCIA A ELE
    @OneToMany(
            mappedBy = "estado",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    //LISTA PARA RECEBER OS ALUNOS QUE REFEREM AO OBJETO ESTADO
    private List<Aluno> alunos = new ArrayList<>();

    //METODO ESTADO VAZIO
    public Estado(){ }

    //METODO ESTADO COM NOME E SIGLA
    public Estado(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    //METODO ESTADO COM NOME SIGLA E ALUNO
    public Estado(String nome, String sigla, List<Aluno> alunos){
        this.nome = nome;
        this.sigla = sigla;
        this.alunos = alunos;
    }

}
