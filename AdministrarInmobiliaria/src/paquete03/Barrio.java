package paquete03;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Barrio implements Serializable {

    private String nom;
    private String ref;

    public Barrio(String n, String r) {
        nom = n;
        ref = r;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerRef(String n) {
        ref = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerRef() {
        return ref;
    }

    @Override
    public String toString() {
        String valor = String.format("%s-%s\n", obtenerNom(), obtenerRef());
        return valor;
    }
}
