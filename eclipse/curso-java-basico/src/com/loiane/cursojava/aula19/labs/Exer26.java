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
public class Exer26 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com um número para a posição A = " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i=0; i<vetorB.length; i++){
            
            System.out.println("Entre com um número para a posição A = " + i);
            vetorB[i] = scan.nextInt();
            
            if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }    
}
