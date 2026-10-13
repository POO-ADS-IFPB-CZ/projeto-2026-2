import model.Aviao;
import model.Passaro;
import model.Voador;

void main(){
    Voador voador = new Aviao("Airbus");
    Voador voador1 = new Passaro("Bem te vi");
    voador.voar();
    voador1.voar();
}