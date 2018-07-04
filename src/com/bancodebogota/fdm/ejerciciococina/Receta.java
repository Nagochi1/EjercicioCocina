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
public class Receta{

    private String codigoReceta;
    private String nombre;
    private Ingrediente[] listaIngredientes;
    
    public Ingrediente[] getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(Ingrediente[] listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    
    public String getCodigoReceta() {
        return codigoReceta;
    }

    public void setCodigoReceta(String codigoReceta) {
        this.codigoReceta = codigoReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String resultado = "Código Receta: " + codigoReceta + "\n" +
                "Nombre Receta: " + nombre + "\n" + "Ingredientes:------- " + "\n" ;
                
        
        for (Ingrediente listaIngrediente : listaIngredientes) {
            resultado += listaIngrediente; 
            resultado+="\n";
        }
        
        return resultado;
        
    }

   
    
    
    
}
