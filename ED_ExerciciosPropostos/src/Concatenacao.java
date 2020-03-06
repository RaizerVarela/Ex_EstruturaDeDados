import java.util.Scanner;

public class Concatenacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vet1[] = new double[50];
		double vet2[] = new double[30];
		double vet3[] = new double[80];
		
		System.out.println("Digite valores reais para o primeiro vetor: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextDouble();
			vet3[i] = vet1[i];
		}
		
		System.out.println("Digite valores reais para o segundo vetor: ");
		
		for(int i=0; i<vet2.length; i++) {
			vet2[i] = sc.nextDouble();
			vet3[50 + i] = vet2[i];
		}
		
		System.out.println("Vetor 1: ");
		
		for(int i=0; i<vet1.length; i++) {
			System.out.println(vet1[i]);
		}
		
		System.out.println("Vetor 2: ");
		
		for(int i=0; i<vet2.length; i++) {
			System.out.println(vet2[i]);
		}
		
		System.out.println("Vetor 3: ");
		
		for(int i=0; i<vet3.length; i++) {
			System.out.println(vet3[i]);
		}
		sc.close();
	}
}
