package model;

public class Resultado {

    private Candidato candidato;
    private int totalVotos;

    public Resultado(Candidato candidato, int totalVotos) {
        this.candidato = candidato;
        this.totalVotos = totalVotos;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }
}
