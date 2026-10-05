package model;

public abstract class Eleicao {

    private int ano;
    private Resultado[] resultados;

    public Eleicao(int ano, Resultado[] resultados) {
        this.ano = ano;
        this.resultados = resultados;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Resultado[] getResultados() {
        return resultados;
    }

    public void setResultados(Resultado[] resultados) {
        this.resultados = resultados;
    }

    public abstract void calcularResultado();

}
