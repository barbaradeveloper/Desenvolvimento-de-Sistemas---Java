package ativ_fix_arrayslist_BárbaradeSousa;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		
		ArrayList<String> turma = new ArrayList<String>();
		turma.add("André");
		turma.add("Samuel");
		turma.add("Christiano");
		turma.add("Lucas");
		turma.add("Daniel");
		turma.add("Carlos");
		turma.add("Thiago");
		turma.add("Bárbara");
		turma.add("João Marcos");
		turma.add("Phillipe");
		turma.add("Lucas");
		turma.add("João Paulo");
		turma.add("Yan");
		
		System.out.println("\n Visualisando o array:");
		System.out.println("");	
		
		for(String turmas: turma ) {
			System.out.println(turmas);
		}
		
		System.out.println("\n Exibindo o aluno da posição 11:");
		System.out.println("");			
		System.out.println(turma.get(11));
		
		System.out.println("\n Mudando o nome do aluno da poição 13:");
		System.out.println("");	
		turma.set(12, "Yan Robert");		
		
		for(String turmas: turma ) {
			System.out.println(turmas);
		}
		
		
		System.out.println("\n Removendo o aluno da posição 7:");
		System.out.println("");			
		System.out.println(turma.get(11));
		
		turma.remove(7);
		
		for(String turmas: turma ) {
			System.out.println(turmas);
		}
		
		
		
	}

}
