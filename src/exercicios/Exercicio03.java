package exercicios;

import java.util.Scanner;

/*

03 � Fa�a um algoritmo que leia um valor inteiro e imprima se ele for par,
impar ou m�ltiplo de 8


*/

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int valorA;

		System.out.println("Digite um n�mero:");
		valorA = leia.nextInt();
		leia.close();

		if (valorA % 2 == 0)
			System.out.println("O n�mero digitado � par");
		if (valorA % 3 == 0)
			System.out.println("O n�mero digitado � impar");
		if (valorA % 8 == 0)
			System.out.println("O n�mero digitado � m�ltiplo de 8");

	}

}
