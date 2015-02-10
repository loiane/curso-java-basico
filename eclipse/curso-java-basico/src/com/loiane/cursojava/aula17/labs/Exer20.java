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
public class Exer20 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de idades");
        int idades = scan.nextInt();
        
        int idade;
        int soma = 0;
        
        for (int i=0; i<idades; i++){
            
            System.out.println("Entre com a idade da pessoa " + (i+1));
            idade = scan.nextInt();
            
            soma += idade;
        }
        
        double media = soma / idades;
        
        System.out.println("Média de idade: " + media);
        
        if (media >= 0 && media <=25){
            System.out.println("jovem");
        } else if (media >= 26 && media <=60){
            System.out.println("adulta");
        } else if (media > 60){
            System.out.println("idosa");
        }
    }
}
