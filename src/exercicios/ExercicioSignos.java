package exercicios;
import java.util.Scanner;

public class ExercicioSignos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int mes, dia;

		System.out.println("Digite o dia que voc� nasceu: ");
		dia = leia.nextInt();

		System.out.println("Digite o m�s que voc� nasceu: ");
		mes = leia.nextInt();

		switch (mes) {
		case 1:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Capric�rnio");
			else if (dia >= 21 && dia <= 31)
				System.out.println("Signo de Aqu�rio");
			else
				System.out.println("inv�lido");
			break;

		case 2:
			if (dia >= 1 && dia <= 19)
				System.out.println("Signo de Aqu�rio");
			else if (dia >= 20 && dia <= 29)
				System.out.println("Signo de Peixes");
			else
				System.out.println("inv�lido");
			break;

		case 3:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Peixes");
			else if (dia >= 21 && dia <= 31)
				System.out.println("Signo de �ries");
			else
				System.out.println("inv�lido");
			break;

		case 4:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de �ries");
			else if (dia >= 21 && dia <= 30)
				System.out.println("Signo de Touro");
			else
				System.out.println("inv�lido");
			break;

		case 5:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Touro");
			else if (dia >= 21 && dia <= 31)
				System.out.println("Signo de G�meos");
			else
				System.out.println("inv�lido");
			break;

		case 6:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de G�meos");
			else if (dia >= 21 && dia <= 30)
				System.out.println("Signo de C�ncer");
			else
				System.out.println("inv�lido");
			break;

		case 7:
			if (dia >= 1 && dia <= 21)
				System.out.println("Signo de C�ncer");
			else if (dia >= 22 && dia <= 31)
				System.out.println("Signo de Le�o");
			else
				System.out.println("inv�lido");
			break;

		case 8:
			if (dia >= 1 && dia <= 22)
				System.out.println("Signo de Le�o");
			else if (dia >= 23 && dia <= 31)
				System.out.println("Signo de Virgem");
			else
				System.out.println("inv�lido");
			break;

		case 9:
			if (dia >= 1 && dia <= 22)
				System.out.println("Signo de Virgem");
			else if (dia >= 23 && dia <= 30)
				System.out.println("Signo de Libra");
			else
				System.out.println("inv�lido");
			break;

		case 10:
			if (dia >= 1 && dia <= 22)
				System.out.println("Signo de Libra");
			else if (dia >= 23 && dia <= 31)
				System.out.println("Signo de Escorpi�o");
			else
				System.out.println("inv�lido");
			break;

		case 11:
			if (dia >= 1 && dia <= 21)
				System.out.println("Signo de Escorpi�o");
			else if (dia >= 22 && dia <= 30)
				System.out.println("Signo de Sagit�rio");
			else
				System.out.println("inv�lido");
			break;

		case 12:
			if (dia >= 1 && dia <= 21)
				System.out.println("Signo de Sagit�rio");
			else if (dia >= 22 && dia <= 31)
				System.out.println("Signo de Capric�rnio");
			else
				System.out.println("inv�lido");
			break;

		}

	}

}
