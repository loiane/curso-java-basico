/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer31 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double salario = 1000; //95
        
        double percentual = 1.5; // 96
        
        salario += (salario/100) * percentual; //96
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for (int i=1997; i<=2015; i++){
            
            percentual *= 2;
            
            salario += (salario/100) * percentual;
            
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }
    }
}
