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
public abstract class Ingrediente {
    protected int codigoIngrediente;
    protected String nombre;
    protected int cantidad;
    protected String medida;
    
    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    

    public int agregarIngrediente(){
        
         return codigoIngrediente;
    }
    
    public int calcularCantidadTotal(){
        
         return cantidad;
    }
    

    public int getCodigoIngrediente() {
        return codigoIngrediente;
    }

    public void setCodigoIngrediente(int codigoIngrediente) {
        this.codigoIngrediente = codigoIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    void setEstado(String sólido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setContable(String no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setValor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
