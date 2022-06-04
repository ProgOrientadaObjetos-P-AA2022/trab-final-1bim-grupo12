package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa {

    private Propietario pr;
    private double p_m2;
    private double n_m2;
    private double costoF;
    private Barrio bar;
    private Ciudad cd;
    private int n_cuartos;
    private Constructora cons;

    public Casa(Propietario p, double pm2, double nm2, Barrio b, Ciudad c,
            int n_c, Constructora con) {
        pr = p;
        p_m2 = pm2;
        n_m2 = nm2;
        bar = b;
        cd = c;
        n_cuartos = n_c;
        cons = con;
    }

    public void establecerProp(Propietario n) {
        pr = n;
    }

    public void establecerPm2(double n) {
        p_m2 = n;
    }

    public void establecerNm2(double n) {
        n_m2 = n;
    }

    public void calcularCostoF() {
        costoF = n_m2 * p_m2;
    }

    public void establecerBarr(Barrio n) {
        bar = n;
    }

    public void establecerCdad(Ciudad n) {
        cd = n;
    }

    public void establecerN_cuartos(int n) {
        n_cuartos = n;
    }

    public void establecerCons(Constructora n) {
        cons = n;
    }

    public Propietario obtenerProp() {
        return pr;
    }

    public double obtenerPm2() {
        return p_m2;
    }

    public double obtenerNm2() {
        return n_m2;
    }

    public double obtenerCostoF() {
        return costoF;
    }

    public Barrio obtenerBarr() {
        return bar;
    }

    public Ciudad obtenerCdad() {
        return cd;
    }

    public int obtenerN_Cuartos() {
        return n_cuartos;
    }

    public Constructora obtenerCons() {
        return cons;
    }
}
