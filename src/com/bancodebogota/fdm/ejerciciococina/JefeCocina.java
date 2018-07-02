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
public class JefeCocina extends Persona{
    private int codigoJefeCocina;
    private int salario;
    private int nroHorasLaboradas;
    private int valorHora;
    
   

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCodigoJefeCocina() {
        return codigoJefeCocina;
    }

    public void setCodigoJefeCocina(int codigoJefeCocina) {
        this.codigoJefeCocina = codigoJefeCocina;
    }

    @Override
    public String toString() {
        //return "Nombre: " + nombres + " Apellidos: " + apellidos; //To change body of generated methods, choose Tools | Templates.
        return "Número documento: " + nroDocumento + "\n" +
               "Nombre completo: " + nombres+" " + apellidos + "\n" + 
               "Dirección: " + direccion + "\n" + "Teléfono: " + telefono + "\n" +
               "Salario: " + salario;
       
    }
    
     
    
}
