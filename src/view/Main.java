import model.Pessoa;

void main(){

    List<Pessoa> pessoas = new LinkedList<>();
    pessoas.add(
        new Pessoa("111.111.111-01","João"));
    pessoas.add(
        new Pessoa("222.222.222-02","Maria"));

    pessoas.remove(
        new Pessoa("111.111.111-01","João"));

    System.out.println(pessoas);
}