package exercicios;

import java.util.Scanner;

/*

07 – Fazer um programa que leia o nome e as duas notas de um aluno
juntamente com sua frequência. Informe se o aluno está aprovado ou
reprovado sabendo que a média mínima de aprovação é 6 e que a frequência
mínima de aprovação é 7.5


*/

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		String nome = leia.nextLine();

		System.out.println("Digite a nota 1:");
		double n1 = leia.nextDouble();

		System.out.println("Digite a nota 2:");
		double n2 = leia.nextDouble();

		System.out.println("Digite a % da frequência:");
		double freq = leia.nextDouble();
		leia.close();

		double media = (n1 + n2) / 2;

		if (media >= 6 && freq >= 7.5)
			System.out.println(nome + " foi APROVADO!");
		else
			System.out.println(nome + " foi REPROVADO!");
	}

}
