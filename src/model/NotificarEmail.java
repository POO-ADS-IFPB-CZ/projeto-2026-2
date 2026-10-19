package model;

public class NotificarEmail
        implements Notificavel {

    //Atributos e métodos

    @Override
    public void notificar() {
        System.out.println("Notificando por e-mail");
    }

}
