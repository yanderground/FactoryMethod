package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LogisticaTest {
    @Test
    void deveRetornarExcecaoParaEntregaInexistente() {
        try {
            ILogistica logistica = Logistica.obterLogistica("Erro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEntregaInvalida() {
        try {
            ILogistica logistica = Logistica.obterLogistica("Cancelada");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inexistente", e.getMessage());
        }
    }
}
