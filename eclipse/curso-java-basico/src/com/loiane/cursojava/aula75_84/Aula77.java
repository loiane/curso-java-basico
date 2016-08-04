package com.loiane.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {
		
		String java = "Java";
		
		for (int i=0; i<java.length(); i++){
			System.out.println(java.charAt(i));
		}

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.err.println(jav);
		
		//seria o mesmo que
		for (int i=0, j=0; i<3; i++, j++){
			jav[j] = java.charAt(i);
		}
		System.out.println(jav);
		
		byte[] javBytes = new byte[3];
		java.getBytes(0, 3, javBytes, 0);
		System.out.println(Arrays.toString(javBytes));
		
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
	}

}
