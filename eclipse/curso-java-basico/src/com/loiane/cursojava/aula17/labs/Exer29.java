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
public class Exer29 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        boolean primo;
        
        for (int i=1; i<=num; i++){
            
            primo = true;
        
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    //System.out.println("Não é primo - divisível por " + i);
                    primo = false;
                    //break;
                }
            }

            if (primo){
                System.out.println(i);
            }
        }
    }
}
