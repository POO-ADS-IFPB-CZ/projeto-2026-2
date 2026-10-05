package model;

public class EleicaoDeputado extends Eleicao{
    public EleicaoDeputado(int ano, Resultado[] resultados) {
        super(ano, resultados);
    }

    @Override
    public void calcularResultado() {
        //TODO: Implementar lógica de voto por legenda
    }
}
