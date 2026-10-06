package model;

public class Comissionado extends Funcionario{

    private float vendas;
    private float comissao;

    public Comissionado(String cpf, String nome, float vendas, float comissao) {
        super(cpf, nome);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularPagamento() {
        return (vendas*comissao)/100;
    }
}
