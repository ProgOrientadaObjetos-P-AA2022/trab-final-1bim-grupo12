/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {

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
}
