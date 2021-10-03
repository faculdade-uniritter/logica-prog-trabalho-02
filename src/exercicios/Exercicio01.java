package exercicios;
import java.util.Scanner;

/*

1) Faça um algoritmo que leia um número do tipo inteiro e imprima na tela
esse valor somente se ele for maior que 50.

*/

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número:");
		int num = leia.nextInt();
		
		leia.close();

		if (num > 50)
			System.out.println("O número digitado foi: " + num);
	}

}
