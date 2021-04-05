package Padaria;

// Classe Funcionario extendendo a classe abstrata Pessoa
public class Funcionario extends Pessoa{
	// Atributos
	private int idade;
	private String cpf;
	private String sexo;
	private String cargo;
	private String email;
	private double salario;
	private String horarioTrabalho;
	private String diasTrabalho;
	
	// Métods Getter e Setter
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getHorarioTrabalho() {
		return horarioTrabalho;
	}


	public void setHorarioTrabalho(String horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}


	public String getDiasTrabalho() {
		return diasTrabalho;
	}


	public void setDiasTrabalho(String diasTrabalho) {
		this.diasTrabalho = diasTrabalho;
	}

	// Métodos
	public void cadastrarFuncionario() {
		
	}
	
	
}
