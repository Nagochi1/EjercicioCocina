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
public class Ingrediente {
    private int codigoIngrediente;
    private String nombre;
    private int cantidad;
    private String medida;
    private String estado;
    private String contable;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContable() {
        return contable;
    }

    public void setContable(String contable) {
        this.contable = contable;
    }

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

    @Override
    public String toString() {
        return "Codigo ingrediente: " + codigoIngrediente + "\n" +
               "Nombre: " + nombre + "\n" +
               "Cantidad: " + cantidad + "\n" +
               "Unidad medida: " + medida + "\n" +
               "Estado: " +estado +"\n" +
               "Contable: " + contable+ "\n" +
               "Valor: " +valor + "\n";
    }

    
      
    
    
    
    
    
}
