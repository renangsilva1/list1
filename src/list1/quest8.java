package list1;

import java.util.Scanner;

public class quest8 {

	public static void main(String[] args) {

		Scanner z = new Scanner(System.in);
		int hi;
		int hf;
		int duracao;

		System.out.println("Digite a hora que a partida foi iniciada: ");
		hi = z.nextInt();

		System.out.println("Digite a hora que a partida foi finalizada: ");
		hf = z.nextInt();

		if(hi == hf) {
			duracao = 24;
			System.out.println("A partida durou 24 horas");
		}else if(hi < hf) {
			duracao = hf - hi;
			System.out.println("A partida durou " + duracao + " horas");
		}else {
			duracao = (24 - hi) + hf;
			System.out.println("A partida durou " + duracao + " horas");
		}

		z.close();
	}

}