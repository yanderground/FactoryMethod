package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Logistica.obterLogistica;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticaNavioTest {
    @Test
    void deveExecutarEntregaNavio() {
        ILogistica logistica = obterLogistica("Navio");
        assertEquals("Entrega Concluída", logistica.concluir());
    }

    @Test
    void deveCancelarEntregaNavio() {
        ILogistica logistica = obterLogistica("Navio");
        assertEquals("Entrega Cancelada", logistica.cancelar());
    }
}
