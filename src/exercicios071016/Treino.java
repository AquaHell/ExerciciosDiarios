package exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	public Treino() {
		exercicio1();
		exercicio2();
		exercicio3();
	}

	private void exercicio1() {

		System.out.println("Introduza o Primeiro Numero");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o Segundo Numero");
		int num2 = (new Scanner(System.in)).nextInt();

		if (num1 > num2) {
			System.out.println("O Primeiro numero eh o maior");
		} else
			System.out.println("O Segundo numero eh o maior");
	}

	private void exercicio2() {

		System.out.println("Introduza o Primeiro Numero");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o Segundo Numero");
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o Terceiro Numero");
		int num3 = (new Scanner(System.in)).nextInt();

		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println("O Primeiro numero eh o maior");
			} else {
				System.out.println("O Terceiro numero eh o maior");
			}
		}
		if (num2 >= num1) {
			if (num2 >= num3) {
				System.out.println("O Segundo numero eh o maior");
			} else {
				System.out.println("O Terceiro numero eh o maior");
			}
		}

	}

	private void exercicio3() {
		int limite = 5;
		int rand = (new Random()).nextInt(limite);
		int num = 0;

		for (int i = 1; i <= limite; i++) {
			System.out.println("Escolha um numero entre 1 a 5");
			num = (new Scanner(System.in).nextInt());
			if (num == rand) {
				System.out.println("Acertou no numero na " + i + " Tentativa");
				break;
			} else {
				System.out.println("Falhou \nTry Again \nAinda tem "+(limite-i)+" Tentativas");
			}
		}

	}
}
