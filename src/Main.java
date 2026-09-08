void main() {

    Lampada lampada = new Lampada("LED");
    System.out.println(lampada.isLigado());
    System.out.println(lampada.getCor());
    System.out.println(lampada.getIntensidade());

    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();
    lampada.aumentarIntensidade();

    if(lampada.aumentarIntensidade()){
        System.out.println("Intensidade aumentada");
    }else{
        System.out.println("Já está no máximo");
    }

}