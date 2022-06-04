/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {

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
}
