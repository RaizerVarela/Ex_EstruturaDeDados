import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int [10];
		int vet2[] = new int[10];
		int vet3[] = new int [10];
		
		System.out.println("Digite 10 valores para primeiro vetor: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextInt();
			vet3[i] += vet1[i];
		}
		
		System.out.println("Digite 10 valores para segundo vetor: ");
		
		for(int i=0; i<vet2.length; i++) {
			vet2[i] = sc.nextInt();
			vet3[i] += vet3[i];
			if(i == vet2.length-1) {
				System.out.println("Vetor 1: ");
				for(int j=0; j< vet3.length; j++) {
					System.out.println(vet1[j]);
				}
				System.out.println("Vetor 2: ");
				for(int j=0; j< vet3.length; j++) {
					System.out.println(vet2[j]);
				}
				System.out.println("Vetor 3: ");
				for(int j=0; j< vet3.length; j++) {
					System.out.println(vet3[j]);
				}
			}
		}
		sc.close();
	}
}
