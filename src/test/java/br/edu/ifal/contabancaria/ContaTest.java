package br.edu.ifal.contabancaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        this.conta = new Conta();
    }

    @Test
    public void deveRetornarSaldoIncrementadoAoFazerDeposito() {
        assertEquals(10, conta.deposito(10));
    }

}
