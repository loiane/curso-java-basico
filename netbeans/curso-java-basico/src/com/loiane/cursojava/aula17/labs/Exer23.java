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
public class Exer23{
    
    public static void main(String[] args){
        
       // Scanner scan = new Scanner(System.in);
        
        System.out.println("Lojas Quase Dois - Tabela de preços");
        
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (1.99*i));
        }
    }
}
