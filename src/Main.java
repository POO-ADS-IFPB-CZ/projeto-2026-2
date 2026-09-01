void main() {

    Produto produto = new Produto(1, "Arroz",
            4.5f, 10);
    System.out.println(produto.getDescricao());
    produto.setDescricao("Arroz Parbolizado");
    System.out.println(produto.getDescricao());

}