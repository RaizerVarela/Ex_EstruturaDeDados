import java.util.Scanner;

public class MostraQuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int [30];
		int vet2[] = new int [30];
		
		System.out.println("Digite 30 valores inteiros: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextInt();
			vet2[i] = vet1[i] ^ 2;
		}
		
		System.out.println("Saída: ");
		
		for(int i=0; i<vet2.length; i++) {
			System.out.print(vet2[i] + ", ");
		}
		
		for(int i=0; i<vet1.length; i++) {
			System.out.print(vet1[i] + ", ");
		}
		sc.close();
	}
}
