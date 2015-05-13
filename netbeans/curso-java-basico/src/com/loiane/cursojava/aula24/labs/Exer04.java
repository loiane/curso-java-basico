/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula24.labs;

import java.util.Date;

/**
 *
 * @author loiane
 */
public class Exer04 {
    
    public static void main(String[] args){
        
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";
        
        System.out.println("Nome do livro = " + livro.nome);
    }
}
