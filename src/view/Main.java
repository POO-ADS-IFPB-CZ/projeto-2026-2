void main(){

    Random random = new Random();
    List<Integer> numeros =
            random.ints(30,0,
            100).boxed().toList();

    //Numeros sem repetição e ordenados
    numeros.stream()
            .sorted()
            .distinct()
            .forEach(System.out::println);

}