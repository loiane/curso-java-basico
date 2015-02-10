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
public class Exer22 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o número de CDs:");
        int cds = scan.nextInt();
        
        double preco;
        double soma = 0;
        
        for (int i=1; i<= cds; i++){
            
            System.out.println("Informe o valor do cd " + i);
            preco = scan.nextDouble();
            
            soma += preco;
        }
        
        double media = soma / cds;
        
        System.out.println("Média gasta com cada CD: " + media);
    }
}
