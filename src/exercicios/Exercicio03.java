package exercicios;

import java.util.Scanner;

/*

03 – Faça um algoritmo que leia um valor inteiro e imprima se ele for par,
impar ou múltiplo de 8


*/

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int valorA;

		System.out.println("Digite um número:");
		valorA = leia.nextInt();
		leia.close();

		if (valorA % 2 == 0)
			System.out.println("O número digitado é par");
		if (valorA % 3 == 0)
			System.out.println("O número digitado é impar");
		if (valorA % 8 == 0)
			System.out.println("O número digitado é múltiplo de 8");

	}

}
