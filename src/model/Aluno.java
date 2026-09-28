package model;

public class Aluno {

    private String cpf;
    private String nome;
    private long matricula;
    private String curso;

    public Aluno(String cpf, String nome, long matricula, String curso) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
