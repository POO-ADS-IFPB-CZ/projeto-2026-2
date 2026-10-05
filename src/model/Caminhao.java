package model;

public class Caminhao extends Veiculo{

    private int carga;

    public Caminhao(String placa, String modelo, int ano,
                    int carga) {
        super(placa, modelo, ano);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
