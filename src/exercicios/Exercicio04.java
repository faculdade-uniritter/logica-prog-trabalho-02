package exercicios;

import java.util.Scanner;

/*

04- Fa�a um algoritmo que leia um valor real qualquer e o classifique como
positivo ou negativo.Trate o n�mero zero como positivo.


*/

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int valorA;

		System.out.println("Digite um n�mero:");
		valorA = leia.nextInt();

		leia.close();

		if (valorA >= 0)
			System.out.println("O n�mero digitado � positivo");
		else
			System.out.println("O n�mero digitado � negativo");
	}

}
