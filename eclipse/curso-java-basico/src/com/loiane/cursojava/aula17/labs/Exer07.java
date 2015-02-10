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
public class Exer07 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        int maior = Integer.MIN_VALUE;
        
        for (int i=0; i<5; i++){
            
            System.out.println("Entre com um número:");
            num = scan.nextInt();
            
            if (num > maior){
                maior = num;
                System.out.println("o número maior mudou: " + maior);
            }
        }
        
        System.out.println("O maior número digitado foi: " + maior);
    }
}
