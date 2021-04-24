package br.edu.ifal.contabancaria;

public class Conta {

    private double saldo = 0.0;

    public double deposito(double valor) throws ParametroInvalido {
        if (valor == 0) {
            throw new ParametroInvalido();
        }
        saldo += valor;
        return saldo;
    }

    public double saque(double valor) throws ParametroInvalido, SaldoInsuficiente {
        if (valor == 0) {
            throw new ParametroInvalido();
        }
        if (valor > saldo) {
            throw new SaldoInsuficiente();
        }
        saldo -= valor;
        return saldo;
    }

    public double getSaldo() {
        return 0;
    }
}
