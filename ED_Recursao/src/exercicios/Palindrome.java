package exercicios;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		String palavra;
		int n = 0;
		boolean palindrome = true;

		System.out.println("Digite uma palavra: ");
		palavra = sc.next();

		verifica(palavra, n, palindrome);

		sc.close();
	}

	static void verifica(String palavra, int n, boolean palindrome) {

		n++;
		
		
		System.out.print(palavra.charAt(palavra.length() - n));
	
		if(palavra.charAt(palavra.length()-n) == palavra.charAt(n - 1) && palindrome == true) {
			palindrome = true;
		}else {
			palindrome = false;
		}

		if (n == palavra.length()) {
			System.out.println("\nPalindrome: " + palindrome);
		}else {
			verifica(palavra, n, palindrome);
		}
	}
}
