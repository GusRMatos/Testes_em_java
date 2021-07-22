package Banco.Jpql_Criteriaapi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Execucao {

    public static void main(String[] args) {

        //INSERÇÃO PARA TESTES
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aulajpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Estado Adicionaestado = new Estado("Pernanbuco", "PE");
        entityManager.persist(Adicionaestado);
        entityManager.persist(new Estado("São Paulo", "SP"));
        entityManager.persist(new Aluno("Debora",22,Adicionaestado));
        entityManager.persist(new Aluno("Jorge",21,Adicionaestado));
        entityManager.getTransaction().commit();

        String nome = "Jorge";

        //JPQL

        //FAZENDO BUSCA DE UM UNICO DADO
        String jpql = "select a from Aluno a Where a.nome = :nome";
        Aluno alunoJPQL = entityManager
                .createQuery(jpql, Aluno.class)
                .setParameter("nome",nome)
                .getSingleResult();
        System.out.println("CONSULTA ALUNOJPQL: " + alunoJPQL);

        //TRAZENDO LISTA COM RESULTADOS
        String jpqllist = "select a from Aluno a";
        List<Aluno> alunojpqllist = entityManager
                .createQuery(jpqllist, Aluno.class)
                .getResultList();
        alunojpqllist.forEach(Aluno -> System.out.println("CONSULTA ALUNOJPQLLIST: " + Aluno));

        //JPA CRITERIA API --- JPA METAMODEL

        //FAZENDO BUSCA DE UM UNICO DADO
        CriteriaQuery<Aluno> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(Aluno.class);
        Root<Aluno> alunoRoot = criteriaQuery.from(Aluno.class);
        CriteriaBuilder.In<String> inClause = entityManager.getCriteriaBuilder().in(alunoRoot.get(Aluno_.nome));
        inClause.value(nome);
        criteriaQuery.select(alunoRoot).where(inClause);
        Aluno alunoapicriteria = entityManager.createQuery(criteriaQuery).getSingleResult();
        System.out.println("Consulta aluno api criteria: " + alunoapicriteria);

        //TRAZENDO LISTA COM RESULTADOS
        CriteriaQuery<Aluno> criteriaQueryList = entityManager.getCriteriaBuilder().createQuery(Aluno.class);
        Root<Aluno> alunoRootlist = criteriaQueryList.from(Aluno.class);
        List<Aluno> alunoapicriterialist = entityManager.createQuery(criteriaQueryList).getResultList();
        alunoapicriterialist.forEach(Aluno -> System.out.println("Consulta aluno api criteria list: " + Aluno));

        entityManager.close();
        entityManagerFactory.close();

    }
}
