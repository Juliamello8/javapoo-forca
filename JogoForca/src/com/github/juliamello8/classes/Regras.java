package com.github.juliamello8.classes;

import com.github.juliamello8.programa.Programa;

public class Regras extends Programa {

	public void mostrarRegras() {
		System.out.print("\n###REGRAS DO JOGO###\nPrimeiramente o jogador s� pode acessar aos temas e ao jogo se estiver logado com seu cadastro.\nO jogo permite que o usu�rio cometa at� 9 erros, sendo o 10 erro a �ltima parte do corpo desenhada e o fim de jogo (game over).\nS� � permitida a inser��o de uma letra por jogada.\nAl�m disso, as jogadas s�o individuais, ou seja, n�o � poss�vel dois ou mais usu�rios interagirem em uma mesma partida.\r\n" + 
				"\nCada acerto de letra o jogador adquire um ponto e s� � permitido o logout do usu�rio ap�s completar 30 pontos, isto �, a op��o �sair do jogo�\ns� ser� vis�vel ao cliente ap�s esta condi��o ser conclu�da.\n\n");
	}
}
