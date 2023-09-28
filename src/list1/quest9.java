package list1;

import java.util.Scanner;

public class quest9 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		double sh;
		double salario;
		int horas;

		System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
		horas = z.nextInt();

		System.out.println("Digite o valor pago pela sua hora de trabalho: ");
		sh = z.nextDouble();

		if(horas > 160) {
			salario = (horas - 160) * (sh * 0.5 + sh) + (sh * 160);
			System.out.println("Seu salario é: " + salario);
		}else {
			salario = sh * horas;
			System.out.println("Seu salario é: " + salario);
		}

		z.close();
	}

}