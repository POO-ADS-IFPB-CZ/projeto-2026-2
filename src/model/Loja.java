package model;

public class Loja {

    private String cnpj;
    private String nome;
    private int contClientes;
    private Cliente[] clientes;
    private Produto[] produtos;

    public Loja(String cnpj, String nome){
        this.cnpj = cnpj;
        this.nome = nome;
        contClientes = 0;
        clientes = new Cliente[100];
        produtos = new Produto[100];
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Produto[] getProdutos() {
        return produtos;
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

}
