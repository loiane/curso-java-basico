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
public class Exer16 {
    
    public static void main(String[] args){
        
        //Scanner scan = new Scanner(System.in);
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        while (proximo <= 500){
            
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
    }
}
