/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer13 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a base:");
        int base = scan.nextInt();
        
        System.out.println("Entre com a potência");
        int pot = scan.nextInt();
        
        //2^2 = 2 * 2
        //2^3 = 2 * 2 * 2
        
        int resultado = base;
        
        for (int i=1; i<pot; i++){
            resultado *= base;
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
