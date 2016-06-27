package com.loiane.cursojava.aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando){

		if (!estaExecutando){
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		try {
			while (tique){
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExecutando){

		if (!estaExecutando){
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");

		tique = false;

		notify();

		try {
			while (!tique){
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
