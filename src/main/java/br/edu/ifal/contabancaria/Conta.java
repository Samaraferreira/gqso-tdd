package br.edu.ifal.contabancaria;

public class Conta {

    private double saldo = 0.0;

    public double deposito(double valor) {
        saldo += valor;
        return saldo;
    }
}
