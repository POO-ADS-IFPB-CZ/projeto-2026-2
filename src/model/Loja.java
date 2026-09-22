package model;

import java.util.Arrays;

public class Loja {

    private String cnpj;
    private String nome;
    private int contClientes;
    private Cliente[] clientes;
    private int contProdutos;
    private Produto[] produtos;

    public Loja(String cnpj, String nome){
        this.cnpj = cnpj;
        this.nome = nome;
        contClientes = 0;
        clientes = new Cliente[100];
        contProdutos = 0;
        produtos = new Produto[100];
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public Cliente[] getClientes() {
        //Retornar apenas a parte que contém clientes
        return Arrays.copyOfRange(clientes,0, contClientes);
    }

    public Produto[] getProdutos() {
        return Arrays.copyOfRange(produtos, 0, contProdutos);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean adicionarCliente(Cliente cliente){
        if(contClientes >= clientes.length) return false;
        clientes[contClientes] = cliente;
        contClientes++;
        return true;
    }

    public boolean adicionarProduto(Produto produto){
        if(contProdutos >= produtos.length) return false;
        produtos[contProdutos++] = produto;
        return true;
    }

}
