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
public class Exer21 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o número de turmas:");
        int numTurmas = scan.nextInt();
        
        
        int numAlunos;
        int soma = 0;
        boolean invalido = true;
        
        for (int i=1; i<=numTurmas; i++){
            
            invalido = true;
            do {
                System.out.println("Entre com o número de alunos da turma " + i);
                numAlunos = scan.nextInt();

                if (numAlunos <= 40){
                    invalido = false;
                } else {
                    System.out.println("Número de alunos inválido. Digite novamente.");
                }
            }while (invalido);
            
            soma += numAlunos;
        }
        
        double media = soma / numTurmas;
        
        System.out.println("Média: " + media);
    }
}
