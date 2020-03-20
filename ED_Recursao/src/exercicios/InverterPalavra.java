package exercicios;

import java.util.Scanner;

public class InverterPalavra {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		String palavra;
		int n = 0;

		System.out.println("Digite uma palavra: ");
		palavra = sc.next();

		verifica(palavra, n);

		sc.close();
	}

	static void verifica(String palavra, int n) {

		n++;

		System.out.print(palavra.charAt(palavra.length() - n));

		if (n != palavra.length()) {
			verifica(palavra, n);
		}
	}
}
