/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();
        
        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();
        
        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();
        
        //aluno.nomeDisciplinas = new String[3];
        for (int i=0; i<aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }
        
        for (int i=0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j=0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        
        aluno.mostrarInfo();
        
        for (int i=0; i<aluno.nomeDisciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
            }
        }
    }
}
