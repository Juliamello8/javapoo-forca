package com.github.juliamello8.classes;

import java.util.Scanner;

import com.github.juliamello8.programa.Programa;

public class Temas extends Programa {

	public static int score = 0;

	public void mostrarTemas() {


		int optema;

		Scanner seltema = new Scanner(System.in);


		System.out.println("\n\n### Escolha um tema: ###");
		System.out.println("\n=========================");
		System.out.println("|1 - Esportes		|");
		System.out.println("|2 - Filmes / Séries	|");
		System.out.println("|3 - Partes do Corpo	|");
		System.out.println("|4 - Lugares		|");
		System.out.println("|5 - Músicas		|");
		System.out.println("=========================\n");



		do {
			System.out.println("Opção: ");
			optema = seltema.nextInt();

			switch (optema) {
			case 1: 
				Esportes esp = new Esportes();
				esp.newEsportes();
				return;
			case 2:
				FilmesSeries filmse = new FilmesSeries();
				filmse.newFilmes();
				return;
			case 3:
				PartesCorpo pdc = new PartesCorpo();
				pdc.newPartCorp();
				return;
			case 4:
				Lugares lug = new Lugares();
				lug.newLugares();
				return;
			case 5:
				Musicas mus = new Musicas();
				mus.newMusicas();
				return;
			default:
				System.out.println("Opção Inválida!");
				return;
			} 
		} while (optema != 0); 
	}	
}