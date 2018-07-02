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
public class Cliente extends Persona{
    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Código Cliente: " + codigoCliente + "\n" +
               "Número documento: " + nroDocumento + "\n" +
               "Nombre completo: " + nombres+" " + apellidos + "\n" + 
               "Dirección: " + direccion + "\n" + "Teléfono: " + telefono + "\n";
    }
    
    
}
