package Padaria;

// Classe Vendas
public class Vendas {
	// Atributos
	public int idVenda;
	public String nomeProduto;
	public int quantidadeProduto;
	public double valorUnitario;
	public double valorTotal;
	public String formaPagamento;
	public String dataVenda;
	public String horaVenda;
	public double valorPago;
	public double troco;
	
	// Métodos Getter e Setter
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(String horaVenda) {
		this.horaVenda = horaVenda;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	// Métodos
	public void cadastrarVenda() {
		
	}
	public void cancelarVenda() {
		
	}
	public void excluirProduto() {
		
	}
	public void exibirVendas() {
		System.out.println("");
		System.out.println("|______________________________________________|");
		System.out.println("|               RELATÓRIO DE VENDAS            |");
		System.out.println("|______________________________________________|");
		System.out.println("");
		System.out.println("ID da venda: " + idVenda);
		System.out.println("Nome do produto: " + nomeProduto);
		System.out.println("Quantidade do produto: " + quantidadeProduto);
		System.out.println("Valor unitário: " + valorUnitario);
		System.out.println("Forma de Pagamento: " + formaPagamento);
		System.out.println("Data da Venda: " + dataVenda);
		System.out.println("Hora da venda: " + horaVenda);
		System.out.println("Valor Total: " + valorTotal); 
		System.out.println("Valor pago pelo cliente: " + valorPago); 
		System.out.println("Troco: " + troco); 
	}
	
	
}
