package org.example;

public class LogisticaNavio implements ILogistica {
    public String concluir() {
        return "Entrega Concluída";
    }

    public String cancelar() {
        return "Entrega Cancelada";
    }
}