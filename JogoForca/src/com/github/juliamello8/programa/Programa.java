package com.github.juliamello8.programa;

import java.util.Scanner;

import com.github.juliamello8.classes.ExibirPerfil;
import com.github.juliamello8.classes.Login;
import com.github.juliamello8.classes.Registrar;
import com.github.juliamello8.classes.Regras;
import com.github.juliamello8.classes.Temas;

public class Programa {

	public static int inicio;
	public static boolean reg = false;
	public static boolean entrou = false;
	public static Registrar eu = new Registrar();

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

	public static Integer selecaoInicial (Scanner entrada) {
		telainicial();
		System.out.println("Opção: ");
		return Integer.parseInt(entrada.nextLine());
	}

	public static void casos (Scanner entrada) {
		switch (inicio) {
		case 1:
			eu.lerUsuario();
			eu.inserirUsuario();
			reg = true;
			break;
		case 2:
			Login eu2 = new Login();
			eu2.lerLogin(entrada);
			entrou = eu2.Logar(eu2.getLogin(), eu2.getSenha());
			break;
		default:
			System.out.println("Opção Inválida!");
		}
	}

	public static void main(String[] args) {

		int opcao;
		try (Scanner entrada = new Scanner(System.in)){
			while (!entrou) {
				inicio = selecaoInicial(entrada);

				casos(entrada);
			}	do {

				menu();
				System.out.println("Opção: ");
				opcao = Integer.parseInt(entrada.nextLine());
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
					if (Temas.score > 30) {
						System.out.print("\n\t Obrigado por jogar. Volte sempre!");
						System.exit(0);
					}else {
						System.out.println("\n\t Não foi possível sair. Só pode sair se a pontuação for maior que 30!");							
					}
					break;
				default:
					System.out.println("Opção Inválida!");
				}
			} while (opcao != 0);
		}
	}
}
