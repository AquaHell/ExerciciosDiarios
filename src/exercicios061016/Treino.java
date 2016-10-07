package exercicios061016;

import java.util.Scanner;

public class Treino {
	Scanner sc = new Scanner(System.in);
	Build Clube = new Build();
	String nome = "";
	int pontosCasa;
	int pontosFora;
	int numJogos;

	public Treino() {
		System.out.println(exercicio2());
		exercicio3();
	}

	private void exercicio1() {
		int pontosLeixoes = 45;
		int pontosFeirense = 76;
		int pontosPorto = 33;
		int pontosAves = 67;
	}

	private int exercicio2() {
		int pontosFora[] = { 45, 76, 33, 67 };
		System.out.println("Posicao 3 tem o valor: " + pontosFora[2]);
		int soma = 0;
		for (int i = 0; i < pontosFora.length; i++) {
			soma += pontosFora[i];
		}
		return soma;
	}

	private void exercicio3() {
		System.out.println("Nome do Clube");
		nome = sc.next();
		Clube.setNome(nome);
 
		System.out.println("Pontos em Casa do Clube");
		pontosCasa = sc.nextInt();
		Clube.setPontosCasa(pontosCasa);

		System.out.println("Pontos Fora do Clube");
		pontosFora = sc.nextInt();
		Clube.setPontosFora(pontosFora);

		System.out.println("Numero de jogos do Clube");
		numJogos = sc.nextInt();
		Clube.setNumJogos(numJogos);

		System.out.println("Nome do Clube: " + Clube.getNome() + " / Pontos em Casa: " + Clube.getPontosCasa() 
			+ " / Pontos Fora: " + Clube.getPontosFora() + " / Numero de Jogos jogados: " + Clube.getNumJogos());

	}

}
