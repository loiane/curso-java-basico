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
public class Aluno {
    
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the nomeDisciplinas
     */
    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    /**
     * @param nomeDisciplinas the nomeDisciplinas to set
     */
    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    /**
     * @return the notasDisciplinas
     */
    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    /**
     * @param notasDisciplinas the notasDisciplinas to set
     */
    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
    
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        
        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean verificarAprovado(int indice){
        
        if (obterMedia(indice) >= 7){
            return true;
        } 
        
        return false;
    }
    
    private double obterMedia(int indice){
        
        double soma = 0;
        
        for (int i=0; i<notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        
        double media = soma / 4;
        
        return media;
    }
    
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }
    
    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }
}
