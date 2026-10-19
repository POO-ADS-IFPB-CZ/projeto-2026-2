package model;

public class NotificarTelefone implements Notificavel{

    //Atributos e métodos

    @Override
    public void notificar(){
        System.out.println("Notificando por telefone");
    }

}
