package list1;

import java.util.Scanner;

public class quest5 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		int aa;
		int an;
		int idade;

		System.out.println("Digite o ano em que estamos: ");
		aa = z.nextInt();

		System.out.println("Digite o ano de seu nascimento: ");
		an = z.nextInt();

		idade = aa - an;

		if(idade < 16) {
			System.out.println("Você não pode votar este ano.");

		}else {
			System.out.println("Você pode votar este ano.");

		}
		z.close();

		}

	}