public class Produto {

    private int codigo;
    private String descricao;
    private float preco;
    private int estoque;

    public Produto(int codigo, String descricao,
                   float preco, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }
    //Sobrecarga do operador Produto
    public Produto(){ }

    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo(){
        return codigo;
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

}
