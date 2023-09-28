package list1;

import java.util.Scanner;

public class quest6 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		double valor1;
		double valor2;

		System.out.println("Digite o priemeiro valor: ");
		valor1 = z.nextDouble();

		System.out.println("Digite o segundo valor: ");
		valor2 = z.nextDouble();

		if(valor1 > valor2) {
			System.out.println(valor1);
		}else {
			System.out.println(valor2);

		}

		z.close();
	}

}