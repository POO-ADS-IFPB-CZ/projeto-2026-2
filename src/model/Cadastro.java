package model;

import java.util.Arrays;

public class Cadastro <T> {

    private T[] objetos;

    public Cadastro(T[] objetos) {
        this.objetos = objetos;
    }

    public T[] getObjetos() {
        return objetos;
    }

    public void setObjetos(T[] objetos) {
        this.objetos = objetos;
    }

    public void listar(){
        System.out.println(Arrays.toString(objetos));
    }

    public boolean buscar(T objeto){
        for(T elemento: objetos){
            if(elemento.equals(objeto)) return true;
        }
        return false;
    }

}
