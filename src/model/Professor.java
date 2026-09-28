package model;

public class Professor extends Pessoa {

    private String disciplina;
    private String formacao;

    public Professor(String cpf, String nome, long matricula, String disciplina, String formacao) {
        super(cpf,nome,matricula);
        this.disciplina = disciplina;
        this.formacao = formacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
