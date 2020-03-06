package controller;

public class Livro {
	
	private No inicio;
	
	
	public Livro() {
		this.inicio = null;
	}
	
	public void adicionar(int numero, String titulo, String autor, double preco) {
		No nova = new No();
		nova.setNumero(numero);
		nova.setTitulo(titulo);
		nova.setAutor(autor);
		nova.setPreco(preco);
		nova.setProximo(null);
		
		if(isEmpty()) {
			inicio = nova;
		}else {
			No aux;
			aux = inicio;
			while(aux.getProximo() != null) {
				aux.getProximo();
			}
			aux.setProximo(nova);
		}
	}
	
	public void listar() {
		if (inicio == null) {
			System.out.println("Nada a exibir - nenhum livro cadastrado");
		} else {
			No aux = inicio;
			while (aux != null) {
				System.out.println("Numero: " + aux.getNumero() + 
				"\nTiulo: " + aux.getTitulo() +
				"\nAutor: " + aux.getAutor() +
				"\nPreço: " + aux.getPreco() +
				"\n-----------------------------");
				aux = aux.getProximo();
			}
		}
	}
	
	public boolean isEmpty() {
		return inicio == null;
	}
}
