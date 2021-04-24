package br.edu.ifal.contabancaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaTest {

    private Conta conta;

    @BeforeEach
    public void setUp() {
        this.conta = new Conta();
    }

    @Test
    public void deveRetornarSaldoIncrementadoAoFazerDeposito() throws ParametroInvalido {
        assertEquals(10, conta.deposito(10));
    }

    @Test
    public void deveRetornarExcecaoQuandoParametroForInvalido() throws ParametroInvalido {
        assertThrows(ParametroInvalido.class, () -> conta.deposito(0));

        assertThrows(ParametroInvalido.class, () -> conta.saque(0));
    }

    @Test
    public void deveRetornarSaldoDecrementadoAoFazerSaque() throws ParametroInvalido {
        conta.deposito(10);
        assertEquals(5, conta.saque(5));
    }
}
