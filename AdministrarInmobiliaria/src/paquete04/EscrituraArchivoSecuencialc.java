/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete03.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EscrituraArchivoSecuencialc {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Ciudad registroCiudad;
    private ArrayList<Ciudad> listaCiudad;

    public EscrituraArchivoSecuencialc(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCiudad();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCiudad().size() > 0) {
                for (int i = 0; i < obtenerListaCiudad().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudad().get(i));
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

    public void establecerRegistroCiudad(Ciudad p) {
        registroCiudad = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCiudad); // envía el registro como 

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaCiudad() {
        LecturaArchivoSecuencialc l
                = new LecturaArchivoSecuencialc(obtenerNombreArchivo());
        l.establecerCiudad();
        listaCiudad = l.obtenerCiudad();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Ciudad> obtenerListaCiudad() {
        return listaCiudad;
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
