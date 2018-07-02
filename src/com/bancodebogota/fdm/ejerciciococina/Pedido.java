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
public class Pedido {
    private int codigoPedido;
    private int numeroPlatos;
    private int numeroMedioPlato;
    private int valorPlato;
    private double valorTotal;
    private String solicitud;

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
      
    public double calcularValorTotalPedido(){
        valorTotal = (valorPlato*numeroPlatos)+((valorPlato*0.80)*numeroMedioPlato);
        return valorTotal;
    }

    public int getValorPlato() {
        return valorPlato;
    }

    public void setValorPlato(int valorPlato) {
        this.valorPlato = valorPlato;
    }
    
    public int getNumeroMedioPlato() {
        return numeroMedioPlato;
    }

    public void setNumeroMedioPlato(int numeroMedioPlato) {
        this.numeroMedioPlato = numeroMedioPlato;
    }
    
    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getNumeroPlatos() {
        return numeroPlatos;
    }

    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void calcularValorPedido(){
                
    }

    @Override
    public String toString() {
        return "Codigo pedido: " + codigoPedido + "\n" +
               "Número de platos: " + numeroPlatos + "\n" +
               "Número de medios platos: " + numeroMedioPlato + "\n" +
               "Valor plato: " + valorPlato + "\n" +
               "Valor total: " +valorTotal +"\n"+
               "Descripción: " +solicitud +"\n";
    }
    
    
}
