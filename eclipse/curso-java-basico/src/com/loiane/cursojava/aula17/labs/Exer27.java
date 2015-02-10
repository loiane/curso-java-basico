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
public class Exer27 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a qtd de temperaturas");
        int qtdTemperaturas = scan.nextInt();
        
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        for (int i=1; i<=qtdTemperaturas; i++){
            
            System.out.println("Entre com a temperatura " + i);
            temp = scan.nextDouble();
            
            soma += temp;
            
            if (temp > maior){
                maior = temp;
            }
            
            if (temp < menor){
                menor = temp;
            }
        }
        
        System.out.println("Média: " + (soma/qtdTemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
