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
public class Exer26 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        
        System.out.println("Fatorial de " + num);
        
        System.out.print(num + "! = ");
        
        int fatorial = 1;
        for (int i=num; i>1; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }
        
        System.out.print(" 1 = " + fatorial);
       
    }
}
