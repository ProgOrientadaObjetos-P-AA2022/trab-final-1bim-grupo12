/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EscrituraArchivoSecuencialb {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Barrio registroBarrio;
    private ArrayList<Barrio> listaBarrio;

    public EscrituraArchivoSecuencialb(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaBarrios(); 
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaBarrio().size() > 0) {
                for (int i = 0; i < obtenerListaBarrio().size(); i++) {
                    establecerRegistroBarrio(obtenerListaBarrio().get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } 
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroBarrio(Barrio p) {
        registroBarrio = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroBarrio); // envía el registro como 
            
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaBarrios() {
        LecturaArchivoSecuencialb l
                = new LecturaArchivoSecuencialb(obtenerNombreArchivo());
        l.establecerBarrio();
        listaBarrio = l.obtenerBarrio();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Barrio> obtenerListaBarrio() {
        return listaBarrio;
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
        }
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } 
    }

}
