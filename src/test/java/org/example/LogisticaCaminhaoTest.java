package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Logistica.obterLogistica;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticaCaminhaoTest {
    @Test
    void deveConcluirEntregaCaminhao() {
        ILogistica logistica = obterLogistica("Caminhao");
        assertEquals("Entrega Concluída", logistica.concluir());
    }

    @Test
    void deveCancelarEntregaCaminhao() {
        ILogistica logistica = obterLogistica("Navio");
        assertEquals("Entrega Cancelada", logistica.cancelar());
    }
}
