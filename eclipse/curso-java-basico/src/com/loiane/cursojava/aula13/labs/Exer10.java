package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Celsius:");
		double c = scan.nextDouble();

		double f = (c * 2) + 30;

		System.out.println("A temperatura " + c + "C é igual a " + f + "F");


	}

}
