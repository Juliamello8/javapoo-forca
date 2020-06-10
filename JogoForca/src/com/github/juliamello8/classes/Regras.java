package com.github.juliamello8.classes;

import com.github.juliamello8.programa.Programa;

public class Regras extends Programa {

	public void mostrarRegras() {
		System.out.print("\n###REGRAS DO JOGO###\nPrimeiramente o jogador só pode acessar aos temas e ao jogo se estiver logado com seu cadastro.\nO jogo permite que o usuário cometa até 9 erros, sendo o 10 erro a última parte do corpo desenhada e o fim de jogo (game over).\nSó é permitida a inserção de uma letra por jogada.\nAlém disso, as jogadas são individuais, ou seja, não é possível dois ou mais usuários interagirem em uma mesma partida.\r\n" + 
				"Após três acertos, ou seja, depois da terceira letra correta da palavra, o jogador tem direito de dar um palpite sobre a palavra.\nSe o jogador errar o palpite perde a partida. Cada acerto de letra o jogador adquire um ponto e só é permitido o logout do usuário após completar 30 pontos, isto é, a opção “sair do jogo” só será visível ao cliente após esta condição ser concluída.\n\n");
	}
}
