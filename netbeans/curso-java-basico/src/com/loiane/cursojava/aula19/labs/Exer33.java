/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer33 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        boolean primo;
        String msg;
        
        for (int i=0; i<vetorA.length; i++){
            
            primo = true;
            for (int j=2; j<vetorA[i]; j++){
                if (vetorA[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            
            msg = "";
            if (primo){
                msg = " primo";
            } else {
                msg = " não é primo";
            }
            
            System.out.println(vetorA[i] + msg);
        }
    }    
}
