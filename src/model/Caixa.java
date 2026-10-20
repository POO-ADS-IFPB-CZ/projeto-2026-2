package model;

public class Caixa<T> {

    private T objeto;

    public Caixa(T objeto){
        this.objeto = objeto;
    }

    public T getObjeto(){
        return objeto;
    }

    public void setObjeto(T objeto){
        this.objeto = objeto;
    }

}
