package exercicios;

import java.util.Scanner;

/*

06 � Fa�a um algoritmo que l� um valor inteiro e retorna se este � um valor
Par Positivo, Par Negativo, �mpar Positivo, �mpar Negativo ou Nulo.


*/

public class Exercicio06 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		int valor = leia.nextInt();
		leia.close();

		if (valor % 2 == 0 && valor > 0) {
			System.out.println("O n�mero digitado � par positivo");
		} else if (valor % 2 == 0 && valor < 0) {
			System.out.println("O n�mero digitado � par negativo");
		} else if (valor % 2 != 0 && valor > 0) {
			System.out.println("O n�mero digitado � �mpar positivo");
		} else if (valor % 2 != 0 && valor < 0) {
			System.out.println("O n�mero digitado � �mpar negativo");
		} else {
			System.out.println("O n�mero digitado � nulo");

		}

	}

}
