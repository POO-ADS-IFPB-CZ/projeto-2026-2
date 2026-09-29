package model;

public class Tecnico extends Funcionario{

    private String setor;

    public Tecnico(String cpf, String nome, long matricula,
                   float salario, String setor){
        super(cpf, nome, matricula, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public float calcularPagamento(){
        if(setor.toUpperCase().contains("LABORATÓRIO")){
            return getSalario()*1.2f;
        }
        return getSalario();
    }

}
