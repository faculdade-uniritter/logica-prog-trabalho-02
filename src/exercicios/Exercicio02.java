package exercicios;

import java.util.Scanner;

/*

02 � Fa�a um algoritmo que leia um valor inteiro e informe se este valor �
maior do que 10 ou n�o.


*/

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int valor1;

		System.out.println("Digite um n�mero:");
		valor1 = leia.nextInt();
		leia.close();

		if (valor1 > 10)
			System.out.println("O n�mero digitado � maior do que 10 ");
		else
			System.out.println("O n�mero digitado � igual ou menor do que 10 ");
	}

}
