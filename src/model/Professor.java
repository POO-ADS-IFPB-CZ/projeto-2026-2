package model;

public class Professor extends Funcionario {

    private String disciplina;
    private String formacao;

    public Professor(String cpf, String nome, long matricula,
                     float salario, String disciplina,
                     String formacao) {
        super(cpf,nome,matricula, salario);
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

    @Override
    public float calcularPagamento(){
        if(formacao.toUpperCase().contains("MESTRADO")){
            return getSalario()+500;
        }
        if(formacao.toUpperCase().contains("DOUTORADO")){
            return getSalario()+1000;
        }
        return getSalario();
    }

}
