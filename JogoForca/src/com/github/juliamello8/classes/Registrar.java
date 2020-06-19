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
	private Integer cartao;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(login.length() != 0) {
			this.nome = nome;			
		} else {
			System.out.println ("Campo vazio, favor preencher!");
		}
	}
	
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
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 1 && idade < 100) {
			this.idade = idade; 			
		} else {
			System.out.println ("Idade inválida ou campo vazio!");
		}
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		if(Integer.toString(telefone).length() > 11 && Integer.toString(telefone).length() < 10) {
			this.telefone = telefone;			
		} else {
			System.out.println ("Número inválido ou campo vazio!");
		}
	}
	
	public String getCity() {
		return city;			
	}
	public void setCity(String city) {
		if (city != null) {
			this.city = city;			
		} else {
			System.out.println ("Campo vazio, favor preencher!");
		}
		
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if (estado != null) {
			this.estado = estado;			
		} else {
			System.out.println ("Campo vazio, favor preencher!");
		}
	}
	
	public Integer getCartao() {
		return cartao;
	}
	public void setCartao(Integer cartao) {
		if (Integer.toString(cartao).length() == 16) {
			this.cartao = cartao;			
		} else {
			System.out.println ("Número inválido ou campo vazio!");
		}
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

			System.out.println ("Telefone (com DDD): ");
			telefone = Integer.parseInt(leitor.nextLine()); 

			System.out.println ("Cidade: ");
			city = leitor.nextLine();

			System.out.println ("Estado: ");
			estado = leitor.nextLine(); 
			
			System.out.println ("Informe o número do seu cartão de crédito: ");
			cartao = Integer.parseInt(leitor.nextLine());
			
		} 
	} 	
		public void inserirUsuario() {
		SQLDatabaseConnection.registrar(this);
	}
	
}

