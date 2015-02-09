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
public class Exer22 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();
        
        System.out.println("Entre com a quantidade (kg) de maça:");
        double qtdMaca = scan.nextDouble();
        
        double precoKgMorango = 0;
        if (qtdMorango <= 5){
           precoKgMorango =  2.5;
        } else {
            precoKgMorango =  2.2;
        }
        
        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }
        
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;
        
        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;
        
        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        
        System.out.println("Preco total = " + precoTotal);
    }
}
