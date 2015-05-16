/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula24.labs;

/**
 *
 * @author loiane
 */
public class Exer02 {
    
    public static void main(String[] args){
        
        Livro livro = new Livro();
        
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        
        System.out.println("Nome do livro = " + livro.nome);
    }
}
