package org.example;

public class LogisticaNavio implements ILogistica {
    public String executar() {
        return "Entrega concluída";
    }
    public String cancelar() {
        return "Entrega Cancelada";
    }
}