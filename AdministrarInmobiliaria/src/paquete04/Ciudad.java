package paquete04;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable {

    private String nom;
    private String prov;

    public Ciudad(String n, String p) {
        nom = n;
        prov = p;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerProv(String n) {
        prov = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerProv() {
        return prov;
    }

    @Override
    public String toString() {
        String valor = String.format("%s-%s\n", obtenerNom(),
                obtenerProv());
        return valor;
    }
}
