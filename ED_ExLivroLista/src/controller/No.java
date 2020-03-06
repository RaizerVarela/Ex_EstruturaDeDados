package controller;

public class No {

	private int numero;
	private String titulo;
	private String autor;
	private double preco;
	private No proximo;
	
	public No() {
	
	}
	
	public No(int numero, String titulo, String autor, double preco, No proximo) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.proximo = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No anterior) {
		this.proximo = anterior;
	}
}
