package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import controller.Cadastro;

public class Teste {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		Queue <Cadastro> cad = new LinkedList<>();
		
		System.out.println("Quantos pessoas serão cadastradas? ");
		int quantCad = sc.nextInt();
		
		for(int i=0; i<quantCad;i++) {
			System.out.println("Digite os dados " + (i+1) + "° cadastro:");
			cadastro = new Cadastro(sc.next(), sc.nextInt());
			cad.add(cadastro);
		}
		
		for(Cadastro cad1: cad) {
			System.out.println(cad1.getName());
			System.out.println(cad1.getCpf());
		}
	}
}
