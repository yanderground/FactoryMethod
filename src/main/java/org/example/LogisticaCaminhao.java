package org.example;


public class LogisticaCaminhao implements ILogistica {
    public String concluir() {
        return "Entrega Concluída";
    }

    public String cancelar() {
        return "Entrega Cancelada";
    }
}
