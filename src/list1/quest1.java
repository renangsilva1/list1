package list1;

import java.util.Scanner;

public class quest1 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		int valor;

		System.out.println("Digite um número inteiro: ");
		valor = z.nextInt();

		if (valor > 10) {
			System.out.println("É maior que 10!!");
		}else {
			System.out.println("Não é maior que 10!!");
		}





		z.close();
	}

}