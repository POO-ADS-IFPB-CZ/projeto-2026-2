package model;

public class Professor extends Funcionario{

    private String titulacao;

    public Professor(String cpf, String nome, String titulacao) {
        super(cpf, nome);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
