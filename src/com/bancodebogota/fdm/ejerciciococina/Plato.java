/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.ejerciciococina;

/**
 *
 * @author NAGOCHI
 */
public class Plato {
    private int codigoPlato;
    private String tipoPlato;
    protected String codReceta;

    public String getCodReceta() {
        return codReceta;
    }

    public void setCodReceta(String codReceta) {
        this.codReceta = codReceta;
    }


    public int getCodigoPlato() {
        return codigoPlato;
    }

    public void setCodigoPlato(int codigoPlato) {
        this.codigoPlato = codigoPlato;
    }

    public String getTipoPlato() {
        return tipoPlato;
    }

    public void setTipoPlato(String tipoPlato) {
        this.tipoPlato = tipoPlato;
    }

        @Override
    public String toString() {
        return "Codigo Plato: " + codigoPlato + "\n" +
               "Tipo plato: " + tipoPlato + "\n"+
               "Código receta: " + codReceta + "\n";
    }
    
    
}
