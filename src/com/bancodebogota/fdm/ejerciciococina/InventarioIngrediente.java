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
public class InventarioIngrediente extends Ingrediente{
    private String estado;
    private String contable;
    private int valor;

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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
