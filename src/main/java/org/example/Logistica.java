package org.example;

public class Logistica {

    public static ILogistica obterLogistica(String logistica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Logistica" + logistica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Entrega inexistente");
        }
        if (!(objeto instanceof ILogistica)) {
            throw new IllegalArgumentException("Entrega Invalida");
        }
        return (ILogistica) objeto;
    }
}