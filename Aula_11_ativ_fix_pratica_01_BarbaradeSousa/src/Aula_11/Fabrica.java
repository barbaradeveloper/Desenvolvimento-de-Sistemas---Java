package Aula_11;

import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		Carro carro01;
		carro01 = new Carro();
		
		
		// Cria��o do objeto respons�vel por ler a informa��o digitada pelo usu�rio
		Scanner scan = new Scanner(System.in);
		
			
		// Solicitando informa��o do usu�rio
		System.out.println("Digite o id do carro: ");
		int idCarro = scan.nextInt();	// Lendo uma informa��o e armazenando em uma v�riavel
		System.out.println("Digite o nome do carro: ");
		String nome = scan.nextLine();
		System.out.println("Digite o modelo do carro: ");
		String modelo = scan.nextLine();
		System.out.println("Digite a marca do carro: ");
		String marca = scan.nextLine();
		System.out.println("Digite a cor do carro: ");
		String cor = scan.nextLine();
		System.out.println("Digite o ano do carro: ");
		String ano = scan.nextLine();
		
		// Setando a informa��o no objeto do tipo Carro
		
		carro01.setidCarro(idCarro);
		carro01.setnome(nome);
		carro01.setmodelo(modelo);
		carro01.setmarca(marca);
		carro01.setcor(cor);
		carro01.setano(ano);
		
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
