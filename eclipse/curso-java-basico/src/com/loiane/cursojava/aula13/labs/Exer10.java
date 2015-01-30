/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer10 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a temperatura em Celsius:");
        double c = scan.nextDouble();
        
        double f = (c * 1.8) + 32;
        
        System.out.println("A temperatura " + c + " C é igual a " + f + " F");
    }
}
