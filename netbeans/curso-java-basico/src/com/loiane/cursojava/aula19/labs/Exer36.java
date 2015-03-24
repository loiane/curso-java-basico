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
public class Exer36 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[11];
        
        for (int i=0; i<vetorA.length; i++){
            
            vetorA[i] = Math.pow(2, i);
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }    
}
