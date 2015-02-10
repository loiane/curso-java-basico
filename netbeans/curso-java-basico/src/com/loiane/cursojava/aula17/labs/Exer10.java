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
public class Exer10 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();
        
        for (int i=num1; i<=num2; i++){
            System.out.println(i);
        }
    }
}
