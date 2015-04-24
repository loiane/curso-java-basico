package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for (int i=0; i<notas.length; i++){
			
			notas[i] = random.nextInt(10);
		}
		
		for (int i=0; i<notas.length; i++){
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println("Usando o for each");
		
		for (int nota : notas){
			System.out.println(nota);
		}
		
		//exemplo 02
		System.out.println("Exemplo com arrays multidimensionais");
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (double[] notasAluno : notasAlunos){
			for (double nota : notasAluno){
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}

}
