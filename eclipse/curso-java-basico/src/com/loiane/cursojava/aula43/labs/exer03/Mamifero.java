/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer03;

/**
 *
 * @author loiane
 */
public class Mamifero extends Animal{

    private String alimento;
    
    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel";
    }

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
    }
    
    
}
