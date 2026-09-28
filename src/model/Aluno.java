package model;

public class Aluno extends Pessoa {

    private String curso;

    public Aluno(String cpf, String nome, long matricula, String curso) {
        super(cpf, nome, matricula);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
