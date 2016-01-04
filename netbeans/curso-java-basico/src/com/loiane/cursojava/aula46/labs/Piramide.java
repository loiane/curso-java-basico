/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula46.labs;

/**
 *
 * @author loiane
 */
public class Piramide extends Figura3D {
    
    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;
    
    private Figura2D base;

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the arestaBase
     */
    public double getArestaBase() {
        return arestaBase;
    }

    /**
     * @param arestaBase the arestaBase to set
     */
    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    /**
     * @return the apotema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * @param apotema the apotema to set
     */
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    /**
     * @return the base
     */
    public Figura2D getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if (base != null){
            return (numPoliBase * ((arestaBase*apotema)/2)) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null){
           return (base.calcularArea() * altura)/3; 
        }
        return 0;
    }
    
    
}
