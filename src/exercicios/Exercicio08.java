package exercicios;

import java.util.Scanner;

/*

08 � Ler a idade de uma pessoa e informar a sua classe eleitoral.
a. N�o-eleitor (abaixo de 16 anos)
b. Eleitor obrigat�rio (entre 18 e 65 anos)
c. Eleitor facultativo (entre 16 e 18 e maior de 65 anos)


*/

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua idade:");
		int idade = leia.nextInt();
		leia.close();

		if (idade <= 15)
			System.out.println("N�o-eleitor");
		else if (idade >= 18 && idade <= 65)
			System.out.println("Eleitor obrigat�rio");
		else
			System.out.println("Eleitor facultativo");

	}

}
