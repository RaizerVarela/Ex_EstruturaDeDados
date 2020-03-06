import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int[90];
		int vet2[] = new int[90];
		
		System.out.println("Digite 90 valores inteiros: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextInt();
			vet2[i] = vet1[i] * -1;
		}
		
		System.out.println("Estes são os vetores: ");
		
		for(int i=0; i<vet1.length; i++) {
			System.out.print(vet1[i] + ", ");
		}
		
		System.out.println("\n");
		
		for(int i=0; i<vet1.length; i++) {
			System.out.print(vet2[i] + ", ");
		}
		sc.close();
	}
}
