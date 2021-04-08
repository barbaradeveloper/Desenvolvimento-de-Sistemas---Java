package ativ_fix_arrays_01_B�rbaradeSousa;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Criando Array de 30 posi��es para armazenar as 30 temperaturas
		int[] temperatura = new int[30];
		
		// Lendo as 30 temperaturas do teclado
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("Informe a " + i + "� temperatura: ");
			temperatura[i] = scan.nextInt();
		}
		
		int soma = 0;
		int media = 0;
		
		
		for(int i = 0; i< temperatura.length; i++) {
			soma = soma + temperatura[i]; // Para somar as temperaturas			
		}
		media = soma / temperatura.length; // Para calcular m�dia = soma dividido tamanho do array
		
		System.out.println("A m�dia da temperatura do m�s � igual a: " + media);
	}

}
