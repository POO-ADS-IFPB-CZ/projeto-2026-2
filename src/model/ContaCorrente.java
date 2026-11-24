package model;

import exceptions.LimiteExcedidoException;
import exceptions.SaldoInsuficienteException;
import exceptions.ValorInvalidoException;

public class ContaCorrente {

    private int numero;
    private String titular;
    private float saldo;
    private float limite;

    public ContaCorrente(int numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public boolean sacar(float valor)
            throws SaldoInsuficienteException,
            LimiteExcedidoException{
        if(valor > saldo)
            throw new SaldoInsuficienteException(
                "O valor solicitado é maior que o saldo");
        if(valor > limite)
            throw new LimiteExcedidoException(
                "Limite diário excedido");
        saldo -= valor;
        return true;
    }

    public boolean depositar(float valor)
            throws ValorInvalidoException,
            LimiteExcedidoException {
        if(valor < 0)
            throw new ValorInvalidoException(
                "O valor deve ser maior que zero");
        if(valor > limite)
            throw new LimiteExcedidoException(
                "Valor superior ao limite diário");
        saldo-=valor;
        return true;
    }

}
