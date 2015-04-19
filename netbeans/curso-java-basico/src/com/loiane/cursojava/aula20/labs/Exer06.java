package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String[][] jogoVelha = new String[3][3];
        
        for(int i=0; i<jogoVelha.length; i++){
            for (int j=0; j<jogoVelha[i].length; j++){
                jogoVelha[i][j] = "-";
            }
        }
        
        System.out.println("Jogador1 - O");
        System.out.println("Jogador2 - X");
        
        boolean acabou = false;
        boolean jogador1 = true;
        
        while (!acabou) {
            
            if (jogador1){
                System.out.println("Jogador1");
            } else {
                System.out.println("Jogador2");
            }
            
            boolean linhaValida = false;
            int linha = 0;
            while (!linhaValida){
                System.out.println("Entre com a linha");
                linha = scan.nextInt();
                if (linha >=1 && linha <=3){
                    linhaValida = true;
                } else {
                   System.out.println("linha inválida, entre novamente"); 
                }
            }
            
            boolean colunaValida = false;
            int coluna = 0;
            while (!colunaValida){
                System.out.println("Entre com a coluna");
                coluna = scan.nextInt();
                if (coluna >=1 && coluna <=3){
                    colunaValida = true;
                } else {
                   System.out.println("coluna inválida, entre novamente"); 
                }
            }
            
            if (jogoVelha[linha][coluna].equalsIgnoreCase("-")){
                linha--;
                coluna--;

                if (jogador1){
                    jogoVelha[linha][coluna] = "O";
                } else {
                    jogoVelha[linha][coluna] = "X";
                }
                
                jogador1 = !jogador1;
            } else {
                System.out.println("Opções inválidas, digite novamente");
            }
            
            for (int i=0; i<jogoVelha.length; i++){
                for (int j=0; j<jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + " ");
                }
                System.out.println();
            }
            
            //verifica se tem vencedor
            if((jogoVelha[0][0].equalsIgnoreCase(jogoVelha[0][1])
                    && jogoVelha[0][0].equalsIgnoreCase(jogoVelha[0][2])) ||
                (jogoVelha[1][0].equalsIgnoreCase(jogoVelha[1][1])
                    && jogoVelha[1][0].equalsIgnoreCase(jogoVelha[1][2])) || 
                (jogoVelha[2][0].equalsIgnoreCase(jogoVelha[2][1])
                    && jogoVelha[2][0].equalsIgnoreCase(jogoVelha[2][2])) ||
                (jogoVelha[0][0].equalsIgnoreCase(jogoVelha[1][0])
                    && jogoVelha[0][0].equalsIgnoreCase(jogoVelha[2][0])) ||
                (jogoVelha[0][1].equalsIgnoreCase(jogoVelha[1][1])
                    && jogoVelha[0][1].equalsIgnoreCase(jogoVelha[2][1])) ||
                (jogoVelha[0][2].equalsIgnoreCase(jogoVelha[1][2])
                    && jogoVelha[0][2].equalsIgnoreCase(jogoVelha[2][2])) ||
                (jogoVelha[0][0].equalsIgnoreCase(jogoVelha[1][1])
                    && jogoVelha[0][0].equalsIgnoreCase(jogoVelha[2][2]))){
                    acabou = true;
                System.out.println("Existe um vencedor");    
            }
        }
    }
}
