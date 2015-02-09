/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer07 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com segundo número:");
        int num2 = scan.nextInt();
        
        System.out.println("Entre com terceiro número:");
        int num3 = scan.nextInt();
        
        if (num1 >= num2 && num1 >= num3){
            System.out.println("num1 é maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("num2 é maior: " + num2);
        } else if (num3 >= num1 && num3 >= num2){
            System.out.println("num3 é maior: " + num3);
        } 
        
        if (num1 <= num2 && num1 <= num3){
            System.out.println("num1 é menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3){
            System.out.println("num2 é menor: " + num2);
        } else if (num3 <= num1 && num3 <= num2){
            System.out.println("num3 é menor: " + num3);
        }
    }
}
