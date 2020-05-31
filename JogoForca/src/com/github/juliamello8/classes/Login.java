package com.github.juliamello8.classes;

public class Login extends Registrar {
	
	public void verLogin() {
		System.out.print("Seu login é: " + getLogin());
		System.out.print("\nSua senha é: " + getSenha());
	}
	
}