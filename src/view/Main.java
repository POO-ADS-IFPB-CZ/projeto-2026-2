void main(){

    String frase = IO.readln(
            "Digite uma frase, sem pontuação:");
    System.out.println(Arrays.stream(frase.toUpperCase()
                    .split(" "))
            .distinct()
            .sorted()
            .toList());

}