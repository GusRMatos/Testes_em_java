package Banco.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    //SELECT DO BANCO
    public List<Aluno> list(){

        //VARIAVEL PARA ORGANIZAR SAIDA
        final String msg = ("\n------------------------------------------------------\n");

        //CRIA A LISTA PRA RECEBER OS DADOS
        List<Aluno> alunos = new ArrayList<>();

        try (Connection conn = ConexaoFactory.getConnection()){

            //FAZ O SELECT NO BANCO
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM aluno;");

            ResultSet rs = stat.executeQuery();

            //INDICA A COLUNA E APRESENTA OS DADOS
            while (rs.next()){
                System.out.printf("%sId: %d\n",msg,rs.getInt("id"));
                System.out.printf("Nome: %s\n",rs.getString("nome"));
                System.out.printf("Idade: %d\n",rs.getInt("idade"));
                System.out.printf("Estado: %s%s\n",rs.getString("estado"),msg);
            }

         //APRESENTA SE OCORRER FALHA
        }catch (SQLException e){
            System.out.println("LISTAGEM DE ALUNOS FALHOU");
            e.printStackTrace();
        }
        return alunos;
    }

    //SELECT DE OBJETO ESPECIFICO
    public static Aluno getById(int id){

        //VARIAVEL PARA ORGANIZAR SAIDA
        final String msg = ("\n------------------------------------------------------\n");

        //CRIA NOVO OBJETO
        Aluno aluno = new Aluno();

        //FAZ O INPUT NO BANCO
        try (Connection conn = ConexaoFactory.getConnection()){
            String sql = "SELECT * FROM aluno WHERE id = ?";

            //PREPARA O INDEX PARA ESTIPULAR O PARAMETRO
            PreparedStatement  stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);

            //EXECUTA A QUERY
            ResultSet rs = stmt.executeQuery();

            //APRESENTA OS DADOS DO BANCO
            if (rs.next()){
                System.out.printf("Id: %d\n",rs.getInt("id"));
                System.out.printf("Nome: %s\n",rs.getString("nome"));
                System.out.printf("Idade: %d\n",rs.getInt("idade"));
                System.out.printf("Estado: %s%s\n",rs.getString("estado"),msg);
            }
         //APRESENTA SE HOUVER ERRO
        }catch (SQLException e){
            System.out.println("LISTAGEM DE ALUNOS FALHOU");
            e.printStackTrace();
        }

        //RETORNA O ALUNO
        return aluno;
    }

    //INSERÇÃO
    public void create(Aluno aluno){

        //FAZ O INPUT NO BANCO E CRIA OS PARAMETROS PARA RECEBER OS DADOS
        try(Connection conn = ConexaoFactory.getConnection()){
            String sql = "INSERT INTO aluno(id, nome, idade, estado) VALUES (?, ?, ?, ?)";

            //CRIA O METODO PARA RECEBER OS DADOS
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1,aluno.getId());
            stat.setString(2, aluno.getNome());
            stat.setInt(3,aluno.getIdade());
            stat.setString(4, aluno.getEstado());

            int rowsAffect = stat.executeUpdate();

            //APRESENTA SE OCORREU TUDO CERTO
            System.out.println("INSERÇÃO BEM SUCEDIDA " + rowsAffect + " linha");

         //APRESENTA SE OCORREU ERRO
        }catch (SQLException e){
            System.out.println("INSERÇÃO FALHOU");
            e.printStackTrace();
        }
    }

    //DELETE
    public void delete(int id){
        try (Connection conn = ConexaoFactory.getConnection()) {
            String sql = "DELETE FROM aluno WHERE id = ?";

            //PREPARA O INDEX PARA ESTIPULAR O PARAMETRO
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int rowsAffect = stmt.executeUpdate();

            //APRESENTA SE OCORREU TUDO CERTO
            System.out.println("DELETE BEM SUCEDIDO " + rowsAffect + " linha");

         //APRESENTA SE OCORREU ERRO
        }catch (SQLException e){
            System.out.println("DELETE FALHOU");
            e.printStackTrace();
        }
    }

    //ATUALIZAÇÂO
    public void atualiza(Aluno aluno){

        //FAZ O INPUT NO BANCO E PREPARA A STRING PARA RECEBER OS PARAMETROS
        try(Connection conn = ConexaoFactory.getConnection()){
            String sql = "UPDATE aluno SET id = ?, nome = ?, idade = ?, estado = ? WHERE id = ?";

            //CRIA O METODO QUE FAZ A INCERSAO DOS DADOS NA STRING
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1,aluno.getId());
            stat.setString(2, aluno.getNome());
            stat.setInt(3,aluno.getIdade());
            stat.setString(4, aluno.getEstado());
            stat.setInt(5,aluno.getId());

            int rowsAffect = stat.executeUpdate();

            //APRESENTA SE OCORREU TUDO CERTO
            System.out.println("ATUALIZAÇÂO BEM SUCEDIDA " + rowsAffect + " linha");

         //APRESENTA SE OCORREU ERRO
        }catch (SQLException e){
            System.out.println("ATUALIZAÇÂO FALHOU");
            e.printStackTrace();
        }
    }

}
