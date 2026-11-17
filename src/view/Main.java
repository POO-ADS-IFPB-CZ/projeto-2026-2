import model.Pessoa;

void main(){

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João", 20));
    pessoas.add(new Pessoa("Ana", 22));
    pessoas.add(new Pessoa("José", 19));
    System.out.println(pessoas);

    Collections.sort(pessoas, new ComparadorPessoaNome());
    System.out.println(pessoas);

}

class ComparadorPessoaNome
        implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}