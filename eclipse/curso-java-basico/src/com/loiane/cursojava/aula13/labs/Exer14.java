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
public class Exer14 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o tamanho do arquivo:");
        double tamArquivo = scan.nextDouble();
        
        System.out.println("Entre com a velocidade da internet:");
        double velInternet = scan.nextDouble();
        
        double tempo = tamArquivo / velInternet;
        
        System.out.println("Tempo de download: " + tempo);
    }    
}
