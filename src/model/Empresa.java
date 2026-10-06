package model;

public class Empresa {

    private String cnpj;
    private String nome;
    private Funcionario[] funcionarios;

    public Empresa(String cnpj, String nome, Funcionario[] funcionarios) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public float calcularFolha(){
        float total = 0;
        for(Funcionario funcionario: funcionarios){
            total += funcionario.calcularPagamento();
        }
        return total;
    }

    public int contAssalariado(){
        int total = 0;
        for(Funcionario funcionario: funcionarios){
            if(funcionario instanceof Assalariado)
                total++;
        }
        return total;
    }

    public int contComissionado(){
        //TODO: Fazer depois...
        return 0;
    }

}
