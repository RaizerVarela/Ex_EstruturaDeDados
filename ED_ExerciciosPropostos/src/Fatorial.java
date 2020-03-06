import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int[45];
		int vet2[] = new int[45];
		
		System.out.println("Digite 45 valores inteiros: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextInt();
			vet2[i] = vet1[i];
		}
		
		for(int i=0; i<vet1.length; i++) {
			if(vet1[i] == 0) {
				vet2[i] = 1;
			}else {
				for(int j=1; j<vet1[i]; j++) {
					vet2[i] *= (vet1[i] - j);
				}
			}
		}
		
		System.out.println("Vetor digitado: ");
		
		for(int i=0; i<vet1.length; i++) {
			System.out.print(vet1[i] + ", ");
		}
		
		System.out.println("\nVetor fatorial: ");
		
		for(int i=0; i<vet2.length; i++) {
			System.out.print(vet2[i] + ", ");
		}
		sc.close();
	}
}
