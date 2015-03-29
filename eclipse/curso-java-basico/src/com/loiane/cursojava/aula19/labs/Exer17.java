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
public class Exer17 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] idades = new int[10];
        
        for (int i=0; i<idades.length; i++){
            System.out.println("Entre com a idade da pessoa " + (i+1));
            idades[i] = scan.nextInt();
        }
        
        int qtd = 0;
        for (int i=0; i<idades.length; i++){
            if (idades[i] > 35){
                qtd++;
            }
        }
        
        System.out.print("Vetor de idades = ");
        for (int i=0; i<idades.length; i++){
            System.out.print(idades[i] + " ");
        }
        System.out.println();
        
        System.out.println("Qtd pessoas idade > 35: " + qtd);
    }    
}
