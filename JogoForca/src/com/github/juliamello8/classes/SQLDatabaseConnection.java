package com.github.juliamello8.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLDatabaseConnection {
	
	public static String connectionUrl =
			"jdbc:sqlserver://localhost:1433;"
	                + "database=db_JogoForca;"
	                + "integratedSecurity=true;";
	
	public static String login(String usuario, String senha){
		
        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {
    		System.out.print("Conectado!");
            // Create and execute a SELECT SQL statement.
            String selectSql = "select * from Pessoa";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } return null;
	}
	public static String registrar(Registrar usuario){
		
       ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            StringBuilder insert = new StringBuilder();
            insert.append("insert into Pessoa (");
            insert.append("nome,");
            insert.append("usuario,");
            insert.append("senha,");
            insert.append("idade,");
            insert.append("telefone,");
            insert.append("city,");
            insert.append("estado,");
            insert.append("cartao");            
            insert.append(") values (");
            insert.append("'"+usuario.getNome()+"',");
            insert.append("'"+usuario.getLogin()+"',");
            insert.append("'"+usuario.getSenha()+"',");
            insert.append("'"+usuario.getIdade()+"',");
            insert.append("'"+usuario.getTelefone()+"',");
            insert.append("'"+usuario.getCity()+"',");
            insert.append("'"+usuario.getEstado()+"',");
            insert.append("'"+usuario.getCartao());
            insert.append("')");
            System.out.println(insert.toString());
            statement.executeUpdate(insert.toString());
  
        } catch (SQLException e) {
            e.printStackTrace();
        } return null;
	}
	public static String login(Login usuario){
		
       ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            StringBuilder insert = new StringBuilder();
            insert.append("select ");
            insert.append(usuario.getLogin());
            insert.append(" from Usuario");
            System.out.println(insert.toString());
            statement.executeUpdate(insert.toString());
  
        } catch (SQLException e) {
            e.printStackTrace();
        } return null;
	}
}