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
public class Exer20 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Telefonou para a vítima?");
        String resp1 = scan.next();
        
        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();
        
        System.out.println("Mora perto da vítima?");
        String resp3 = scan.next();
        
        System.out.println("Já trabalhou com a vítima?");
        String resp4 = scan.next();
        
        System.out.println("Devia para a vítima?");
        String resp5 = scan.next();
        
        int cont = 0;
        
        if (resp1.equalsIgnoreCase("S")){
            cont++;
        } 
        
        if (resp2.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (resp3.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (resp4.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (resp5.equalsIgnoreCase("S")){
            cont++;
        }
        
        if (cont == 2){
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        } else if (cont == 5){
            System.out.println("Assassino");
        } else if (cont == 0){
            System.out.println("Inocente");
        } 
    }
}
