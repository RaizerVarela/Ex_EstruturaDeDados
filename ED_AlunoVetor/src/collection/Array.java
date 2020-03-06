package collection;

import model.Aluno;

public class Array {

	private Object[] object;
	private int size = 0;
	
	public Array(int arraySize) {
		object = new Object[arraySize]; 
	}
	
	public Array() {
		object = new Object[20];
	}
	
	public void add(Object o) {
		this.checkSize();
		this.object[this.size] = o;
		this.size ++;
	}
	
	public void add(Object o, int pos) {
		this.checkSize();
		if(this.posittionIsValid(pos)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for(int i = this.size - 1; i >= pos; i--) {
			this.object[i + 1] = this.object[i];
		}
		this.object[pos] = 0;
		this.size++;
	}
	
	public Object getObject(int pos) {
		if(this.posittionIsOcupped(pos)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return object[pos];
	}
	
	public void remove(int pos) {
		if(this.posittionIsOcupped(pos)) {
			throw new IllegalArgumentException("Posição Vazia");
		}
		
		for (int i = 0; i < this.size - 1; i++) {
			this.object[i] = this.object[i + 1];
		}
		this.size --;
	}
	
	public void checkSize() {
		if (this.size == this.object.length) {
			Object [] newArray = new Object[size * 2];
			for(int i = 0; i < this.object.length; i++) {
				newArray[i] = object[i]; 
			}
			this.object = newArray;
		}
	}
	
	public boolean posittionIsOcupped(int pos) {
		return pos >= 0 && pos <= this.size;
	}
	
	public boolean posittionIsValid(int pos) {
		return pos >= 0 && pos <= this.size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean contains(Object o) {
		for(int i = 0; i < this.size - 1; i++) {
			if(o.equals(this.object[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void printObject() {
		for (int i = 0; i < this.size; i++) {
			Aluno aluno = (Aluno) this.object[i];
			System.out.println("Aluno: " + aluno.getName());
		}
		System.out.println("\n");
	}
	
	public void printObject(int pos) {
		Aluno aluno = (Aluno)this.getObject(pos);
		System.out.println("Aluno: " + aluno.getName() + "\n");
	}
}
