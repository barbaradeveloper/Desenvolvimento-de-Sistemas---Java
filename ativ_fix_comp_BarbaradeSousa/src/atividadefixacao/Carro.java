package atividadefixacao;

public class Carro extends Veiculo{
	private int idCarro;
	private String nome;
	private String modelo;
	private String marca;
	private String ano;
	private String cor;
	
	public Carro() {
		
	}
		
	public void setidCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	public int getidCarro() {
		return idCarro;
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
