package model;

public class Professor {

    private String cpf;
    private String nome;
    private long matricula;
    private String disciplina;
    private String formacao;

    public Professor(String cpf, String nome, long matricula, String disciplina, String formacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.formacao = formacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
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
