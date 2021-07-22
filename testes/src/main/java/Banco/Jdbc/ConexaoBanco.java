package Banco.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static void main(String[] args) throws SQLException {

        //URL DE CONEXÃO COM O BANCO
        String URLConnection = "jdbc:postgresql://localhost/CursoJdbc";

        //TRY QUE FAZ A CONEXÃO E PRINTA SUCESSO
        try (Connection conecta = DriverManager.getConnection(URLConnection, "postgres", "12345")){
            System.out.println("Sucesso!");
        }
        //CATCH QUE INFORMA SE HOUVER UM ERRO
        catch (Exception e){
            System.out.println("Falha!");
        }
    }
}
