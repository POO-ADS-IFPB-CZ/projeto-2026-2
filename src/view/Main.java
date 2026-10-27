import model.Pessoa;
import model.Produto;
import model.Supermercado;

import java.sql.Array;

void main(){

    Supermercado supermercado = new Supermercado(
        "11.111.111/00001-01", "Cajazeiras");
    supermercado.addProduto(
        new Produto(1, "Arroz",
            BigDecimal.valueOf(4.5))
    );
    supermercado.addProduto(
        new Produto(1, "Arroz",
            BigDecimal.valueOf(4.5))
    );
    supermercado.addProduto(
        new Produto(2, "Feijão",
            BigDecimal.valueOf(7.5)));

    System.out.println(supermercado.getProdutos());

}