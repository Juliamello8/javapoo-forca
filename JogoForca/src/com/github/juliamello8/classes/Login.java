package com.github.juliamello8.classes;

public class Login extends Registrar {
	
	public void verLogin() {
		System.out.print("Seu login �: " + getLogin());
		System.out.print("\nSua senha �: " + getSenha());
	}
	
}