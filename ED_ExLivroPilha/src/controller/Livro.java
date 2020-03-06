package controller;

public class Livro {

	private No topo;
	
	public Livro() {
		this.topo = null;
	}
	
	public void empilhar(int numero, String titulo, String autor, double preco) {
		No nova = new No();
		nova.setNumero(numero);
		nova.setTitulo(titulo);
		nova.setAutor(autor);
		nova.setPreco(preco);
		nova.setProximo(null);
		
		if(isEmpty()) {
			topo = nova;
		} else {
			nova.setProximo(topo);
			topo = nova;
		}
	}
	
	public No desempilhar() {
		No aux;
		aux = topo;
		topo = topo.getProximo();
	
		return aux;
	}
	
	public void mostrar() {
		if (topo == null) {
			System.out.println("Nada a exibir - Pilha vazia!");
		} else {
			No aux = topo;
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
	
	public void mostraTopo() {
		if (isEmpty()) {
			System.out.println("Nada a exibir - Pilha vazia!");
		} else {
			System.out.println("Numero: " + topo.getNumero() + 
					"\nTiulo: " + topo.getTitulo() +
					"\nAutor: " + topo.getAutor() +
					"\nPreço: " + topo.getPreco() +
					"\n-----------------------------");
		}
	}

	private boolean isEmpty() {
		return this.topo == null;
	}
}
