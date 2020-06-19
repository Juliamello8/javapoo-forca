package com.github.juliamello8.classes;

import java.util.Scanner;

import com.github.juliamello8.programa.Programa;

public class Registrar extends Programa {
	private String nome;
	private String login;
	private String senha;
	private int idade;
	private int telefone;
	private String city;
	private String estado;
	private int cartao;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade; 
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getCartao() {
		return cartao;
	}
	public void setCartao(int cartao) {
		this.cartao = cartao;
	}
	
	public void lerUsuario() {
		try (Scanner leitor = new Scanner(System.in)) {			
			System.out.println ("Digite um login: ");
			login = leitor.nextLine(); 
			
			System.out.println ("Senha: ");
			senha = leitor.nextLine(); 
			
			System.out.println ("Digite seu nome: ");
			nome = leitor.nextLine(); 

			System.out.println ("Idade: ");
			idade = Integer.parseInt(leitor.nextLine()); ; 

			System.out.println ("Telefone: ");
			telefone = Integer.parseInt(leitor.nextLine()); 

			System.out.println ("Cidade: ");
			city = leitor.nextLine();

			System.out.println ("Estado: ");
			estado = leitor.nextLine(); 
			
			System.out.println ("Informe o n�mero do seu cart�o de cr�dito: ");
			cartao = Integer.parseInt(leitor.nextLine());
			
		} 
	} 	
		public void inserirUsuario() {
		SQLDatabaseConnection.registrar(this);
	}
	
}

