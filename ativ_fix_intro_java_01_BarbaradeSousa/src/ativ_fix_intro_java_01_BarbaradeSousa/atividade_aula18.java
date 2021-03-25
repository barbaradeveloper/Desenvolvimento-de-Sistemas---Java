package ativ_fix_intro_java_01_BarbaradeSousa;

public class atividade_aula18 {

	public static void main(String[] args) {
		/*1. Desenvolva um programa que exiba as seguintes mensagens:
			▪ Aplicando Orientação a objetos no Java
			▪ Meu nome é */
		
		System.out.println("Aplicando Orientação a objetos no Java");
		System.out.println("Meu nome é");

		/* 2. Desenvolva um programa que imprima, no console, todos os números de 150 a 250.*/
		int i = 150;
		for(i = 150; i <= 250; i++) {
			System.out.println(i);
		}

		/*	3. Desenvolva um programa que imprima, no console, a soma de 1
			até 1000 (inclusive).*/
		
		int min = 1;
		int max = 1000;
		int soma = (min + max) * ((max - min)/1) / 2;
		System.out.println(soma);
		
		/*	4. Desenvolva um programa que imprima, no console, todos os múltiplos de 3, entre 1 e 100 (inclusive).*/
		int j = 1;
		for(j = 1; j <= 100; j++) {
			if(j % 3 == 0) {
				System.out.println(j);
			}
		}
		/*	5. Desenvolva um programa que imprima, no console, todos os números entre 1 e 100 (inclusive), dizendo 
		 * se ele é ou não múltiplo de 3. (Dica: use o operador de resto: %)
		 */
		int k = 1;
		for(k = 1; k <= 100; k++) {
			if(k % 3 == 0) {
				System.out.println(k + " é multiplo de 3.");
			}else {
				System.out.println(k + " não é multiplo de 3.");
			}
		}

		/*	6. Desenvolva um programa que imprima, no console, todos os múltiplos de 3 e de 5, entre 1 e 100 (inclusive):*/
		int l = 1;
		for(l = 1; l <= 100; l++) {
			if(l % 3 == 0 && l % 5 == 0) {
				System.out.println(l);
			}
		}
	}

}
