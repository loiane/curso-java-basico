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
public class Exer11 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número inteiro");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com um outro número inteiro");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com um número real");
        double num3 = scan.nextDouble();
        
        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);
        
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
