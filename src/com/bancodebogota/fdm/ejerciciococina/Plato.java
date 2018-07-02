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
    private String receta;

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
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
               "Código receta: " + receta + "\n" ;
    }
    
    
}
