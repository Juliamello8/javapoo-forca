package com.github.juliamello8.classes;

import com.github.juliamello8.programa.Programa;

public class ExibirPerfil extends Programa {
	public void verPerfil(Registrar eu) {
		System.out.println("##### Seus dados: #####");
		System.out.println("Nome: "+ eu.getNome());
		System.out.println("Login: "+ eu.getLogin());
		System.out.println("Idade: " + eu.getIdade());
		System.out.println("Cidade: " + eu.getCity());
		System.out.println("Estado: " + eu.getEstado());
		System.out.println("Score: " + Temas.score);
	}
}
