package atividadefixacao;

public class Moto {
	private int idMoto;
	private String nome;
	private String modelo;
	private String marca;
	private String ano;
	private String cor;
	
	public Moto() {
		
	}
		
	public void setidCarro(int idMoto) {
		this.idMoto = idMoto;
	}
	public int getidMoto() {
		return idMoto;
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
