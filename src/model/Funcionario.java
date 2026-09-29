package model;

public abstract class Funcionario extends Pessoa{

    private float salario;

    public Funcionario(String cpf, String nome, long matricula, float salario){
        super(cpf,nome,matricula);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularPagamento();

}
