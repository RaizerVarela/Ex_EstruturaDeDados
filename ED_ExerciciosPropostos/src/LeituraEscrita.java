import java.util.Scanner;

public class LeituraEscrita {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[25];
		
		System.out.println("Digite 25 valores inteiros: ");
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
			if(i == vet.length-1) {
				System.out.println("Estes foram os valores digitados: ");
				for(int j=0; j<vet.length;j++) {
					System.out.println(vet[j]);
				}
			}
		}
		sc.close();
	}
}
