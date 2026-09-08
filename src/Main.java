void main() {

    Lampada lampada = new Lampada("LED");
    System.out.println(lampada.isLigado());
    lampada.interruptor();
    System.out.println(lampada.isLigado());
    System.out.println(lampada.getCor());
    lampada.setCor(Cor.AZUL);
    System.out.println(lampada.getCor());

}