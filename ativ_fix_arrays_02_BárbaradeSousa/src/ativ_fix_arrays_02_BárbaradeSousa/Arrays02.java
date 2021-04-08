package ativ_fix_arrays_02_BárbaradeSousa;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 // Criando vetor de 10 elementos inteiros
	 int[] elemento = new int[10];
	// Lendo os 10 elementos do teclado
			for(int i = 0; i < elemento.length; i++) {
				System.out.println("Informe 0 " + i + "° elemento: ");
				elemento[i] = scan.nextInt();
			}			
	}

}
