import model.Aluno;

void main(){

    List<String> nomes = new ArrayList<>();
    nomes.add("João");
    nomes.add("Maria");
    nomes.add("Ana");
    nomes.add("José");
    nomes.add("Pedro");
    System.out.println(nomes);
    Collections.sort(nomes);
    System.out.println("Nomes ordenados: "+nomes);
    System.out.println(Collections.binarySearch(nomes,
            "Paulo"));
    Collections.shuffle(nomes);
    System.out.println(nomes);

}