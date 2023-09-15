package unifacisa;

public class Gerente extends Funcionario {
    private int subordinados;

    public Gerente(String nome, int identificacao, double salario, int subordinados, double salarioBase) {
        super(nome, identificacao, salario, salarioBase);
        this.subordinados = subordinados;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public double getSalario() {
        return getSalarioBase() + (100.00 * subordinados);
    }

    @Override
    public String getNome() {
        return "*" + super.getNome();
    }
}
