import java.util.Scanner;

public class LeituraSoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[100];
		
		System.out.println("Digite 100 valores inteiros para serem somados: ");
		
		int soma = 0;
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
			soma += vet[i];
			if(i == vet.length-1) {
				System.out.println("O resultado é: " + soma);
			}
		}
		sc.close();
	}
}