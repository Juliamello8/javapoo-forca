package com.github.juliamello8.classes;

public class Regras extends Menu{
	int codMenu = 3;

	public void mostrarRegras() {
		System.out.print("\n REGRAS DO JOGO: Primeiramente o jogador s� pode acessar aos temas e ao jogo se estiver logado com seu cadastro. O jogo permite que o usu�rio cometa at� 9 erros, sendo o 10 erro a �ltima parte do corpo desenhada e o fim de jogo (game over). S� � permitida a inser��o de uma letra por jogada. Al�m disso, as jogadas s�o individuais, ou seja, n�o � poss�vel dois ou mais usu�rios interagirem em uma mesma partida.\r\n" + 
				"Ap�s tr�s acertos, ou seja, depois da terceira letra correta da palavra, o jogador tem direito de dar um palpite sobre a palavra. Se o jogador errar o palpite perde a partida. Cada acerto de letra o jogador adquire um ponto e s� � permitido o logout do usu�rio ap�s completar 30 pontos, isto �, a op��o �sair do jogo� s� ser� vis�vel ao cliente ap�s esta condi��o ser conclu�da.");
	}
}
