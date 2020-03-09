package main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TesteFilaIteracoes {

	public static void main(String[] args) {
	
		Queue <String> queue = new LinkedList();
		
		queue.add("Raizer");
		queue.add("Victor");
		queue.add("Caique");
		queue.add("Julio");
		
		System.out.println("=== Itera��es em fila usando Java8 forEach() ===");
		queue.forEach(name -> {
			System.out.println(name);
		});
		
		System.out.println("\n==== Intera��es em fila usando iterator() ====");
		Iterator<String> queueIterator = queue.iterator();
		while (queueIterator.hasNext()){
			String name = queueIterator.next();
			System.out.println(name);
		}
		
		System.out.println("\n=== Itera��es em uma fila usando iterador() e Java8 forEachRemaining() ===");
		queueIterator = queue.iterator();
		queueIterator.forEachRemaining(name -> {
			System.out.println(name);
		});
		
		System.out.println("\n=== Itera��es sobre uma fila usando loop for-each ===");
		for(String name: queue) {
			System.out.println(name);
		}
	}
}
