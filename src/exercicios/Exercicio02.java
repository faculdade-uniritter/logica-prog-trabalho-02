package exercicios;

import java.util.Scanner;

/*

02 – Faça um algoritmo que leia um valor inteiro e informe se este valor é
maior do que 10 ou não.


*/

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int valor1;

		System.out.println("Digite um número:");
		valor1 = leia.nextInt();
		leia.close();

		if (valor1 > 10)
			System.out.println("O número digitado é maior do que 10 ");
		else
			System.out.println("O número digitado é igual ou menor do que 10 ");
	}

}
