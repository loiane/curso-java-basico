package com.loiane.cursojava.aulas85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		
		Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));

	}

}
