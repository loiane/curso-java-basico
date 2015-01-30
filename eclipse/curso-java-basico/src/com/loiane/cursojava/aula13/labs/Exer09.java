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
public class Exer09 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a temperatura em Farenheit:");
        double f = scan.nextDouble();
        
        double c = (5 * (f-32) / 9);
        
        System.out.println("A temperatura " + f + " F é igual a " + c + " C");
    }
}
