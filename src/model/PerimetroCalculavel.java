package model;

public interface PerimetroCalculavel {

    double calcularPerimetro();
    default void teste(){
        System.out.println("OK");
    }
    static void teste2(){
        System.out.println("OK2");
    }

}
