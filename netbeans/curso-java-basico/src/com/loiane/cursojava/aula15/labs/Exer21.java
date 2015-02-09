/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer21 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a qtd de litros vendidos");
        double litros = scan.nextDouble();
        
        System.out.println("Entre com o tipode combustível");
        String tipo = scan.next();
        
        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;
        
        if (tipo.equalsIgnoreCase("a")){
            
            if (litros <= 20){
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }
            
            total = litros * precoAlc;
            
        } else if (tipo.equalsIgnoreCase("g")){
            
            if (litros <= 20){
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            
            total = litros * precoGas;
        }
        
        totalDesc = (total / 100) * percDesconto;
        
        double precoAPagar = total - totalDesc;
        
        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
