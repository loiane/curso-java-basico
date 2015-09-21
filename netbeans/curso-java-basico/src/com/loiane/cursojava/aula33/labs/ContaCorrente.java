/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula33.labs;

/**
 *
 * @author loiane
 */
public class ContaCorrente {
    
    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the especial
     */
    public boolean isEspecial() {
        return especial;
    }

    /**
     * @param especial the especial to set
     */
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    /**
     * @return the limiteEspecial
     */
    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    /**
     * @param limiteEspecial the limiteEspecial to set
     */
    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean realizarSaque(double quantiaASacar){
        
        //tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }    
    }
    
    public void depositar(double valorDepositado){
        
        saldo += valorDepositado;
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo); 
    }
    
    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
