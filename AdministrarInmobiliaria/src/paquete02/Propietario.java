package paquete02;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable {

    private String nom;
    private String ap;
    private String id;

    public Propietario(String n, String a, String iD) {
        nom = n;
        ap = a;
        id = iD;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerAp(String n) {
        ap = n;
    }

    public void establecerId(String n) {
        id = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerAp() {
        return ap;
    }

    public String obtenerId() {
        return id;
    }
}
