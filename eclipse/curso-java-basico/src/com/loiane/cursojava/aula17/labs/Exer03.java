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
public class Exer03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do {
            
            System.out.println("Entre com o nome:");
            
            nome = scan.next();
            
            if (nome.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com a idade:");
            
            idade = scan.nextInt();
            
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o salário:");
            
            salario = scan.nextDouble();
            
            if (salario > 0){
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infoValida);
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o sexo:");
            
            sexo = scan.next();
            
            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o estado civil:");
            
            estadoCivil = scan.next();
            
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
    }
}
