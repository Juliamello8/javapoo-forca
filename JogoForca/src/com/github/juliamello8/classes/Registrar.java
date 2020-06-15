package com.github.juliamello8.classes;

import java.util.Scanner;

import com.github.juliamello8.programa.Programa;

public class Registrar extends Programa {
	private static String nome;
	private static String login;
	private String senha;
	private static int idade;
	private int telefone;
	private static String city;
	private static String estado;
	private static int cartao;

	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Registrar.nome = nome;
	}
	
	public static String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		Registrar.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public static int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		Registrar.idade = idade; 
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Registrar.city = city;
	}
	
	public static String getEstado() {
		return estado;
	}
	public static void setEstado(String estado) {
		Registrar.estado = estado;
	}
	
	public int getCartao() {
		return cartao;
	}
	public void setCartao(int cartao) {
		Registrar.cartao = cartao;
	}
	
	public void RegristrarUsuario() {
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println ("Digite um login: ");
			login = leitor.nextLine(); 
			Login usuario = new Login();
			usuario.setLogin(Registrar.login);
			
			System.out.println ("Senha: ");
			senha = leitor.nextLine(); 
			usuario.setSenha(this.senha);
			
			System.out.println ("Digite seu nome: ");
			nome = leitor.nextLine(); 
			Registrar.setNome(Registrar.nome);
			
			System.out.println ("Idade: ");
			idade = leitor.nextInt() ; 
			usuario.setIdade(Registrar.idade);
			
			System.out.println ("Telefone: ");
			telefone = leitor.nextInt(); 
			usuario.setTelefone(this.telefone);
			
			System.out.println ("Cidade: ");
			city = leitor.nextLine();
			Registrar.setCity(Registrar.city);
			
			System.out.println ("Estado: ");
			estado = leitor.nextLine(); 
			Registrar.setEstado(Registrar.estado);
			
			System.out.println ("Informe o número do seu cartão de crédito: ");
			cartao = leitor.nextInt();
			usuario.setCartao(Registrar.cartao);
		}
	}
}

