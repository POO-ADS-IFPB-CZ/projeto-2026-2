import model.Moto;
import model.Veiculo;

void main(){
    Veiculo moto = new Moto("ABC-1234", "Biz",
            2025, 125);
    ((Moto) moto).setCilindradas(200);
}