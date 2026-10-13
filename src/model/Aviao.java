package model;

public class Aviao implements Voador {

    private String modelo;

    public Aviao(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void voar() {
        System.out.println("Ligar o motor");
    }
}
