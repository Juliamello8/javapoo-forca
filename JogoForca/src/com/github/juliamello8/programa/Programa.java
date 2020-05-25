package com.github.juliamello8.programa;

import com.github.juliamello8.classes.Menu;
import com.github.juliamello8.classes.Registrar;

public class Programa {
	
	public static void main(String[] args) {
		
		Registrar eu = new Registrar();
		eu.RegristrarUsuario() ;
		Menu m = new Menu();
		m.setCodMenu(1);
		
	}
	
}