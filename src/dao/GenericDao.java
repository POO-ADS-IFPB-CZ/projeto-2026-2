package dao;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class GenericDao <T>{

    private File file;

    public GenericDao(String path) throws IOException {
        file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
    }

    public Set<T> read() throws IOException,
            ClassNotFoundException {
        if(file.length()>0){
            try(ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file)
            )){
                Set<T> objetos = (Set<T>) in.readObject();
                return objetos;
            }
        }
        //Retorna um novo conjunto na primeira execução
        return new HashSet<>();
    }

    public boolean create(T objeto) throws IOException,
            ClassNotFoundException {
        Set<T> objetos = read();
        if(objetos.add(objeto)){
            atualizarArquivo(objetos);
            return true;
        }
        return false;
    }

    private void atualizarArquivo(Set<T> objetos)
            throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file)
        )){
            out.writeObject(objetos);
        }
    }

}
