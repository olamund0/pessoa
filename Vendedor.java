package unifacisa;

public class Vendedor extends Funcionario {
	private double valorEmVendas;

	public Vendedor(String nome, int identificacao, double salario, double valorEmVendas, double salarioBase) {
		super(nome, identificacao, salario, salarioBase);
		this.valorEmVendas = valorEmVendas;

	}

	public double getValorEmVendas() {
		return valorEmVendas;
	}

	public void setValorEmVendas(double valorEmVendas) {
		this.valorEmVendas = valorEmVendas;
	}
	
	@Override
	public double getSalario() {
		return getSalarioBase() + (0.05 * valorEmVendas);
	}
}
