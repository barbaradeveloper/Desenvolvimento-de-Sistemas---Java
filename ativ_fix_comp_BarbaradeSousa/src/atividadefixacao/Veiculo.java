package atividadefixacao;

import java.util.ArrayList;

public class Veiculo {
	private String nome;
	private String modelo;
	private String marca;
	private String ano;
	private String cor;
	
	public class Carro extends Veiculo{
		
	}
	public class Moto extends Veiculo{
		
	}
	public void fabricarVeiculo(Veiculo veiculo) {
		ArrayList<Veiculo> listVeiculo = new ArrayList();
		listVeiculo.add(veiculo);
	}
	
	public void venderVeiculo(Veiculo veiculo) {
		ArrayList<Veiculo> listVeiculo = new ArrayList();
		listVeiculo.remove(veiculo);
	}
}
