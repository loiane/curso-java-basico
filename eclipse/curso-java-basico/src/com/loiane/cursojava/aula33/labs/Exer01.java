/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

/**
 *
 * @author loiane
 */
public class Exer01 {
    
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        
        lampada.mostrarEstado();
        
        lampada.desligar();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
    }
}
