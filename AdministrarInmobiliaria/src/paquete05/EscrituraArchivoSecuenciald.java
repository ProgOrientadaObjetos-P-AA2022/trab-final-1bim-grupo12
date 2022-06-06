/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraArchivoSecuenciald {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Constructora registroConstructora;
    private ArrayList<Constructora> listaConstructora;

    public EscrituraArchivoSecuenciald(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaConstructora();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaConstructora().size() > 0) {
                for (int i = 0; i < obtenerListaConstructora().size(); i++) {
                    establecerRegistroConstructora(obtenerListaConstructora().get(i));
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

    public void establecerRegistroConstructora(Constructora p) {
        registroConstructora = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroConstructora); // envía el registro como 

        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaConstructora() {
        LecturaArchivoSecuenciald l
                = new LecturaArchivoSecuenciald(obtenerNombreArchivo());
        l.establecerConstructora();
        listaConstructora = l.obtenerConstructora();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Constructora> obtenerListaConstructora() {
        return listaConstructora;
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
