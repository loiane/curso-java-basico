package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//primeira solucao
		/*System.out.println("Entre com dois números inteiros:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int resultado = num1 + num2;
		System.out.println("A soma dos números é: " + resultado);*/
		
		//segunda solucao
		System.out.println("Entre com um número inteiro:");
		int num1 = scan.nextInt();
		System.out.println("Entre com outro número inteiro:");
		int num2 = scan.nextInt();
		int resultado = num1 + num2;
		System.out.println("A soma dos números é: " + resultado);
	}

}
