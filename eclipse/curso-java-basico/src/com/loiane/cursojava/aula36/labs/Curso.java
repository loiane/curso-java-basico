/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

/**
 *
 * @author loiane
 */
public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

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
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public Aluno[] getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public String obterInfo(){
        String info = "Nome do Curso = " + nome + "\n";
        
        if (professor != null){
            info += professor.obterInfo();
        }
        
        if (alunos != null){
            System.out.println("---Alunos---");
            for (Aluno aluno : alunos){
                if (aluno != null){
                    info += aluno.obterInfo();
                    info += "\n";
                }    
            }
            
            info += "\nMédia da turma = " + obterMediaTurma();
        }
        
        return info;
    }
    
    public double obterMediaTurma(){
        double soma = 0;
        for (Aluno aluno : alunos){
            if (aluno != null){
                soma += aluno.obterMedia();
            } 
        }
        return soma/alunos.length;
    }
}
