package com.github.juliamello8.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import com.github.juliamello8.programa.Programa;

public class SQLDatabaseConnection {
	
	public String conectou;
	
	public static String connectionUrl =
			"jdbc:sqlserver://localhost:1433;"
	                + "database=db_JogoForca;"
	                + "integratedSecurity=true;";
	
	public static boolean login(String usuario, String senha){
		
		
        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            	String selectUser = "select * from Pessoa where usuario ='" + usuario +"' and senha = '"+ senha +"'";
            	resultSet = statement.executeQuery(selectUser);
            	while (resultSet.next()){
            		Programa.eu.setNome(resultSet.getString(2));
            		Programa.eu.setLogin(resultSet.getString(3));
            		Programa.eu.setIdade(resultSet.getInt(5));
            		Programa.eu.setCity(resultSet.getString(7));
            		Programa.eu.setEstado(resultSet.getString(8));
            		System.out.println ("Login realizado com Sucesso!");
            		return true;
            	}
           } 
        catch (SQLException e) {
            e.printStackTrace();
        } System.out.println ("Falha ao realizar Login!");
        return false;
	}
	public static String registrar(Registrar usuario){
		
       ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

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
            insert.append(usuario.getIdade()+",");
            insert.append("'"+usuario.getTelefone()+"',");
            insert.append("'"+usuario.getCity()+"',");
            insert.append("'"+usuario.getEstado()+"',");
            insert.append("'"+usuario.getCartao());
            insert.append("')");
            statement.executeUpdate(insert.toString());
  
        } catch (SQLException e) {
            e.printStackTrace();
        } return null;
	}

}