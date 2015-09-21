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
public class Lampada {
    
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;
    
    public Lampada() {
    }

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String[] tipos, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tensao
     */
    public String getTensao() {
        return tensao;
    }

    /**
     * @param tensao the tensao to set
     */
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tipoLuz
     */
    public String getTipoLuz() {
        return tipoLuz;
    }

    /**
     * @param tipoLuz the tipoLuz to set
     */
    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    /**
     * @return the garantiaMeses
     */
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    /**
     * @param garantiaMeses the garantiaMeses to set
     */
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * @return the tipos
     */
    public String[] getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    /**
     * @return the tipoAbajur
     */
    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    /**
     * @param tipoAbajur the tipoAbajur to set
     */
    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }
    
    public void desligar(){
        setLigada(false);
    }
    
    public void mostrarEstado(){
        if (isLigada()){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
    
    public void mudarEstado(){
        if (isLigada()){
            desligar();
        } else {
            ligar();
        }
    }
}
