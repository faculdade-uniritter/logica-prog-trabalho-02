package exercicios;

import java.util.Scanner;

/*

05 � Fa�a um algoritmo que leia um valor real qualquer e o classifique como
positivo, negativo ou nulo.


*/

public class Exercicio05_ {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int valorA;

		System.out.println("Digite um n�mero:");
		valorA = leia.nextInt();
		leia.close();

		if (valorA >= 0)
			System.out.println("O n�mero digitado � positivo");
		if (valorA < 0)
			System.out.println("O n�mero digitado � negativo");

	}
}
