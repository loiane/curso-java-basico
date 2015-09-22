/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula34.labs;

/**
 *
 * @author loiane
 */
public class Contador {
    
    private static int cont;

    public Contador() {
        cont++;
    }

    public static void incrementar(){
        cont++;
    }
    
    public static void zerar(){
        cont = 0;
    }
    
    public static int obterValor(){
        return cont;
    }
}
