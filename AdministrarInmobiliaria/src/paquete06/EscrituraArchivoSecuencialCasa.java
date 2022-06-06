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

public class EscrituraArchivoSecuencialCasa {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Casa registroCasa;
    private ArrayList<Casa> listaCasa;

    public EscrituraArchivoSecuencialCasa(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCasa();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCasa().size() > 0) {
                for (int i = 0; i < obtenerListaCasa().size(); i++) {
                    establecerRegistroCasa(obtenerListaCasa().get(i));
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

    public void establecerRegistroCasa(Casa p) {
        registroCasa = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroCasa); // envía el registro como 

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaCasa() {
        LecturaArchivoSecuencialCasa l
                = new LecturaArchivoSecuencialCasa(obtenerNombreArchivo());
        l.establecerCasa();
        listaCasa = l.obtenerCasa();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Casa> obtenerListaCasa() {
        return listaCasa;
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
