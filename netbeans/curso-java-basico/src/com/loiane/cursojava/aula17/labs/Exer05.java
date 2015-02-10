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
public class Exer05 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double popA;
        double popB;
        double taxaA;
        double taxaB;
        
        boolean valido = false;
        do {
            
            System.out.println("Entre com a população A:");
            popA = scan.nextDouble();
            
            if (popA > 0){
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        valido = false;
        do {
            
            System.out.println("Entre com a população B:");
            popB = scan.nextDouble();
            
            if (popB > 0){
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        valido = false;
        do {
            
            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = scan.nextDouble();
            
            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento A precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        valido = false;
        do {
            
            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaB = scan.nextDouble();
            
            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento B precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        int cont = 0;
        
        while (popA < popB){
            
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }
        
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:     " + cont);
    }
}
