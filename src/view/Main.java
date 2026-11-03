void main(){

    Stack<String> pilha = new Stack<>();
    pilha.push("João");
    pilha.push("Maria");
    pilha.push("José");

    System.out.println("Topo: "+pilha.peek());

    while(!pilha.isEmpty()){
        System.out.println(pilha.pop());
    }

}