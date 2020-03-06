package controller;

public class Pessoa {
	
	private No inicio;
	
	public Pessoa() {
		this.inicio = null;
	}
	
	public void enfileirar(String pessoa) {
		No nova = new No();
		nova.setPessoa(pessoa);
		nova.setAnterior(null);
		
		if(isEmpety()) {
			inicio = nova;
		} else {
			No aux;
			aux = inicio;
			while(aux.getAnterior() != null) {
				aux = aux.getAnterior();
			}
			aux.setAnterior(nova);
		}
	}
	
	public String desenfileirar() {
		No aux;
		aux = inicio;
		inicio = aux.getAnterior();
		
		return aux.getPessoa();
	}
	
	public boolean procura(String nome) {
		No aux;
		aux = inicio;
		while(aux != null) {
			if(aux.getPessoa() == nome) {
				return true;
			}
			aux = aux.getAnterior();
		}
		return false;
	}
	
	public boolean isEmpety() {
		return this.inicio == null;
	}
}
