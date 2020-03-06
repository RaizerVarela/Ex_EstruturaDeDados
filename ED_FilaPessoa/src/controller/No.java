package controller;

//public class No {
//	
//	private String pessoa;
//	private No anterior;
//	
//	public No() {
//		
//	}
//	
//	public No(String pessoa, No anterior) {
//		this.pessoa = pessoa;
//		this.anterior = null;
//	}
//
//	public String getPessoa() {
//		return pessoa;
//	}
//
//	public void setPessoa(String pessoa) {
//		this.pessoa = pessoa;
//	}
//
//	public No getAnterior() {
//		return anterior;
//	}
//
//	public void setAnterior(No anterior) {
//		this.anterior = anterior;
//	}
//}
public class No {

	private String pessoa;
	private No anterior;
	
	public No() {
	
	}
	
	public No(String pessoa, No anterior) {
		this.pessoa = pessoa;
		this.anterior = null;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
}
