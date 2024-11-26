package es.gianmarco.ejemplos.appsspring.beans;

import org.springframework.stereotype.Component;

@Component
public class Contador {
    private int contador;

    public Contador() {
        this.contador = 0;
    }

    public void incrementar() {
        contador++;
    }
    
    public int getContador() {
        return contador;
    }

}
