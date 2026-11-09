import model.Biblioteca;
import model.Musica;

void main(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.add(new Musica("Zezo",
            "Decida", 3.5f));
    biblioteca.add(new Musica("Zezo",
            "Decida", 3.5f));
    biblioteca.add(new Musica("Imagine Dragons",
            "Enemy", 3.34f));
    biblioteca.add(new Musica("Edson Gomes",
            "Árvore", 4.3f));

    System.out.println(biblioteca
            .criarPlaylist(2));

}