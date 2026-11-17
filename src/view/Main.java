import model.Pessoa;

void main(){

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João", 20));
    pessoas.add(new Pessoa("Ana", 22));
    pessoas.add(new Pessoa("José", 19));
    System.out.println(pessoas);

    Collections.sort(pessoas,
            Comparator.comparing(Pessoa::getNome));
    System.out.println("Ordenados por nome:");
    System.out.println(pessoas);
    System.out.println("Ordenados por idade:");
    //TODO: com lambda, ordenar por idade
    Collections.sort(pessoas, (o1,o2)->
            o1.getIdade()-o2.getIdade());
    System.out.println(pessoas);

}