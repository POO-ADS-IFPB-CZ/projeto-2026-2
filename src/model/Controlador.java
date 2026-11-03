package model;

import java.util.Stack;

public class Controlador {

    private Stack<Operacao> operacoes;

    public Controlador(){
        operacoes = new Stack<>();
    }

    public boolean add(Operacao operacao){
        return operacoes.add(operacao);
    }

    public Operacao desfazer(){
        return operacoes.pop();
    }

}
