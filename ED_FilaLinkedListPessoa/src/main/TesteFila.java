package main;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
	
	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Raizer");
		queue.add("Eliane");
		queue.add("Anelyze");
		queue.add("Victor");
		queue.add("Caique");
		
		System.out.println("Fila: " + queue);
		
		String name = queue.remove(); // remove - joga throws NoSuchElementExcption.
		System.out.println("Removido da fila: " + name + " | Nova fila: " + queue);
		
		name = queue.poll(); // remove - retorna null se a lista esta vazia.
		System.out.println("Removido da Fila: " + name + " | Nova Fila: " + queue);
		
		// verifica se a fila esta vazia.
		System.out.println("A fila esta vazia? " + queue.isEmpty());
		
		// mostra o tamanho da fila.
		System.out.println("Tamanho da fila: " + queue.size());
		
		// verificar a existencia de algum elemento;
		name = "Raizer";
		if(queue.contains(name)) {
			System.out.println("Fila contem " + name);
		} else {
			System.out.println("Fila nao contem " + name);
		}
		
		// obtem o primeiro elemeto da fila (sem remove-lo) - joga throws NoSuchElementException se vazia.
		String first = queue.element();
		System.out.println("Primeira pessoa da fila: " + first);
		
		// obtem o primeiro elemeto da fila (sem remove-lo) - retorna null se vazia.
		first = queue.peek();
		System.out.println("Primeira pessoa da fila: " + first);
	}
}
