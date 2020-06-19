package com.github.juliamello8.classes;

import java.util.Scanner;

public class Login extends Registrar {
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		if(login.length() != 0) {
			this.login = login;
		} else {
			System.out.println ("Campo vazio, favor preencher!");
		}
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha.length() != 0) {
			this.senha = senha;			
		} else {
			System.out.println ("Campo vazio, favor preencher!");
		}
	}
	
	public void lerLogin() {
		try (Scanner leitor = new Scanner(System.in)) {			
			System.out.println ("Login: ");
			login = leitor.nextLine(); 
			
			System.out.println ("Senha: ");
			senha = leitor.nextLine(); 
		} 
	}
	public void Logar() {
		
		if (SQLDatabaseConnection.login(getLogin(), getSenha()) != null){
			System.out.println("Login realizado com sucesso!");	
			
		} else {
			System.out.println("Usuário ou senha incorreto(s)!");	
		}
		
	}
	
	public void verLogin() {
		System.out.print("Seu login é: " + getLogin());
		System.out.print("\nSua senha é: " + getSenha());
	}
	
}