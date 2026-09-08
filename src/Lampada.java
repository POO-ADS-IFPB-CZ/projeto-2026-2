public class Lampada {

    private final String tipo;
    private Cor cor;
    private int intensidade;
    private boolean ligado;

    public Lampada(String tipo){
        this.tipo = tipo;
        intensidade = 50;
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

    public boolean aumentarIntensidade(){
        if(intensidade>=100){
            return false;
        }
        intensidade+=5;
        return true;
    }

    public boolean diminuirIntensidade(){
        if(intensidade<=0){
            return false;
        }
        intensidade-=5;
        return true;
    }

    public int getIntensidade(){
        return intensidade;
    }

}
