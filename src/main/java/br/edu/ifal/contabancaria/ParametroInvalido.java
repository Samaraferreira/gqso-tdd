package br.edu.ifal.contabancaria;

public class ParametroInvalido extends Exception {

    public ParametroInvalido() {
        super("Valor inválido");
    }
}