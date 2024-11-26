package es.gianmarco.ejemplos.primeraweb.repositories.base;

public interface Repository <T,ID>{
    T findById(ID id);
}
