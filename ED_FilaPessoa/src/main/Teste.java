package main;

import controller.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.enfileirar("Raizer");
		pessoa.enfileirar("Eliane");
		pessoa.enfileirar("Julio");
		pessoa.enfileirar("Victor");
		pessoa.enfileirar("Caique");
		
		System.out.println(pessoa.desenfileirar());
		System.out.println(pessoa.desenfileirar());
		System.out.println(pessoa.desenfileirar());
		System.out.println(pessoa.desenfileirar());
	}
}
