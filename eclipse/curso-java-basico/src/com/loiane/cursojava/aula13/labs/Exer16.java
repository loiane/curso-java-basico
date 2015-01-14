package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inform a área em metros quadrados a ser pintada:");
		double area = scan.nextDouble();
		
		double latas = (area/3)/18;
		double preco = latas * 80;
		
		System.out.println("Qtd de latas: " + latas);
		System.out.println("Preço total R$ " + preco);
				
		//9m / 3 = 	3l/18l; 0.xxxxxxx	
		
		//tamanho em m da área a ser pintada
		//cobertura 1l - 3m
		//lata 18l - R$ 80
		
		//qtd latas e preço total
	}
}
