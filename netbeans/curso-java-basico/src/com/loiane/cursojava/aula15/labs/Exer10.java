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
public class Exer10 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o turno que você estuda:");
        String turno = scan.next();
        
        switch(turno){
            case "m":
            case "M": System.out.println("Bom dia!"); break; 
            case "v":
            case "V": System.out.println("Boa tarde!"); break; 
            case "n":
            case "N": System.out.println("Boa noite!"); break;  
            default: System.out.println("Valor inválido"); 
        }
    }
}
