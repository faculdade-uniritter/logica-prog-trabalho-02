package exercicios;
import java.util.Scanner;

/*

1) Fa�a um algoritmo que leia um n�mero do tipo inteiro e imprima na tela
esse valor somente se ele for maior que 50.

*/

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
		int num = leia.nextInt();
		
		leia.close();

		if (num > 50)
			System.out.println("O n�mero digitado foi: " + num);
	}

}
