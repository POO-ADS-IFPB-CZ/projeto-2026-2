import model.*;

void main(){

    //Chamando o metodo estático
    PerimetroCalculavel.teste2();

    Circulo circulo = new Circulo(2);
    System.out.println(circulo.calcularArea());
    System.out.println(circulo.calcularPerimetro());
    //Metodo default
    circulo.teste();

}