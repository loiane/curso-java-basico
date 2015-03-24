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
public class Exer31 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; //pares e impares
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        int posB = 0;
        
        for (int i=0; i<vetorA.length; i++){
            
            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        for (int i=0; i<vetorA.length; i++){
            
            if (vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }    
}
