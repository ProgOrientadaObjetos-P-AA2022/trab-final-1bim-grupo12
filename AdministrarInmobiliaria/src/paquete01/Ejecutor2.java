package paquete01;

import java.util.Scanner;
import paquete02.EscrituraArchivoSecuencial;
import paquete02.LecturaArchivoSecuencial;
import paquete02.Propietario;
import paquete03.*;
import paquete04.*;
import paquete05.*;
import paquete06.*;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Menú:");
        int opc;
        do {
            System.out.println("Ingresar casas          [1]");
            System.out.println("Ingresar departamento   [2]");
            System.out.println("Salir                   [0]");
            entrada.nextLine();
            opc = entrada.nextInt();
            if (opc == 1) {
                String nombreArchivo = "propietarios.dat";
                System.out.println("Ingrese el Id del propietario:");
                String a = entrada.nextLine();
                entrada.nextLine();
                
                Propietario prop_buscar;
                EscrituraArchivoSecuencial archivo
                        = new EscrituraArchivoSecuencial(nombreArchivo);

                LecturaArchivoSecuencial lectura
                        = new LecturaArchivoSecuencial(nombreArchivo);
                lectura.establecerIdentificador(a);
                lectura.establecerPropietarioBuscado();
                prop_buscar = lectura.obtenerPropietarioBuscado();

                String nombreArchivo2 = "barrio.dat";
                System.out.println("Ingrese el barrio del propietario:");
                String a2 = entrada.nextLine();

                Barrio barr_buscar;
                EscrituraArchivoSecuencialb archivo2
                        = new EscrituraArchivoSecuencialb(nombreArchivo2);

                LecturaArchivoSecuencialb lectura2
                        = new LecturaArchivoSecuencialb(nombreArchivo2);
                lectura2.establecerIdentificador(a2);
                lectura2.establecerBarrioBuscado();
                barr_buscar = lectura2.obtenerBarrioBuscado();

                String nombreArchivo3 = "ciudades.dat";
                System.out.println("Ingrese la ciudad del propietario:");
                String a3 = entrada.nextLine();

                Ciudad ciud_buscar;
                EscrituraArchivoSecuencialc archivo3
                        = new EscrituraArchivoSecuencialc(nombreArchivo3);

                LecturaArchivoSecuencialc lectura3
                        = new LecturaArchivoSecuencialc(nombreArchivo3);
                lectura3.establecerIdentificador(a2);
                lectura3.establecerCiudadBuscado();
                ciud_buscar = lectura3.obtenerCiudadBuscado();

                String nombreArchivo4 = "constructoras.dat";
                System.out.println("Ingrese el id de la empresa:");
                String a4 = entrada.nextLine();

                Constructora cons_buscar;
                EscrituraArchivoSecuenciald archivo4
                        = new EscrituraArchivoSecuenciald(nombreArchivo4);

                LecturaArchivoSecuenciald lectura4
                        = new LecturaArchivoSecuenciald(nombreArchivo4);
                lectura4.establecerIdentificador(a2);
                lectura4.establecerConstructoraBuscado();
                cons_buscar = lectura4.obtenerConstructoraBuscado();

                if (prop_buscar != null && barr_buscar != null && ciud_buscar
                        != null && cons_buscar != null) {
                    ;
                    System.out.println("Ingrese el precio por metro cuadrado:");
                    double pr = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados:");
                    double m2 = entrada.nextDouble();

                    System.out.println("Ingrese el número de cuartos:");
                    int n = entrada.nextInt();

                    String archi = "casas.dat";
                    Casa casa = new Casa(prop_buscar, pr, m2, barr_buscar,
                            ciud_buscar, n, cons_buscar);
                    casa.calcularCostoF();
                    EscrituraArchivoSecuencialCasa arch
                            = new EscrituraArchivoSecuencialCasa(archi);
                    arch.establecerRegistroCasa(casa);
                    arch.establecerSalida();
                    arch.cerrarArchivo();

                    LecturaArchivoSecuencialCasa l
                            = new LecturaArchivoSecuencialCasa(archi);
                    l.establecerCasa();
                } else {
                    System.out.println("Propietario no encontrado");
                    System.out.println("Barrio no encontrado");
                    System.out.println("Ciudad no encontrada");
                    System.out.println("Constructora no encontrada");
                }
            } else {
                if (opc == 2) {
                    String nombreArchivo = "propietarios.dat";
                   entrada.nextLine();               
                    System.out.println("Ingrese el Id del propietario:");
                    String a = entrada.nextLine();

                    Propietario prop_buscar;
                    EscrituraArchivoSecuencial archivo
                            = new EscrituraArchivoSecuencial(nombreArchivo);

                    LecturaArchivoSecuencial lectura
                            = new LecturaArchivoSecuencial(nombreArchivo);
                    lectura.establecerIdentificador(a);
                    lectura.establecerPropietarioBuscado();
                    prop_buscar = lectura.obtenerPropietarioBuscado();

                    String nombreArchivo2 = "barrio.dat";
                    System.out.println("Ingrese el barrio del propietario:");
                    String a2 = entrada.nextLine();

                    Barrio barr_buscar;
                    EscrituraArchivoSecuencialb archivo2
                            = new EscrituraArchivoSecuencialb(nombreArchivo2);

                    LecturaArchivoSecuencialb lectura2
                            = new LecturaArchivoSecuencialb(nombreArchivo2);
                    lectura2.establecerIdentificador(a2);
                    lectura2.establecerBarrioBuscado();
                    barr_buscar = lectura2.obtenerBarrioBuscado();

                    String nombreArchivo3 = "ciudades.dat";
                    System.out.println("Ingrese la ciudad del propietario:");
                    String a3 = entrada.nextLine();

                    Ciudad ciud_buscar;
                    EscrituraArchivoSecuencialc archivo3
                            = new EscrituraArchivoSecuencialc(nombreArchivo3);

                    LecturaArchivoSecuencialc lectura3
                            = new LecturaArchivoSecuencialc(nombreArchivo3);
                    lectura3.establecerIdentificador(a2);
                    lectura3.establecerCiudadBuscado();
                    ciud_buscar = lectura3.obtenerCiudadBuscado();

                    String nombreArchivo4 = "constructoras.dat";
                    System.out.println("Ingrese el id de la empresa:");
                    String a4 = entrada.nextLine();

                    Constructora cons_buscar;
                    EscrituraArchivoSecuenciald archivo4
                            = new EscrituraArchivoSecuenciald(nombreArchivo4);

                    LecturaArchivoSecuenciald lectura4
                            = new LecturaArchivoSecuenciald(nombreArchivo4);
                    lectura4.establecerIdentificador(a2);
                    lectura4.establecerConstructoraBuscado();
                    cons_buscar = lectura4.obtenerConstructoraBuscado();

                    if (prop_buscar != null && barr_buscar != null && ciud_buscar
                            != null && cons_buscar != null) {

                        System.out.println("Ingrese el precio por metro "
                                + "cuadrado:");
                        double pr = entrada.nextDouble();
                        System.out.println("Ingrese el número de metros "
                                + "cuadrados:");
                        double m2 = entrada.nextDouble();
                        System.out.println("Ingrese el valor de la alícuota "
                                + "mensual:");
                        double al = entrada.nextDouble();
                        System.out.println("Ingrese el nombre del edificio:");
                        String nom = entrada.nextLine();

                        System.out.println("Ingrese la ubicacion del edificio:");
                        String ubi = entrada.nextLine();

                        String archi = "departamentos.dat";
                        Departamento dep = new Departamento(prop_buscar, pr, m2,
                                al, barr_buscar, ciud_buscar, nom, ubi, cons_buscar);
                        dep.calcularC_f();
                        EscrituraArchivoSecuencialDep arch
                                = new EscrituraArchivoSecuencialDep(archi);
                        arch.establecerRegistroDep(dep);
                        arch.establecerSalida();
                        arch.cerrarArchivo();

                        LecturaArchivoSecuencialDep l
                                = new LecturaArchivoSecuencialDep(archi);
                        l.establecerDep();
                    } else {
                        System.out.println("Propietario no encontrado");
                        System.out.println("Barrio no encontrado");
                        System.out.println("Ciudad no encontrada");
                        System.out.println("Constructora no encontrada");
                    }
                }
            }
        } while (opc != 0);

    }

}
