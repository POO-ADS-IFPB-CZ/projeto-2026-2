package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {

    Set<Musica> musicas = new HashSet<>();

    public boolean add(Musica musica){
        return musicas.add(musica);
    }

    public boolean remove(Musica musica){
        return musicas.remove(musica);
    }

    public List<Musica> criarPlaylist(int quantidade){

    }

}
