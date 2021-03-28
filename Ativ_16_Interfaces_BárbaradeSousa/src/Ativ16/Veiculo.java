package Ativ16;

import java.util.ArrayList;

public class Veiculo {
	private String nome;  
	private String modelo; 
	private String marca; 
	private String ano; 
	private String cor; 
	
	
	
	public void venderVeiculo(Veiculo veiculo) {
		ArrayList<Veiculo> listVeiculo = new ArrayList(); // Criando um ArrayList
		
		listVeiculo.remove(veiculo); // Deletando registros no ArrayList
	}
	
	public void fabricarVeiculo(Veiculo veiculo) { 
		
		ArrayList<Veiculo> listVeiculo = new ArrayList(); 
		
		listVeiculo.add(veiculo); // Adicionando registros no ArrayList
	}
}
