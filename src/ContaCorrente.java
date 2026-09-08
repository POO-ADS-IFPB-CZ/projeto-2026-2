public class ContaCorrente {

    private String titular;
    private int numero;
    private float saldo;

    public ContaCorrente (String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        saldo = 0;
    }

    //TODO: Criar getters e setters de titular e numero

    public float getSaldo(){
        return saldo;
    }

    public boolean sacar(float valor){
        if(valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public boolean depositar(float valor){
        if(valor > 5000) return false;
        saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente destino,
              float valor){
        if(valor > saldo) return false;
        sacar(valor);
        destino.depositar(valor);
        return true;
    }

}
