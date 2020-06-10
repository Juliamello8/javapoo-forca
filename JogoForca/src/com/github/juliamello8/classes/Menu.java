//package com.github.juliamello8.classes;
//
//import java.util.Scanner;
//
//import com.github.juliamello8.programa.Programa;
//
//public class Menu extends Programa {
//	public static void setCodMenu() {
//		
//		int opcao = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		do {		
//			setCodMenu();
//			System.out.println("\n\n	### MENU: ###");
//			System.out.println("\n=========================");
//			System.out.println("|   1 - Exibir Perfil	|");
//			System.out.println("|   2 - Temas		|");
//			System.out.println("|   3 - Regras		|");
//			System.out.println("|   4 - Sair		|");
//			System.out.println("=========================\n");
//			opcao = scan.nextInt();
//		
//			switch (opcao) {
//			case 1:
//				ExibirPerfil ep = new ExibirPerfil();
//				ep.verPerfil();
//				break;
//			case 2:
//				Temas t = new Temas();
//				t.mostrarTemas();
//				break;
//			case 3:
//				Regras r = new Regras();
//				r.mostrarRegras();
//				break;
////			case 4:
////				break;
//			default:
//				System.out.println("Opção Inválida!");
//				break;
//			
//			}
//		} while (opcao != 0);
//	}
//}

