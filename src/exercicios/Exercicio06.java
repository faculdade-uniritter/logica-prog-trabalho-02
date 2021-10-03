package exercicios;

import java.util.Scanner;

/*

06 – Faça um algoritmo que lê um valor inteiro e retorna se este é um valor
Par Positivo, Par Negativo, Ímpar Positivo, Ímpar Negativo ou Nulo.


*/

public class Exercicio06 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número:");
		int valor = leia.nextInt();
		leia.close();

		if (valor % 2 == 0 && valor > 0) {
			System.out.println("O número digitado é par positivo");
		} else if (valor % 2 == 0 && valor < 0) {
			System.out.println("O número digitado é par negativo");
		} else if (valor % 2 != 0 && valor > 0) {
			System.out.println("O número digitado é ímpar positivo");
		} else if (valor % 2 != 0 && valor < 0) {
			System.out.println("O número digitado é ímpar negativo");
		} else {
			System.out.println("O número digitado é nulo");

		}

	}

}
