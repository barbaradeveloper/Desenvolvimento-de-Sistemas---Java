package ativ_fix_arrays_03_BárbaradeSousa;

import java.util.Scanner;
import java.util.ArrayList;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int limite = 0;
		System.out.println("Quantos clientes deseja cadastrar? ");
		limite = scan.nextInt();
		
		Cliente[] cliente = new Cliente[limite];
		ClienteDevedor[] clienteDevedor = new ClienteDevedor[limite];
		ClienteEspecial[] clienteEspecial = new ClienteEspecial[limite];
		
		
		
		int voltar = 1;
		while(voltar == 1) {
			
		System.out.println("|__________________________________________________|");
		System.out.println("|           Escolha uma opção do menu              |");
		System.out.println("|__________________________________________________|");
		System.out.println("|1 - Cadastrar Cliente                             |");
		System.out.println("|2 - Cadastrar Cliente Devedor                     |");
		System.out.println("|3 - Cadastrar Cliente Especial                    |");
		System.out.println("|4 - Lista de Clientes                             |");
		System.out.println("|__________________________________________________|");
		int resposta = scan.nextInt();
		
		switch(resposta) {
		
		case 1:
			
			
			for(int i = 0; i < limite; i++) {
			cliente[i]  = new Cliente();
			System.out.println("|__________________________________________________|");
			System.out.println("|             CADASTRAR CLIENTE                    |");
			System.out.println("|__________________________________________________|");
			System.out.println("");
			
			System.out.println("Nome: ");
			String nome = scan.next();
			cliente[i].setNome(nome);
			
			System.out.println("Cpf: ");
			String cpf= scan.next();
			cliente[i].setCpf(cpf);
			
			System.out.println("Rua: ");
			String rua = scan.next();
			cliente[i].setRua(rua);
			
			System.out.println("Número da casa: ");
			String numeroCasa = scan.next();
			cliente[i].setNumeroCasa(numeroCasa);
			
			System.out.println("Bairro: ");
			String bairro = scan.next();
			cliente[i].setBairro(bairro);
			
			System.out.println("Cidade: ");
			String cidade = scan.next();
			cliente[i].setCidade(cidade);
			
			System.out.println("Telefone: ");
			int telefone = scan.nextInt();
			cliente[i].setTelefone(telefone);
			
			System.out.println("Email: ");
			String email = scan.next();
			cliente[i].setEmail(email);
			
			
		System.out.println("|______________Cadastro Concluído!_____________|");	
			}
			
			break;
		case 2: 
			
			for(int i = 0; i < limite; i++) {
				clienteDevedor[i]  = new ClienteDevedor();
				System.out.println("|__________________________________________________|");
				System.out.println("|             CADASTRAR CLIENTE DEVEDOR            |");
				System.out.println("|__________________________________________________|");
				System.out.println("");
				
				System.out.println("Nome: ");
				String nome = scan.next();
				clienteDevedor[i].setNome(nome);
				
				System.out.println("Cpf: ");
				String cpf= scan.next();
				clienteDevedor[i].setCpf(cpf);
				
				System.out.println("Rua: ");
				String rua = scan.next();
				clienteDevedor[i].setRua(rua);
				
				System.out.println("Número da casa: ");
				String numeroCasa = scan.next();
				clienteDevedor[i].setNumeroCasa(numeroCasa);
				
				System.out.println("Bairro: ");
				String bairro = scan.next();
				clienteDevedor[i].setBairro(bairro);
				
				System.out.println("Cidade: ");
				String cidade = scan.next();
				clienteDevedor[i].setCidade(cidade);
				
				System.out.println("Telefone: ");
				int telefone = scan.nextInt();
				clienteDevedor[i].setTelefone(telefone);
				
				System.out.println("Email: ");
				String email = scan.next();
				clienteDevedor[i].setEmail(email);
				
				
			System.out.println("|______________Cadastro Concluído!_____________|");
				}
				
			break;
		case 3:
			
			for(int i = 0; i < limite; i++) {
				clienteEspecial[i]  = new ClienteEspecial();
				System.out.println("|__________________________________________________|");
				System.out.println("|             CADASTRAR CLIENTE ESPECIAL           |");
				System.out.println("|__________________________________________________|");
				System.out.println("");
				
				System.out.println("Nome: ");
				String nome = scan.next();
				clienteEspecial[i].setNome(nome);
				
				System.out.println("Cpf: ");
				String cpf= scan.next();
				clienteEspecial[i].setCpf(cpf);
				
				System.out.println("Rua: ");
				String rua = scan.next();
				clienteEspecial[i].setRua(rua);
				
				System.out.println("Número da casa: ");
				String numeroCasa = scan.next();
				clienteEspecial[i].setNumeroCasa(numeroCasa);
				
				System.out.println("Bairro: ");
				String bairro = scan.next();
				clienteEspecial[i].setBairro(bairro);
				
				System.out.println("Cidade: ");
				String cidade = scan.next();
				clienteEspecial[i].setCidade(cidade);
				
				System.out.println("Telefone: ");
				int telefone = scan.nextInt();
				clienteEspecial[i].setTelefone(telefone);
				
				System.out.println("Email: ");
				String email = scan.next();
				clienteEspecial[i].setEmail(email);
				
				
			System.out.println("|______________Cadastro Concluído!_____________|");	
				}
				
			break;
		case 4: 
			// Para exibir a lista de clientes
			System.out.println("|__________________________________________________|");
			System.out.println("|             LISTA DE  CLIENTES                   |");
			System.out.println("|__________________________________________________|");
			System.out.println("");
			
			for(int i = 0; i < cliente.length; i++) {
				System.out.println("Nome: " + cliente[i].getNome());
				System.out.println("Cpf: " + cliente[i].getCpf());
				System.out.println("Rua: " + cliente[i].getRua());
				System.out.println("NumeroCasa: " + cliente[i].getNumeroCasa());
				System.out.println("Bairro: " + cliente[i].getBairro());
				System.out.println("Cidade: " + cliente[i].getCidade());
				System.out.println("Telefone: " + cliente[i].getTelefone());
				System.out.println("Email: " + cliente[i].getEmail());
				System.out.println("");
			}
			break;		
		}
				
		}
	}

}
