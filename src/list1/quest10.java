package list1;

import java.util.Scanner;

public class quest10 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		double salario;
		double vendas;
		double sf;


		System.out.println("Digite o seu salario fixo: ");
		salario = z.nextDouble();

		System.out.println("Digite o total das suas vendas no mês: ");
		vendas = z.nextDouble();

		if (vendas > 1500) {
		sf = (vendas - 1500) * 0.05 + 45 + salario;
		System.out.println("Seu salario total é: " + sf);

		}else {
			sf = vendas * 0.03 + salario;
			System.out.println("Seu salario total é: " + sf);
		}
		z.close();
	}

}