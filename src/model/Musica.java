package model;

import java.util.Objects;

public class Musica {

    private String artista;
    private String titulo;
    private float duracao;

    //Gerar construtor, getter, setter, equals, hashCode, toString

    public Musica(String artista, String titulo, float duracao) {
        this.artista = artista;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Musica musica)) return false;
        return Float.compare(duracao, musica.duracao) == 0 && Objects.equals(artista, musica.artista) && Objects.equals(titulo, musica.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artista, titulo, duracao);
    }

    @Override
    public String toString() {
        return "Musica{" +
                "artista='" + artista + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
