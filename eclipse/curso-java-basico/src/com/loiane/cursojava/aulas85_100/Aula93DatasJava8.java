package com.loiane.cursojava.aulas85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

	public static void main(String[] args) {
		
		// data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2019, 2, 1));
		System.out.println(LocalDate.parse("2020-02-01"));

		System.out.println(agora.plusDays(30));
		
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		System.out.println(LocalDate.parse("2020-02-01").isLeapYear());
		
		// hora formato ISO
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		
		System.out.println(LocalTime.of(20, 18));
		System.out.println(LocalTime.parse("20:18"));
		
		System.out.println(hAgora.plusMinutes(50));
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));
		
		System.out.println(hAgora.getHour());
		
		// data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
		System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));
		System.out.println(agoraCompleto.plusYears(20));
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
//		for (String f : fusos) {
//			System.out.println(f);
//		}
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
	}

}
