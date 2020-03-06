import java.util.Scanner;

public class MostraNPrimos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int [10];
		
		System.out.println("Digite 10 valores inteiros: ");
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int res = 0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i] == 2) {
				System.out.println("Numero: " + num[i] + "\nPosição: " + i);
			}
			for( int j=2; j<num[i]; j++) {
				res = num[i] % j;
				if(res == 0) {
					j = j+num[i];
				} else if(j == num[i]-1){
					System.out.println("Numero: " + num[i] + "\nPosição: " + i);
				}
			}
		}
		sc.close();
	}
}
