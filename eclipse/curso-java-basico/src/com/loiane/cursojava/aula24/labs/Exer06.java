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
public class Exer06 {
    
    public static void main(String[] args){
        
        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";
        
        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "99999-9998";
        contato1.telefones[2] = "99999-9997";
    }
}
