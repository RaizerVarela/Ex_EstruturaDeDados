package main;

import controller.Livro;

public class Teste {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.adicionar(1, "a", "João", 55);
		livro.adicionar(2, "b", "Amanda", 78);
		
		livro.listar();
	}
}
