package exercicios071016;

import java.util.Scanner;

public class Treino {
	public Treino() {
		exercicio1();
		exercicio2();
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

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("O Primeiro numero eh o maior");
			} else {
				System.out.println("O Terceiro numero eh o maior");
			}
		}
		if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("O Segundo numero eh o maior");
			} else {
				System.out.println("O Terceiro numero eh o maior");
			}
		}

	}

}
