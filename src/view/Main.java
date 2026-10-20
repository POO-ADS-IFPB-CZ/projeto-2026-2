import model.Cadastro;

void main(){

    Cadastro<? extends Number> cadastroNumber;
    Integer numeros[] = {3,2,1};
    Cadastro<Integer> cadastroInteger
            = new Cadastro<>(numeros);
    cadastroNumber = cadastroInteger;
}