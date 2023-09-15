package unifacisa;

/* Crie uma classe Funcionario, que contém os seguintes atributos e métodos:
➔ atributos: nome, identificacao, salario
➔ métodos:
◆ gets e sets*/

public class Funcionario {
	private String nome;
	private int identificacao;
	private double salario;
	private double salarioBase;
	

	public Funcionario(String nome, int identificacao, double salario, double salarioBase) {
		this.nome = nome;
		this.identificacao = identificacao;
		this.salario = salario;	
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getIdentificacao() {
		return identificacao;
	}
	
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
