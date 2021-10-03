package exercicios;
import java.util.Scanner;

public class ExercicioSignos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int mes, dia;

		System.out.println("Digite o dia que você nasceu: ");
		dia = leia.nextInt();

		System.out.println("Digite o mês que você nasceu: ");
		mes = leia.nextInt();

		switch (mes) {
		case 1:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Capricórnio");
			else if (dia >= 21 && dia <= 31)
				System.out.println("Signo de Aquário");
			else
				System.out.println("inválido");
			break;

		case 2:
			if (dia >= 1 && dia <= 19)
				System.out.println("Signo de Aquário");
			else if (dia >= 20 && dia <= 29)
				System.out.println("Signo de Peixes");
			else
				System.out.println("inválido");
			break;

		case 3:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Peixes");
			else if (dia >= 21 && dia <= 31)
				System.out.println("Signo de Áries");
			else
				System.out.println("inválido");
			break;

		case 4:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Áries");
			else if (dia >= 21 && dia <= 30)
				System.out.println("Signo de Touro");
			else
				System.out.println("inválido");
			break;

		case 5:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Touro");
			else if (dia >= 21 && dia <= 31)
				System.out.println("Signo de Gêmeos");
			else
				System.out.println("inválido");
			break;

		case 6:
			if (dia >= 1 && dia <= 20)
				System.out.println("Signo de Gêmeos");
			else if (dia >= 21 && dia <= 30)
				System.out.println("Signo de Câncer");
			else
				System.out.println("inválido");
			break;

		case 7:
			if (dia >= 1 && dia <= 21)
				System.out.println("Signo de Câncer");
			else if (dia >= 22 && dia <= 31)
				System.out.println("Signo de Leão");
			else
				System.out.println("inválido");
			break;

		case 8:
			if (dia >= 1 && dia <= 22)
				System.out.println("Signo de Leão");
			else if (dia >= 23 && dia <= 31)
				System.out.println("Signo de Virgem");
			else
				System.out.println("inválido");
			break;

		case 9:
			if (dia >= 1 && dia <= 22)
				System.out.println("Signo de Virgem");
			else if (dia >= 23 && dia <= 30)
				System.out.println("Signo de Libra");
			else
				System.out.println("inválido");
			break;

		case 10:
			if (dia >= 1 && dia <= 22)
				System.out.println("Signo de Libra");
			else if (dia >= 23 && dia <= 31)
				System.out.println("Signo de Escorpião");
			else
				System.out.println("inválido");
			break;

		case 11:
			if (dia >= 1 && dia <= 21)
				System.out.println("Signo de Escorpião");
			else if (dia >= 22 && dia <= 30)
				System.out.println("Signo de Sagitário");
			else
				System.out.println("inválido");
			break;

		case 12:
			if (dia >= 1 && dia <= 21)
				System.out.println("Signo de Sagitário");
			else if (dia >= 22 && dia <= 31)
				System.out.println("Signo de Capricórnio");
			else
				System.out.println("inválido");
			break;

		}

	}

}
