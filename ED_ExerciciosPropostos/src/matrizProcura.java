import java.util.Scanner;

public class matrizProcura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int mt[][] = new int[5][10];
		
		System.out.println("Preencha a matriz com 50 valores: ");
		
		for(int i=0 ; i<5; i++) {
			for(int j=0 ; j<10; j++) {
				mt[i][j] = sc.nextInt();			
			}
		}
		
		int pesquisa;
		
		System.out.println("Digite o valor procurado: ");
		pesquisa = sc.nextInt();
		
		for(int i=0 ; i<5; i++) {
			for(int j=0 ; j<10; j++) {
				if (mt[i][j] == pesquisa) {
					System.out.println("Linha: " + i + "\nColuna: ");
				}			
			}
		}
		sc.close();
	}
}
