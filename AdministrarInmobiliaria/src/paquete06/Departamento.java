
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento {

    private Propietario pr;
    private double p_m2;
    private double n_m2;
    private double al;
    private double c_final;
    private Barrio bar;
    private Ciudad c;
    private String n_ed;
    private String ubi;
    private Constructora cons;

    public Departamento(Propietario p, double vm2, double nm2, double a, Barrio b,
            Ciudad c_, String n, String ub, Constructora constr) {
        pr = p;
        p_m2 = vm2;
        n_m2 = nm2;
        al = a;
        bar = b;
        c = c_;
        n_ed = n;
        ubi = ub;
        cons = constr;
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

    public void establecerAl(double n) {
        al = n;
    }

    public void calcularC_f() {
        c_final = (n_m2 * p_m2) + (al * 12);
    }

    public void establecerBarr(Barrio n) {
        bar = n;
    }

    public void establecerCdad(Ciudad n) {
        c = n;
    }

    public void establecerNom(String n) {
        n_ed = n;
    }

    public void establecerUbi(String n) {
        ubi = n;
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

    public double obtenerAl() {
        return al;
    }

    public double obtenerC_f() {
        return c_final;
    }

    public Barrio obtenerBarr() {
        return bar;
    }

    public Ciudad obtenerCdad() {
        return c;
    }

    public String obtenerNom() {
        return n_ed;
    }

    public String obtenerUbi() {
        return ubi;
    }

    public Constructora obtenerCons() {
        return cons;
    }
}
