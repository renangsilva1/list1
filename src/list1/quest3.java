package list1;

import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		int quantidade;
		double preco; 

		System.out.println("Digite a quantodade de maçãs compradas: ");
		quantidade = z.nextInt();


		if (quantidade < 12) {
			preco = quantidade * 1.30;

			System.out.println("Custo total da compra:" + preco );

		}else {
			preco = quantidade * 1.00;
			System.out.println("Custo total da compra:" + preco );
		}



	z.close();

	}

}
