package Banco.Jpa;

import javax.persistence.*;

public class Execucao {

    public static void main(String[] args) {

        //CRIA GERENCIAMENTO DE ENTIDADES COM O BANCO ESPECIFICADO NO XML
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aulajpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //CRIA INSTANCIAS PARA ADICIONAR AO BANCO DE DADOS
        Estado adicionarestado = new Estado("RIO de Janeiro", "RJ");
        Aluno adicionaraluno = new Aluno("Paula", 20, adicionarestado);

        //INICIA A TRANSAÇÃO PARA ADICIONAR AS INSTANCIAS AO BANCO
        entityManager.getTransaction().begin();

        entityManager.persist(adicionarestado);
        entityManager.persist(adicionaraluno);

        entityManager.getTransaction().commit();

        //BUSCA ENTIDADE NO BANCO
        Estado Encontraestado = entityManager.find(Estado.class, 1);
        Aluno Encontraaluno = entityManager.find(Aluno.class, 1);

        //ALTERA UMA ENTIDADE
        entityManager.getTransaction().begin();

        Encontraaluno.setNome("Paula");
        Encontraaluno.setIdade(19);

        entityManager.getTransaction().commit();

        //REMOVE UMA ENTIDADE
        entityManager.getTransaction().begin();

        entityManager.remove(Encontraaluno);

        entityManager.getTransaction().commit();

        //ENCERRA O GERENCIADOR DE ENTIDADES
        entityManager.close();
        entityManagerFactory.close();

    }
}
