package view;

import model.Pessoa;

public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Paulo");
        Pessoa pessoa1 = new Pessoa("João");

        //Não estático - pertence ao objeto
        System.out.println(pessoa.getNome());
        //Estático - pertence a classe
        System.out.println(Pessoa.getContador());

    }
}