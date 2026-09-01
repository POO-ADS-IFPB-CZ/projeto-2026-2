void main() {

    Produto produto = new Produto(1, "Arroz",
            4.5f, 10);
    produto.setPreco(5);
    System.out.println(produto.getCodigo());
    System.out.println(produto.getDescricao());
    System.out.println(produto.getPreco());
    System.out.println(produto.getEstoque());
    Aluno aluno = new Aluno(202012010001l,
            "João", "ADS",
            LocalDate.of(2000,5,25));

}