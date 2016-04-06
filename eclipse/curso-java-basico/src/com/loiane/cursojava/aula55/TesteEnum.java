package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();

		for (int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
		
		for (DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}
		
		
	}

}
