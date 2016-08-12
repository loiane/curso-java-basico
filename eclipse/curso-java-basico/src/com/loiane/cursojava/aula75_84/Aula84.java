package com.loiane.cursojava.aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

	public static void main(String[] args) {
		
		String doArquivo = "1;Antônio;30;";
		
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
