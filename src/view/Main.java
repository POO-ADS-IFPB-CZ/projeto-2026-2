void main(){
    int valores[] = {3,5,8,1,0};
    String nomes[] = {"João", "Maria", "Pedro", "Ana"};

    for(int i=0;i<valores.length;i++){
        valores[i]++;
    }

    for(int i: valores){
        i++;
    }

    for(int i:valores){
        System.out.println(i);
    }

}