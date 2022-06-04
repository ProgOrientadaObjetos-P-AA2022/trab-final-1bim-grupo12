
package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {

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
}
