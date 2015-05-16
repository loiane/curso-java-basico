/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

/**
 *
 * @author loiane
 */
public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    
    boolean ligada;
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
    
    void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
