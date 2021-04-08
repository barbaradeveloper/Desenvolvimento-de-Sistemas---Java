package Linkedlist;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// Linkedlist
		
		LinkedList<String> roupas = new LinkedList<String>();
		
		
		roupas.add("Camiseta Cropped");
		roupas.add("Calça Jeans");
		roupas.add("Camisa Regata");
		
		System.out.println("\n Visualisando a lista:");
		System.out.println("");	
		
		for(String roupa: roupas ) {
			System.out.println(roupa);
		}
		
		// Adicionando item no início da lista
		roupas.addFirst("Calça Flare");
		
		System.out.println("\n Depois de adicionar item no início da lista:");
		System.out.println("");	
		
		for(String roupa: roupas ) {
			System.out.println(roupa);
		}
		
		// Adicionando item no final da lista
		roupas.addLast("Calça Moletom");
		
		System.out.println("\n Depois de adicionar item no final da lista:");
		System.out.println("");	
		
		for(String roupa: roupas ) {
			System.out.println(roupa);
		}
		
		// Removendo o primeiro item da lista
		roupas.removeFirst();	
		
		System.out.println("\n Depois de remover item no início da lista:");
		System.out.println("");	
		
		for(String roupa: roupas ) {
			System.out.println(roupa);
		}
		
		
		// Removendo o último item da lista 
		roupas.removeLast();
		
		System.out.println("\n Depois de remover item no final da lista:");
		System.out.println("");	
		
		for(String roupa: roupas ) {
			System.out.println(roupa);
		}
		
		System.out.println("\n Pegando item no início da lista:");
		System.out.println("");	
		// Pegando item no início da lista
		System.out.println(roupas.getFirst());
		
		// Pegand
		System.out.println("\n Pegando item no final da lista:");
		System.out.println("");	
		System.out.println(roupas.getLast());
		
		
		

	}

}
