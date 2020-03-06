import java.util.Scanner;

public class Mesclagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int [15];
		int y[] = new int [15];
		int z[] = new int [30];
		
		System.out.println("Digite valores inteiros para o primeiro vetor: ");
		
		for(int i=0; i<x.length; i++) {
			z[i] = x[i];
			i++;
		}
		
		System.out.println("Digite valores inteiros para o segundo vetor: ");
		
		for(int i=1; i<y.length; i++) {
			z[i] = y[i];
			i++;
		}
		
		System.out.println("A mesclagem dos valores é: ");
		
		for(int i=0; i<z.length; i++) {
			System.out.print(z[i] + ", ");
		}
		sc.close();
	}
}
