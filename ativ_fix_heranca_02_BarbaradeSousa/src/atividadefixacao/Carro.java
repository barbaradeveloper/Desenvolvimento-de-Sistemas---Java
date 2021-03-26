package atividadefixacao;

import java.util.ArrayList;

public class Carro implements Veiculo{
	private int idveiculo;
	private String nome;
	private String modelo;
	private String marca;
	private String ano;
	private String cor;
	
	ArrayList<Carro> carros = new ArrayList<Carro>();
	
	public Carro() {
		
	}
		
	public void setidveiculo(int idveiculo) {
		this.idveiculo = idveiculo;
	}
	public int getidveiculo() {
		return idveiculo;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getnome() {
		return nome;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public String getmarca() {
		return marca;
	}
	public void setano(String ano) {
		this.ano = ano;
	}
	public String getano() {
		return ano;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	public String getcor() {
		return cor;
	}
}
