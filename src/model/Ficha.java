package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ficha {

    private UUID id;
    private LocalDateTime dataHora;

    public Ficha(){
        id = UUID.randomUUID();
        dataHora = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                '}';
    }
}