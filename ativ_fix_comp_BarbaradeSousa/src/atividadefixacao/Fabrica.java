package atividadefixacao;

public class Fabrica {

	public static void main(String[] args) {
		Carro carro01;
		carro01 = new Carro();
		
		// Salvando informa��es
		carro01.setcor("Azul");
		carro01.setano("2011");
		
		// Salvar as demais altera��es
		
		// Pegando as informa��es para imprimir
		System.out.println("Dados do carro: ");
		System.out.println("IdCarro: " + carro01.getidCarro());
		System.out.println("Nome: " + carro01.getnome());
		System.out.println("Modelo: " + carro01.getmodelo());
		System.out.println("Marca: " + carro01.getmarca());
		System.out.println("Cor: " + carro01.getcor());
		System.out.println("Ano: " + carro01.getano());

	}

}
