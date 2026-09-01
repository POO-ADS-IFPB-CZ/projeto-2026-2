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

}
