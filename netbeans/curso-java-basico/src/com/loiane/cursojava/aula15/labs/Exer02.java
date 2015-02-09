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
public class Exer02 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número:");
        int num = scan.nextInt();
        
        if (num >= 0){
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é negativo");
        }
    }
}
