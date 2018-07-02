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
public class Cocina {
    private int codigoCocina;
    private String especialidad;
    private String direccion;
    private String telefono;
    private JefeCocina jefeCocina;
    private Receta[] inventarioRecetas;

    public Receta[] getInventarioRecetas() {
        return inventarioRecetas;
    }

    public void setInventarioRecetas(Receta[] inventarioRecetas) {
        this.inventarioRecetas = inventarioRecetas;
    }

    public JefeCocina getJefeCocina() {
        return jefeCocina;
    }

    public void setJefeCocina(JefeCocina jefeCocina) {
        this.jefeCocina = jefeCocina;
    }

    public int getCodigoCocina() {
        return codigoCocina;
    }

    public void setCodigoCocina(int codigoCocina) {
        this.codigoCocina = codigoCocina;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cocina: " + codigoCocina + "\n" +
               "Especialidad: " + especialidad + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono+"\n" +
               "Jefe cocina: " + jefeCocina.nroDocumento; 
    }
    
    
    
    
    
}
