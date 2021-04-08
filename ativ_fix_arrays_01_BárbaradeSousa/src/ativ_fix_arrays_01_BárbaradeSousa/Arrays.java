package ativ_fix_arrays_01_BárbaradeSousa;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Criando Array de 30 posições para armazenar as 30 temperaturas
		int[] temperatura = new int[30];
		
		// Lendo as 30 temperaturas do teclado
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("Informe a " + i + "° temperatura: ");
			temperatura[i] = scan.nextInt();
		}
		
		int soma = 0;
		int media = 0;
		
		
		for(int i = 0; i< temperatura.length; i++) {
			soma = soma + temperatura[i]; // Para somar as temperaturas			
		}
		media = soma / temperatura.length; // Para calcular média = soma dividido tamanho do array
		
		System.out.println("A média da temperatura do mês é igual a: " + media);
	}

}
