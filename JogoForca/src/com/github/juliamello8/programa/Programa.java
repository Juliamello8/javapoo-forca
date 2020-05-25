package com.github.juliamello8.programa;

import com.github.juliamello8.classes.Menu;
import com.github.juliamello8.classes.Registrar;

public class Programa {
	
	public static void main(String[] args) {
		
		Registrar eu = new Registrar();
		eu.RegristrarUsuario() ;
		
		Menu exibirPerfil = new Menu();
		exibirPerfil.setCodMenu(1);
		Menu temas = new Menu();
		temas.setCodMenu(2);
		Menu regras = new Menu();
		regras.setCodMenu(3);
	}
	
}