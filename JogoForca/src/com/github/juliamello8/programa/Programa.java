package com.github.juliamello8.programa;

import java.util.Scanner;

import com.github.juliamello8.classes.Login;
import com.github.juliamello8.classes.Menu;

public class Programa {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String login;
		System.out.println ("Login: ");
		login = leitor.nextLine(); 
		Login eu = new Login();
		eu.setLogin(login);
		
		String senha;
		System.out.println ("Senha: ");
		senha = leitor.nextLine(); 
		eu.setSenha(senha);
		
		eu.verLogin();
		Menu m = new Menu();
		m.setCodMenu(1);
		
	}
	
}