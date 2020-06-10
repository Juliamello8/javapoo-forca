package com.github.juliamello8.classes;

import java.util.Scanner;

import com.github.juliamello8.programa.Programa;

public class Temas extends Programa {

	public void mostrarTemas() {
			
		int optema;
		
			System.out.println("\n\n### Escolha um tema: ###");
			System.out.println("\n=========================");
			System.out.println("|1 - Esportes		|");
			System.out.println("|2 - Filmes / Séries	|");
			System.out.println("|3 - Partes do Corpo	|");
			System.out.println("|4 - Lugares		|");
			System.out.println("|5 - Músicas		|");
			System.out.println("=========================\n");
			
			Scanner seltema = new Scanner(System.in);
			
			do {
				mostrarTemas();
				System.out.println("Opção: ");
	            optema = seltema.nextInt();
	            
			switch (optema) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
				}
			} while (optema != 0); 
	}	
}