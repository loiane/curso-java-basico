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
public class Exer15 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        
        int impar = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                impar++;
            }
        }
        
        int par = vetorA.length - impar;
        
        //vetorA.length - 100%
        //par           - x
        //= x*vetorA.length == par * 100
        //= x == (par * 100)/vetorA.length
        double porcPar = (par * 100)/vetorA.length;
        double porcImpar = 100 - porcPar;
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Porcentagem Pares: " + porcPar);
        System.out.println("Porcentagem Ímpares: " + porcImpar);
    }    
}
