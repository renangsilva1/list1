package list1;

import java.util.Scanner;

public class quest4 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;

		System.out.println("Digite sua primeira nota: ");
		nota1 = z.nextDouble();

		System.out.println("Digite sua segunda nota: ");
		nota2 = z.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Você foi aprovado, sua média final é: " + media);

		}else {
			System.out.println("Você foi reprovado, sua média final é: " + media);
		}

		z.close();
	}

}