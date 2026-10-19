package model;

public class Coordenador extends Funcionario{

    private String curso;

    public Coordenador(String cpf, String nome, String curso) {
        super(cpf, nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
