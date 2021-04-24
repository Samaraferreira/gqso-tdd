package br.edu.ifal.contabancaria;

public class SaldoInsuficiente extends Exception {

    public SaldoInsuficiente() {
        super("Saldo insuficiente");
    }
}