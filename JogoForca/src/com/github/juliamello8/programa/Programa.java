package com.github.juliamello8.programa;

import java.util.Scanner;

import com.github.juliamello8.classes.ExibirPerfil;
import com.github.juliamello8.classes.Registrar;
import com.github.juliamello8.classes.Regras;
import com.github.juliamello8.classes.Temas;

public class Programa {
	
		public static void menu(){
			System.out.println("### MENU: ###");
			System.out.println("\n=========================");
			System.out.println("|   1 - Registrar	|");
			System.out.println("|   2 - Exibir Perfil	|");
			System.out.println("|   3 - Temas		|");
			System.out.println("|   4 - Regras		|");
			System.out.println("=========================\n");
		}
	
	public static void main(String[] args) {
		
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			menu();
			System.out.println("Opção: ");
            opcao = entrada.nextInt();
		
			switch (opcao) {
			case 1:
				Registrar eu = new Registrar();
				eu.RegristrarUsuario();
				break;
			case 2:
				ExibirPerfil ep = new ExibirPerfil();
				ep.verPerfil();
				break;
			case 3:
				Temas t = new Temas();
				t.mostrarTemas();
				break;
			case 4:
				Regras r = new Regras();
				r.mostrarRegras();
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		
	}
	
}