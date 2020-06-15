package com.github.juliamello8.classes;

import java.util.Random;
import java.util.Scanner;

public class FilmesSeries extends Temas {
	
	public void newFilmes() {
		
		Random random = new Random();
		
		Scanner in = new Scanner (System.in);
			
		String [] palavras = {"FRIENDS", "HARRY-POTTER", "PIRATAS-DO-CARIBE", "SENHOR-DOS-ANEIS", "SABRINA", 
				"STRANGER-THINGS", "LA-CASA-DE-PAPEL", "TITANIC", "GAME-OF-THRONES", "HOW-TO-GET-AWAY-WITH-MURDER"};

		int score = 0;
		int quantPalavras = palavras.length;
		int indiceSorteado = random.nextInt(quantPalavras); 
		String sorteada = palavras[indiceSorteado];
		
		char[] acertos = new char[sorteada.length()];
		for (int i = 0; i < acertos.length; i++) { 		acertos[i] = 0;
			
			if (sorteada.charAt(i) == '-')
				acertos[i] = 1;
		}
		
		String letrasUtilizadas = "";
		
		char letra;
		boolean ganhou = false;
		int vidas = 10;
		
		for (int i = 0; i < sorteada.length(); i++) {
				System.out.print(" _ ");
		}
		System.out.println("\n");
		
		
		do {
			System.out.println("\n"
					+ "Você tem " + vidas + " vidas"
					+ "\nLetras utilizadas " + letrasUtilizadas
					+ "\nQual letra você deseja tentar? ");
			letra = in.next().toUpperCase().charAt(0);
			letrasUtilizadas += " " + letra;
		
			boolean perdeVida = true;
			
			for (int i = 0; i < sorteada.length(); i++){
				if (letra == sorteada.charAt(i)){
					acertos[i] = 1;
					perdeVida = false;
					score ++;
				}
			}
			
			if (perdeVida)
				vidas--;
			
			System.out.println ("\n");
			ganhou = true;
		
			for (int i = 0; i < sorteada.length(); i++) {
				if (acertos[i] == 0) {
					System.out.print(" _ ");
					ganhou =  false;
				}
				else {
					System.out.print (" " + sorteada.charAt(i) + " ");
				}
			} 
			System.out.println ("\n");
		} while (!ganhou && vidas > 0);
		if (vidas != 0) {
		System.out.println ("\n\t***Parabéns, você acertou!!!***");
		} else {
			System.out.println ("\n\t***Tente novamente!!!***");
			System.out.println ("\n\t***A palavra era: " + sorteada + "***");
		}
	}
}