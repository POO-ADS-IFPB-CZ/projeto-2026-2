void main(){
    // Array multidimensional
    int array[][] = {{4,3,1,5},{3,2},{3,2,5,6,1},{3,4,6}};

    for(int i[] : array){
        for(int j: i){
            System.out.print(j+ " ");
        }
        System.out.println();
    }

}