/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    String nivelestudio;
    String Centroeducativo;
    double valorcarrera;
    double valormensualp;

    public PrestamoEducativo(String n, String ce, double vac, double vam) {
        super(n, ce, vac, vam);
        nivelestudio = n;
        Centroeducativo =ce;
        valorcarrera = vac;
        valormensualp = vam;
        

    }
    public String getNivelestudio() {
        return nivelestudio;
    }

    public void setNivelestudio(String nivelestudio) {
        this.nivelestudio = nivelestudio;
    }
    public String getCentroeducativo() {
        return Centroeducativo;
    }
    public void setCentroeducativo(String centroeducativo) {
        Centroeducativo = centroeducativo;
    }
    public double getValorcarrera() {
        return valorcarrera;
    }
    public void setValorcarrera(double valorcarrera) {
        this.valorcarrera = valorcarrera;
    }
     public double getValormensualp() {
        return valormensualp;
    }
    public void setValormensualp(double valormensualp) {
        this.valormensualp = valormensualp;
    }

}
