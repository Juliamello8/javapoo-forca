package com.github.juliamello8.programa;

import java.util.Scanner;

import com.github.juliamello8.classes.ExibirPerfil;
import com.github.juliamello8.classes.Login;
import com.github.juliamello8.classes.Registrar;
import com.github.juliamello8.classes.Regras;
import com.github.juliamello8.classes.SQLDatabaseConnection;
import com.github.juliamello8.classes.Temas;

public class Programa {
	
		public static void telainicial() {
			System.out.println("\n=========================");
			System.out.println("|   1 - Registrar	|");
			System.out.println("|   2 - Fazer Login	|");
			System.out.println("=========================\n");
		}
		
		
		public static void menu() {
			System.out.println("### MENU: ###");
			System.out.println("\n=========================");
			System.out.println("|   1 - Exibir Perfil	|");
			System.out.println("|   2 - Temas		|");
			System.out.println("|   3 - Regras		|");
			System.out.println("|   4 - Sair		|");
			System.out.println("=========================\n");
		}
	
	public static void main(String[] args) {
		
		int inicio;
		int opcao;
		
		Registrar eu = new Registrar();
		
		try (Scanner entrada = new Scanner(System.in)) {
			telainicial();
			System.out.println("Op��o: ");
			inicio = entrada.nextInt();
			boolean reg = false;
			switch (inicio) {
			    case 1:
					eu.lerUsuario();
					eu.inserirUsuario();
					reg = true;
				break;
			    case 2:
			    	Login eu2 = new Login();
					eu2.lerLogin();
					eu2.Logar();
				break;
			    default:
					System.out.println("Op��o Inv�lida!");
			}
			if (reg) {
				telainicial();
			} else {
			
				do {
					menu();
					System.out.println("Op��o: ");
			        opcao = entrada.nextInt();
				
					switch (opcao) {
					case 1:
						ExibirPerfil ep = new ExibirPerfil();
						ep.verPerfil(eu);
						break;
					case 2:
						Temas t = new Temas();
						t.mostrarTemas();
						break;
					case 3:
						Regras r = new Regras();
						r.mostrarRegras();
						break;
					case 4:
						//COLOCAR CONDI��O PARA SAIR//
						if (Temas.score > 30) {
							System.out.print("\n\t Obrigado por jogar. Volte sempre!");
							/*EXIT*/
						}else {
							System.out.println("\n\t N�o foi poss�vel sair. S� pode sair se a pontua��o for maior que 30!");							
						}
						break;
					default:
						System.out.println("Op��o Inv�lida!");
					}
				} while (opcao != 0);
			}
		}
	}
	
}