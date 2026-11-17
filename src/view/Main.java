import model.Pessoa;

void main(){

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João", 20));
    pessoas.add(new Pessoa("Ana", 22));
    pessoas.add(new Pessoa("Alice", 18));
    pessoas.add(new Pessoa("José", 19));
    System.out.println(pessoas);

    //Retornar uma lista com as pessoas que começam com A
    // em ordem crescente de idade
    List<Pessoa> pessoasFiltrada = new ArrayList<>();
    for(Pessoa pessoa : pessoas){
        if(pessoa.getNome().startsWith("A")){
            pessoasFiltrada.add(pessoa);
        }
    }
    Collections.sort(pessoasFiltrada,
            Comparator.comparing(Pessoa :: getIdade));
    System.out.println(pessoasFiltrada);

    System.out.println(pessoas.stream()
        .filter(p -> p.getNome().startsWith("A"))
        .sorted(Comparator.comparing(Pessoa::getIdade))
        .toList());

}