import java.util.Scanner;

public class Metade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vet1[] = new double[2];
		double vet2[] = new double[2];
		
		System.out.println("Digite valores reais: ");
		
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextDouble();
			vet2[i] = vet1[i] / 2;
		}
		
		System.out.println("Estes são os valores digitados e suas respectivas metades: ");
		
		for(int i=0; i<vet1.length; i++) {
			System.out.print(vet1[i] + ", ");
		}
		
		System.out.println("\n");
		
		for(int i=0; i<vet2.length; i++) {
			System.out.print(vet2[i] + ", ");
		}
		
		sc.close();
	}
}
