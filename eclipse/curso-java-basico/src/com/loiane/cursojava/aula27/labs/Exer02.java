/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

/**
 *
 * @author loiane
 */
public class Exer02 {
    
    public static void main(String[] args){
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
        
        boolean saqueEfetuado = conta.realizarSaque(10);
        
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso"); 
           conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente"); 
        }
        
        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais"); 
        if (saqueEfetuado){
           System.out.println("Saque efetuado com sucesso"); 
           conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente"); 
        }
        
        System.out.println("Depósito de 500 reais"); 
        conta.depositar(500);
        conta.consultarSaldo();
        
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }
        
        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial"); 
        } else {
            System.out.println("Não está usando cheque especial"); 
        }
    }
}
