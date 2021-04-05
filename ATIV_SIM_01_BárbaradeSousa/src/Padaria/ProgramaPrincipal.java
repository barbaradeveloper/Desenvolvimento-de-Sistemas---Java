package Padaria;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Instanciando  Scanner para ler dados do teclado
		
		int voltar = 1; // Variável para voltar ao Menu Principal
		int resposta = 1;
		int resposta2 = 1;
		int resposta3 = 1;
		int resposta4 = 1;
		int resposta5 = 1;
			
		// Listas
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		ArrayList<Encomendas> listEncomenda = new ArrayList<>();
		ArrayList<Estoque> listEstoque = new ArrayList<>();
		ArrayList<Vendas> listVenda = new ArrayList<>();
		
		// Instanciando as classes		
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Encomendas encomenda = new Encomendas();
		Estoque estoque = new Estoque();
		Vendas venda = new Vendas();
		
		
		
		while(voltar == 1) {
			// Menu principal
		System.out.println("|--------------------------------------------------|");
		System.out.println("|               PADARIA PÃO QUENTINHO              |");
		System.out.println("|--------------------------------------------------|");
		System.out.println("|Selecione uma das opções do menu:                 |");
		System.out.println("|                                                  |");
		System.out.println("| 1 - Vendas                                       |");
		System.out.println("| 2 - Cadastrar Cliente                            |");
		System.out.println("| 3 - Cadastrar Funcionário                        |");
		System.out.println("| 4 - Cadastrar Encomenda                          |");
		System.out.println("| 5 - Atualizar Estoque                            |");
		System.out.println("|--------------------------------------------------|");
		int escolhaMenu = scan.nextInt();
		
		// Escolha 
		switch(escolhaMenu) {
		case 1:
			// Menu Vendas
			System.out.println("|________________________________________________|");
			System.out.println("|                   VENDAS                       |");
			System.out.println("|________________________________________________|");
			System.out.println("|                                                |");
			System.out.println("|O que deseja fazer?                             |");
			System.out.println("| 1 - Cadastrar Venda                            |");
			System.out.println("| 2 - Cancelar Venda                             |");
			System.out.println("| 3 - Excluir produto                            |");
			System.out.println("|________________________________________________|");
			int escolhaMenu2 = scan.nextInt();
			
			// Escolha 2
			switch(escolhaMenu2) {
			case 1:
				
				System.out.println("|____________________________________________|");
				System.out.println("|              CADASTRAR VENDA               |");
				System.out.println("|____________________________________________|");
				System.out.println("");
				
				while(resposta == 1) {
				System.out.println(" Informe o ID da venda: ");
				int idVenda = scan.nextInt();
				venda.setIdVenda(idVenda);
				
				System.out.println(" Nome do produto: ");
				String nomeProduto = scan.next();
				venda.setNomeProduto(nomeProduto);
				
				System.out.println(" Quantidade do produto: ");
				int quantidadeProduto = scan.nextInt();
				venda.setQuantidadeProduto(quantidadeProduto);
				
				System.out.println(" Valor Unitário: ");
				int valorUnitario = scan.nextInt();
				venda.setValorUnitario(valorUnitario);
				
				// Valor Total
				System.out.println(" Forma de Pagamento: ");
				String formaPagamento = scan.next();
				venda.setFormaPagamento(formaPagamento);
				
				System.out.println(" Data da venda: ");
				String dataVenda = scan.next();
				venda.setDataVenda(dataVenda);
				
				System.out.println("\n Hora da Venda: ");
				String horaVenda = scan.next();
				venda.setHoraVenda(horaVenda);
				
				// Troco
				listVenda.add(venda); // Adicionando os dados lidos no ArrayList		
				
				System.out.println("Deseja cadastrar uma nova venda? ");
				System.out.println("\n 1 - para sim");
				System.out.println("\n 2 - para não");
				resposta = scan.nextInt();
				
				if(resposta == 2) {
				break;
				}
				
				}
				
				System.out.println("Digite 1 para voltar ao menu principal : ");
				voltar = scan.nextInt();
				
			case 2:
				System.out.println("|____________________________________________|");
				System.out.println("|              CANCELAR VENDA               |");
				System.out.println("|____________________________________________|");
				System.out.println("");
				
				System.out.println("Informe o ID da venda que deseja cancelar: ");
				int cancelarVenda = scan.nextInt();
				
		
				break;
			case 3:
				System.out.println("|____________________________________________|");
				System.out.println("|              EXCLUIR PRODUTO               |");
				System.out.println("|____________________________________________|");
				System.out.println("");
				
				System.out.println("Informe o nome do produto que deseja excluir: ");
				int excluirProduto = scan.nextInt();
				
				break;
				
			}
			
			System.out.println("Digite 1 para voltar ao menu principal : ");
			voltar = scan.nextInt();
		case 2:
			
			while(resposta2 == 1) {
				System.out.println("|____________________________________________|");
				System.out.println("|              CADASTRAR CLIENTE             |");
				System.out.println("|____________________________________________|");
				System.out.println("");
				
				System.out.println("\n Informe o ID do cliente: ");
				int id = scan.nextInt();
				cliente.setId(id);
				
				System.out.println("\n Informe o nome do cliente: ");
				String nome = scan.next();
				cliente.setNome(nome);
				
				System.out.println("\n Informe o telefone do cliente: ");
				String telefone = scan.next();
				cliente.setTelefone(telefone);
				
				System.out.println("\n Informe o endereço do cliente: ");
				String endereco = scan.next();
				cliente.setEndereco(endereco);
				
				listCliente.add(cliente);
				System.out.println("Deseja cadastrar outro cliente? ");
				System.out.println("\n 1 - para sim");
				System.out.println("\n 2 - para não");
				resposta2 = scan.nextInt();
				
			if(resposta2 == 2) {			
				break;
				}
			System.out.println("Digite 1 para voltar ao menu principal : ");
			voltar = scan.nextInt();
			}
			
				
		case 3:
			while(resposta3 == 1) {
			System.out.println("|____________________________________________|");
			System.out.println("|              CADASTRAR FUNCIONÁRIO         |");
			System.out.println("|____________________________________________|");
			System.out.println("");
			
			System.out.println("\n Informe o ID do funcionário: ");
			int id = scan.nextInt();
			funcionario.setId(id);
			
			System.out.println("\n Informe o nome do funcionário: ");
			String nome = scan.next();
			funcionario.setNome(nome);
			
			System.out.println("\n Informe o telefone do funcionário: ");
			String telefone = scan.next();
			funcionario.setTelefone(telefone);
			
			System.out.println("\n Informe o endereço do funcionário: ");
			String endereco = scan.next();
			funcionario.setEndereco(endereco);
			
			System.out.println("\n Informe a idade do funcionário: ");
			int idade = scan.nextInt();
			funcionario.setIdade(idade);
			
			System.out.println("\n Informe o cpf do funcionário: ");
			String cpf = scan.next();
			funcionario.setCpf(cpf);
			
			System.out.println("\n Informe o sexo do funcionário: ");
			String sexo = scan.next();
			funcionario.setSexo(sexo);
			
			System.out.println("\n Informe o cargo do funcionário: ");
			String cargo = scan.next();
			funcionario.setCargo(cargo);
			
			System.out.println("\n Informe o email do funcionário: ");
			String email = scan.next();
			funcionario.setEmail(email);
			
			System.out.println("\n Informe o salário do funcionário: ");
			double salario = scan.nextDouble();
			funcionario.setSalario(salario);
			
			System.out.println("\n Informe o horário de trabalho do funcionário: ");
			String horarioTrabalho = scan.next();
			funcionario.setHorarioTrabalho(horarioTrabalho);
			
			System.out.println("\n Informe os dias de trabalho do funcionário: ");
			String diasTrabalho = scan.next();
			funcionario.setDiasTrabalho(diasTrabalho);
			
			listFuncionario.add(funcionario);
			
			System.out.println("Deseja cadastrar outro funcionário? ");
			System.out.println("\n 1 - para sim");
			System.out.println("\n 2 - para não");
			resposta3 = scan.nextInt();
			
			if(resposta3 == 2) {			
			break;
			}
			System.out.println("Digite 1 para voltar ao menu principal : ");
			voltar = scan.nextInt();
		}
			
		case 4: 
			while(resposta4 == 1) {
				System.out.println("|____________________________________________|");
				System.out.println("|              CADASTRAR ENCOMENDA           |");
				System.out.println("|____________________________________________|");
				System.out.println("");
				
				System.out.println("\n Informe o ID da encomenda: ");
				int idEncomenda = scan.nextInt();
				encomenda.setIdEncomenda(idEncomenda);
				
				System.out.println("\n Informe o nome do cliente: ");
				String nomeCliente = scan.next();
				encomenda.setNomeCliente(nomeCliente);
				
				System.out.println("\n Informe o telefone do cliente: ");
				String telefoneCliente = scan.next();
				encomenda.setTelefoneCliente(telefoneCliente);
				
				System.out.println("\n Informe o endereço do cliente: ");
				String enderecoCliente = scan.next();
				encomenda.setEnderecoCliente(enderecoCliente);
				
				System.out.println("\n Informe a descrição da encomenda: ");
				String descricaoEncomenda = scan.next();
				encomenda.setDescricaoEncomenda(descricaoEncomenda);
				
				System.out.println("\n Informe a data da encomenda: ");
				String dataEncomenda = scan.next();
				encomenda.setDataEncomenda(dataEncomenda);
				
				System.out.println("\n Informe a data da entrega da encomenda: ");
				String dataEntrega = scan.next();
				encomenda.setDataEntrega(dataEntrega);
				
				System.out.println("\n Informe o valor da encomenda: ");
				double valor = scan.nextDouble();
				encomenda.setValor(valor);
				
				listEncomenda.add(encomenda);
				
			if(resposta4 == 2) {	
			break;
			}
			System.out.println("Digite 1 para voltar ao menu principal : ");
			voltar = scan.nextInt();
		}
			
			
			case 5:
				while(resposta5 == 1) {
				System.out.println("|____________________________________________|");
				System.out.println("|              ATUALIZAR ESTOQUE             |");
				System.out.println("|____________________________________________|");
				System.out.println("");
				
				System.out.println("\n Informe o ID do produto: ");
				int idProduto = scan.nextInt();
				estoque.setIdProduto(idProduto);
				
				System.out.println("\n Nome do produto: ");
				String nomeProduto = scan.next();
				estoque.setNomeProduto(nomeProduto);
				
				System.out.println("\n Quantidade do produto: ");
				int quantidadeProduto = scan.nextInt();
				estoque.setQuantidadeProduto(quantidadeProduto);
				
				System.out.println("\n Descrição do produto: ");
				String descricaoProduto = scan.next();
				estoque.setDescricaoProduto(descricaoProduto);
				
				listEstoque.add(estoque);
				if(resposta5 == 2) {
				break;	
				}
			}				
			
		}			
		System.out.println("Digite 1 para voltar ao menu principal ou 0 para sair do programa: ");
		voltar = scan.nextInt();
		
		}

	}

}

