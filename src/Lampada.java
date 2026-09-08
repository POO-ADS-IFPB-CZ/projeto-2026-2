public class Lampada {

    private final String tipo;
    private String cor;
    private int potencia;
    private boolean ligado;

    public Lampada(String tipo){
        this.tipo = tipo;
        cor = "Branco";
    }

    public void interruptor(){
        ligado = !ligado;
    }

    public boolean isLigado(){
        return ligado;
    }

}
