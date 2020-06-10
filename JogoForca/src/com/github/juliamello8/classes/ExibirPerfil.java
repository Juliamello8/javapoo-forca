package com.github.juliamello8.classes;

import com.github.juliamello8.programa.Programa;

public class ExibirPerfil extends Programa {
	public void verPerfil() {
		System.out.println("##### Seus dados: #####");
        System.out.println("Nome: "+ Registrar.getNome());
        System.out.println("Login: "+ Registrar.getLogin());
        System.out.println("Idade: " + Registrar.getIdade());
        System.out.println("Cidade: " + Registrar.getCity());
        System.out.println("Estado: " + Registrar.getEstado());
        System.out.println("Score: "/*Aqui vai o score*/);
	}
}
