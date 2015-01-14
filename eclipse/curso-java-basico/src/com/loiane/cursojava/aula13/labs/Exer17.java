package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Inform a área em metros quadrados a ser pintada:");
		double area = scan.nextDouble();

		double latas = (area/6)/18;
		double precoLatas = latas * 80;

		System.out.println("Qtd de latas: " + latas);
		System.out.println("Preço total latas R$ " + precoLatas);

		double galoes = (area/6)/3.6;
		double precoGaloes = galoes * 25;

		System.out.println("Qtd de galões: " + galoes);
		System.out.println("Preço total galões R$ " + precoGaloes);


	}

}
