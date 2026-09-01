import java.time.LocalDate;

public class Aluno {

    private long matricula;
    private String nome;
    private String curso;
    private LocalDate nascimento;

    public Aluno(long matricula, String nome,
                 String curso, LocalDate nascimento){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.nascimento = nascimento;
    }

    public long getMatricula(){
        return matricula;
    }

    public void setMatricula(long matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
