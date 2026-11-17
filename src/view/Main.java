import model.Pessoa;

void main(){

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João", 20));
    pessoas.add(new Pessoa("Ana", 22));
    pessoas.add(new Pessoa("José", 19));
    System.out.println(pessoas);

    Collections.sort(pessoas,
            Comparator.comparing(Pessoa::getNome));
    System.out.println(pessoas);

}