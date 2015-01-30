/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer12 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("O peso ideal é: " + pesoIdeal);
    }    
}
