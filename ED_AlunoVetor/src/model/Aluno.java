package model;

public class Aluno {

	private String name;
	
	public Aluno(String name) {
		setName(name);
	}
	
	public Aluno() {
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
