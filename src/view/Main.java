import model.Candidato;
import model.EleicaoPresidente;
import model.Resultado;

void main(){
    Resultado resultado1 = new Resultado(
            new Candidato("João", 99), 100
    );
    Resultado resultado2 = new Resultado(
            new Candidato("Maria", 98), 200
    );
    Resultado resultado3 = new Resultado(
            new Candidato("José", 97), 500
    );
    Resultado[] resutados = {resultado1, resultado2, resultado3};
    EleicaoPresidente eleicaoPresidente = new EleicaoPresidente(
            2026, resutados);
    eleicaoPresidente.calcularResultado();
}