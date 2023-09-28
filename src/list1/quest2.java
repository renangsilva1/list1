package list1;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {

		Scanner z  = new Scanner(System.in);
		int valor;

		System.out.println("Digite um numero inteiro positivo ou negativo: ");
		valor = z.nextInt();

		if(valor >= 0) {
			System.out.println("Positivo!");

		}else {
			System.out.println("Negativo!");
		}

		z.close();

	}

}

