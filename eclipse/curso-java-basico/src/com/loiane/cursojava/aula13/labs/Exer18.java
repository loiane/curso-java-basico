package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo:");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da Internet:");
		double velInternet = scan.nextDouble();
		
		//10Mb - 20Mb = 2m
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo: " + tempo);
	}
}
