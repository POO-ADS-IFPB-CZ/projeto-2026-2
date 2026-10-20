import model.Cadastro;

void main(){

    String[] nomes = {"João", "Maria", "Pedro", "José"};
    Cadastro<String> cadastro = new Cadastro<>(nomes);

    cadastro.listar();
    System.out.println(cadastro.buscar("Maria"));


}