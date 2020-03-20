package exercicios;

public class MenorElemento {

	public static void main(String[] args) {
	
		int[] vet = {32, 40, 3, 6, 37, 1, 0, 97};
		int menor = vet[0];
		int n = 0;
		
		menor = menorElemento(vet, menor, n);
		
		System.out.println(menor); 
	}

	static int menorElemento(int[] vet, int menor, int n) {
		
		n++;
		
		if(n < vet.length && vet[n] < menor) {
			menor = vet[n];
		}else if(vet.length == n) {
			return menor;
		}
		return menorElemento(vet, menor, n);
	}
}
