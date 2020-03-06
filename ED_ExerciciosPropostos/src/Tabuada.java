import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int[10];
		int valor;
		
		System.out.println("Digite o valor inteiro que se deseja saber a tabuada: ");
		valor = sc.nextInt();
		System.out.println("A tabuada do valor digitado é: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = valor * (i+1);
			System.out.println(vet1[i]);
		}	
		sc.close();
	}
}
