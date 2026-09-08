public class Lampada {

    private final String tipo;
    private Cor cor;
    private int potencia;
    private boolean ligado;

    public Lampada(String tipo){
        this.tipo = tipo;
        cor = Cor.BRANCA;
    }

    public void interruptor(){
        ligado = !ligado;
    }

    public boolean isLigado(){
        return ligado;
    }

    public Cor getCor(){
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }

}
