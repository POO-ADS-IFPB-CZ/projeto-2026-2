package model;

public class EleicaoPresidente extends Eleicao{

    public EleicaoPresidente(int ano, Resultado[] resultados) {
        super(ano, resultados);
    }

    @Override
    public void calcularResultado() {
        //Abstração: Quem tirar mais votos ganha
        Candidato eleito = null;
        int maior = 0;
        for(Resultado r: getResultados()){
            if(r.getTotalVotos()>maior){
                eleito = r.getCandidato();
                maior = r.getTotalVotos();
            }
        }
        System.out.println("Eleito: "+eleito.getNome()+
                ", Votos: "+maior);
    }
}
