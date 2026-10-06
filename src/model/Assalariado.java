package model;

public class Assalariado extends Funcionario {

    private float salario;

    public Assalariado(String cpf, String nome, float salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float calcularPagamento() {
        return salario;
    }
}
