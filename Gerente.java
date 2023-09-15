package unifacisa;

public class Gerente extends Funcionario {
    private int subordinados;

    public Gerente(String nome, int identificacao, double salario, int subordinados, double salarioBase) {
        super(nome, identificacao, salario, salarioBase);
        this.subordinados = subordinados;
    }

    public int getNumSubordinados() {
        return subordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.subordinados = numSubordinados;
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
