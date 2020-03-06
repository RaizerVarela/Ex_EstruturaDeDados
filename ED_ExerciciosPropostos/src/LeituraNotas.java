import java.util.Scanner;

public class LeituraNotas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[503];
		int soma = 0;
		
		System.out.println("Digite as 50 notas: ");
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
			soma += vet[i];
			if(i == vet.length-1) {
				double media;
				media = soma/50;
				System.out.println("A media aritmetica das notas é: " + media);
			}
		}
		sc.close();
	}
}
