package model;

public class Circulo implements AreaCalculavel, PerimetroCalculavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public void teste(){
        System.out.println("Teste para circulo");
    }

}
