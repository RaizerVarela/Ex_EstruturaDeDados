package controller;

public class Cadastro {

	private String name;
	private int cpf;
	
	public Cadastro() {
	
	}

	public Cadastro(String name, int cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
