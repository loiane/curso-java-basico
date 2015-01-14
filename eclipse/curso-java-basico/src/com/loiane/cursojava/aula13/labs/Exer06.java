package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo:");
		double raio = scan.nextDouble();
		
		//pi * raio^2
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area);
	}
}
