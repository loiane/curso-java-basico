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
public class JogoDaVelha {
    
    private char[][] jogoVelha;
    private int jogada;

    public JogoDaVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    /**
     * @return the jogoVelha
     */
    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    /**
     * @param jogoVelha the jogoVelha to set
     */
    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    /**
     * @return the jogada
     */
    public int getJogada() {
        return jogada;
    }

    /**
     * @param jogada the jogada to set
     */
    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
    
    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            return false;

        } else { //jogada válida
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }
    
    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
    public boolean verificarGanhador(char sinal) {
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || //linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || //diagonal
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {  //diagonal inversa
            return true;
        }
        return false;
    }
    
    public boolean vezJogador1(){
        if (jogada % 2 == 1){
            return true;
        }
        return false;
    }
}
