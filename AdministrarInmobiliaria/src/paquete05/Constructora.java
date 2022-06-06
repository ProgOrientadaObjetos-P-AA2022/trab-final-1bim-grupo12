package paquete05;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable {

    private String nom;
    private String id;

    public Constructora(String n, String iD) {
        nom = n;
        id = iD;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerId(String n) {
        id = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerId() {
        return id;
    }

    @Override
    public String toString() {
        String valor = String.format("%s-%s\n", obtenerNom(),
                obtenerId());
        return valor;
    }
}
