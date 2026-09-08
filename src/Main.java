void main() {

    ContaCorrente contaCorrente =
            new ContaCorrente("Paulo", 1);
    contaCorrente.depositar(500);
    ContaCorrente contaCorrente1 =
            new ContaCorrente("João", 2);
    contaCorrente.transferir(contaCorrente1, 100);

    System.out.println(contaCorrente.getSaldo());
    System.out.println(contaCorrente1.getSaldo());

}