package paquete01;

import java.util.Scanner;
import paquete02.EscrituraArchivoSecuencial;
import paquete02.LecturaArchivoSecuencial;
import paquete02.Propietario;
import paquete03.*;
import paquete04.*;
import paquete05.*;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            String nombreArchivo = "propietarios.dat";
            System.out.println("Ingresar nombres del propietario:");
            String n = entrada.nextLine();
            System.out.println("Ingresar apellidos del propietario:");
            String ap = entrada.nextLine();
            System.out.println("Ingresar id del propietario:");
            String id = entrada.nextLine();
            Propietario pro = new Propietario(n, ap, id);
            EscrituraArchivoSecuencial archivo
                    = new EscrituraArchivoSecuencial(nombreArchivo);
            archivo.establecerRegistroProp(pro);
            archivo.establecerSalida();
            archivo.cerrarArchivo();

            LecturaArchivoSecuencial lectura
                    = new LecturaArchivoSecuencial(nombreArchivo);
            lectura.establecerProp();
            System.out.println(lectura);
            System.out.println("¿Desea ingresar otro propietario?");
            String a = entrada.nextLine();
            if (a != "Si" || a != "si") {
                bandera = false;
            }
        }

        boolean bandera2 = true;
        while (bandera2) {
            String nombreArchivo = "barrios.dat";
            System.out.println("Ingresar nombre del barrio:");
            String n = entrada.nextLine();
            System.out.println("Ingresar referencia del barrio:");
            String ref = entrada.nextLine();
            Barrio barr = new Barrio(n, ref);
            EscrituraArchivoSecuencialb archivo
                    = new EscrituraArchivoSecuencialb(nombreArchivo);
            archivo.establecerRegistroBarrio(barr);
            archivo.establecerSalida();
            archivo.cerrarArchivo();

            LecturaArchivoSecuencialb lectura
                    = new LecturaArchivoSecuencialb(nombreArchivo);
            lectura.establecerBarrio();
            System.out.println(lectura);
            System.out.println("¿Desea ingresar otro barrio?");
            String a = entrada.nextLine();
            if (a != "Si" || a != "si") {
                bandera2 = false;
            }
        }

        boolean bandera3 = true;
        while (bandera3) {
            String nombreArchivo = "ciudades.dat";
            System.out.println("Ingresar el nombre de la ciudad:");
            String n = entrada.nextLine();
            System.out.println("Ingresar el nombre de la provincia:");
            String prov = entrada.nextLine();
            Ciudad ciud = new Ciudad(n, prov);
            EscrituraArchivoSecuencialc archivo
                    = new EscrituraArchivoSecuencialc(nombreArchivo);
            archivo.establecerRegistroCiudad(ciud);
            archivo.establecerSalida();
            archivo.cerrarArchivo();

            LecturaArchivoSecuencialc lectura
                    = new LecturaArchivoSecuencialc(nombreArchivo);
            lectura.establecerCiudad();
            System.out.println(lectura);
            System.out.println("¿Desea ingresar otra ciudad ?");
            String a = entrada.nextLine();
            if (a != "Si" || a != "si") {
                bandera3 = false;
            }
        }

        boolean bandera4 = true;
        while (bandera4) {
            String nombreArchivo = "constructoras.dat";
            System.out.println("Ingresar el nombre de la constructora:");
            String n = entrada.nextLine();
            System.out.println("Ingresar el id de la empresa:");
            String id = entrada.nextLine();
            Constructora cons = new Constructora(n, id);
            EscrituraArchivoSecuenciald archivo
                    = new EscrituraArchivoSecuenciald(nombreArchivo);
            archivo.establecerRegistroConstructora(cons);
            archivo.establecerSalida();
            archivo.cerrarArchivo();

            LecturaArchivoSecuenciald lectura
                    = new LecturaArchivoSecuenciald(nombreArchivo);
            lectura.establecerConstructora();
            System.out.println(lectura);
            System.out.println("¿Desea ingresar otra ciudad ?");
            String a = entrada.nextLine();
            if (a != "Si" || a != "si") {
                bandera3 = false;
            }
        }
        System.out.println("Menú:");
        int opc;
        do {
            System.out.println("Ingresar casas          [1]");
            System.out.println("Ingresar departamento   [2]");
            System.out.println("Salir                   [0]");
            opc = entrada.nextInt();
            if (opc == 1) {
                String nombreArchivo = "propietarios.dat";
                System.out.println("Ingrese el id del propietario:");
                String a = entrada.nextLine();

                Propietario prop_buscar;
                EscrituraArchivoSecuencial archivo
                        = new EscrituraArchivoSecuencial(nombreArchivo);

                LecturaArchivoSecuencial lectura
                        = new LecturaArchivoSecuencial(nombreArchivo);
                lectura.establecerIdentificador(a);
                lectura.establecerPropietarioBuscado();
                prop_buscar = lectura.obtenerPropietarioBuscado();
                if (prop_buscar != null) {
                    System.out.println("Ingrese el precio por metro cuadrado:");
                    double pr = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados:");
                    double m2 = entrada.nextDouble();
                    System.out.println("Ingrese el nombre del barrio ");
                } else {
                    System.out.println("Propietario no encontrado");
                }
            }
        } while (opc != 0);

    }

}
