package com.github.juliamello8.programa;

import java.util.Scanner;

import com.github.juliamello8.classes.ExibirPerfil;
import com.github.juliamello8.classes.Login;
import com.github.juliamello8.classes.Registrar;
import com.github.juliamello8.classes.Regras;
import com.github.juliamello8.classes.Temas;

public class Programa {
	
		public static void telainicial() {
			System.out.println("\n=========================");
			System.out.println("|   1 - Registrar	|");
			System.out.println("|   2 - Fazer Login	|");
			System.out.println("=========================\n");
		}
		
		public static void menu(){
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
		
		Scanner entrada = new Scanner(System.in);
		
		telainicial();
		System.out.println("Opção: ");
        inicio = entrada.nextInt();
        switch (inicio) {
        case 1:
			Registrar eu = new Registrar();
			eu.regristrarUsuario();
		break;
        case 2:
        	Login eu2 = new Login();
			eu2.realizarLogin();
		break;
        default:
			System.out.println("Opção Inválida!");
		}
		
        menu();
		do {

			System.out.println("Opção: ");
            opcao = entrada.nextInt();
		
			switch (opcao) {
			case 1:
				ExibirPerfil ep = new ExibirPerfil();
				ep.verPerfil();
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
				System.out.println("Só pode sair se a pontuação for maior que 30!");
				break;
			default:
				System.out.println("Opção Inválida!");
			}
		} while (opcao != 0);
				
	}
	
}