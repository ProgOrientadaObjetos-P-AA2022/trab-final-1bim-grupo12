/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete05.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraArchivoSecuencialDep {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Departamento registroDep;
    private ArrayList<Departamento> listaDep;

    public EscrituraArchivoSecuencialDep(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaDep();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaDep().size() > 0) {
                for (int i = 0; i < obtenerListaDep().size(); i++) {
                    establecerRegistroDep(obtenerListaDep().get(i));
                    establecerSalida();
                }
            }
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroDep(Departamento p) {
        registroDep = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroDep); // envía el registro como 

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaDep() {
        LecturaArchivoSecuencialDep l
                = new LecturaArchivoSecuencialDep(obtenerNombreArchivo());
        l.establecerDep();
        listaDep = l.obtenerDep();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Departamento> obtenerListaDep() {
        return listaDep;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        }
    }

}
