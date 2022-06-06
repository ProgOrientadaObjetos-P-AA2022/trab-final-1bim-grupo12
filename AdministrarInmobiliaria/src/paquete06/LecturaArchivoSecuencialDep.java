package paquete06;

import paquete05.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaArchivoSecuencialDep {

    private ObjectInputStream entrada;
    private ArrayList<Departamento> dep;
    private String nombreArchivo;
    private String identificador;
    private Departamento depBuscado;

    public LecturaArchivoSecuencialDep(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerDep() {
        dep = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    dep.add(registro);
                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

   

    public ArrayList<Departamento> obtenerDep() {
        return dep;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }


    @Override
    public String toString() {
        String cadena = "Lista de Departamentos\n";
        for (int i = 0; i < dep.size(); i++) {
            Departamento p = dep.get(i);
            cadena = String.format("%s(%d) %s\n", cadena, (i+1), p.toString());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
