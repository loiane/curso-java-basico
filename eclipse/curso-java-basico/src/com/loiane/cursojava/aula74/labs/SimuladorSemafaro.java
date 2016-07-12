package com.loiane.cursojava.aula74.labs;

public class SimuladorSemafaro {

	public static void main(String[] args) {
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		for (int i=0; i<10; i++){
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		
		semafaro.desligarSemafaro();
	}

}
