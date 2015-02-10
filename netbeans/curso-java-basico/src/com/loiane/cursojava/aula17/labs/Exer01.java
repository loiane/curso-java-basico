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
public class Exer01 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        boolean notaValida = false;
        
        do {
           
            System.out.println("Entre com uma nota");
        
            double nota = scan.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }
            
        } while (!notaValida);
        
        
    }
}
