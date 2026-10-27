package model;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    private String cnpj;
    private String nome;
    private List<Produto> produtos;

    public Supermercado(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        produtos = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public boolean addProduto(Produto produto){
        // Isso só funciona com o equals e hashCode
        if(produtos.contains(produto)){
            return false;
        }
        return produtos.add(produto);
    }

}
