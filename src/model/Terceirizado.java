package model;

public class Terceirizado extends Funcionario{

    private String empresa;

    public Terceirizado(String cpf, String nome,
            long matricula, float salario, String empresa){
        super(cpf,nome,matricula,salario);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public float calcularPagamento(){
        return getSalario();
    }

}
