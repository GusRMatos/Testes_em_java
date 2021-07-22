package Banco.Jdbc;

//CONEXÃO COM BANCO  DE DADOS

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoFactory {

    //CONSTRUTOR PRIVADO EVITANTO PROBLEMAS
    private ConexaoFactory(){
        throw new UnsupportedOperationException();
    }

    public static java.sql.Connection getConnection(){

        //DECLARAÇÃO DO OBJETO  CONEXÃO
        Connection connection = null;

        //CARREGA O ARQUIVO PROPERTIES PARA RECEBER OS DADOS
        try (InputStream input = ConexaoFactory.class.getClassLoader().getResourceAsStream
                ("Chavesconexao.properties")){

            //DEFINI OS PARAMETROS
            Properties prop = new Properties();
            prop.load(input);

            //RECEBE OS PARAMETROS DO ARQUIVO PROPERTIES
            String driver = prop.getProperty("jdbc.driver");
            String databaseadress = prop.getProperty("db.adress");
            String databasename = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            //CONSTROI A STRING DE CONEXAO

            String ConnectionUrl = "jdbc:" +
                    driver + "://" +
                    databaseadress + "/" +
                    databasename;

            //CRIA CONEXÃO ATRAVES DO DRIVER MANAGER
            try {
                connection = DriverManager.getConnection(ConnectionUrl, user, password);
            }catch (SQLException e){
                System.out.println("FALHA AO CRIAR CONEXÃO");
                throw new RuntimeException(e);
            }

        }catch (IOException e){
            System.out.println("FALHA AO TENTAR CARREGAR ARQUIVOS DE CONEXÃO");
            e.printStackTrace();
        }
        return connection;
    }
}
