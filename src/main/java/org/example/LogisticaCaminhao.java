package org.example;


public class LogisticaCaminhao implements ILogistica {
    public String executar() {
        return "Entrega concluída";
    }

    public String cancelar() {
        return "Entrega Cancelada";
    }
}
