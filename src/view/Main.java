import model.Controlador;
import model.Operacao;

void main(){

    Controlador controlador = new Controlador();
    controlador.add(new Operacao("ADD", "Paulo"));
    controlador.add(new Operacao("ADD", "Enter"));
    controlador.add(new Operacao("ADD", "João"));
    controlador.desfazer();
    controlador.add(new Operacao("ADD", "Maria"));


}