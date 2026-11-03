import model.Controlador;
import model.Ficha;
import model.Operacao;

void main(){

    Fila fila = new Fila();
    fila.adicionar(new Ficha());
    fila.adicionar(new Ficha());
    fila.adicionar(new Ficha());

    System.out.println(fila.proximo());

}