package unidad5.clases.clase6_OperacionesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.Month;
	
public class OperacionesDateTime {

	public static void main(String[] args) {
		// Formato estandar
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Formato estandar con guiones
		DateTimeFormatter formatoG = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		// 1-Presenta fecha actual
		System.out.println("1-" + LocalDate.now());
		// 2-Presentar fecha y hora actual
		System.out.println("2-" + LocalDateTime.now());
		// 3-Presentar fecha y hora en Europa/Madrid
		System.out.println("3-" + LocalDateTime.now(ZoneId.of("Europe/Madrid")));
		// 4-Presentar fecha del 10/12/2022 con este formato
		LocalDate f10 = LocalDate.of(2022, 12, 10);
		System.out.println("4-" + f10.format(formato));
		// 5-Indicar a que mes corresponde el 7/12/2020. Numero y nombre
		LocalDate f712 = LocalDate.of(2020, 12, 7);
		System.out.println("5-" + f712.getMonthValue() + "-"+ f712.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
		// 6-Comprobar si el año 2022 es bisiesto
		System.out.println("6-" + Year.isLeap(2022));
		// 7-Comprobar si puedo poner el dia 29 a 2/2020
		YearMonth mesa = YearMonth.of(2020, 2);
		System.out.println("7-" + mesa.isValidDay(29));
		// 8-Ver que fecha es 30 días después del 20/2/2010
		LocalDate f20 = LocalDate.of(2010, 2, 20);
		System.out.println("8-" + f20.plusDays(30));
		// 9-Ver que fecha es 1 mes despues del 15/12/2009
		LocalDate f15 = LocalDate.of(2009, 12, 15);
		System.out.println("9-" + f15.plusMonths(1));
		// 10-Calcular cuantos días han pasado entre el 7/10/2001 y el 10/5/2004
		LocalDate f710 = LocalDate.of(2001, 10, 7);
		System.out.println("10-" + f710.until(LocalDate.of(2004, 5, 10), ChronoUnit.DAYS));
		// 11-Calcular cuantos meses han pasado entre el 7/10/2001 y el 10/5/2004
		System.out.println("11-" + f710.until(LocalDate.of(2004, 5, 10), ChronoUnit.MONTHS));
		// 12-Calcular cuantos años han pasado entre el 7/10/2001 y el 10/5/2004
		LocalDate f710b = LocalDate.parse("07/10/2001", formato);
		System.out.println("12-" + f710b.until(LocalDate.parse("10/05/2004", formato), ChronoUnit.YEARS));
		// 13-Calcular cuantas horas han pasado entre el 7/10/2001 y el 10/5/2004
		System.out.println("13-" + f710b.until(LocalDate.parse("10/05/2004", formato), ChronoUnit.DAYS) * 24);
		// 14-Calcular el periodo que existe entre 3/2/2020 y el 5/7/2021
		LocalDate f0302 = LocalDate.parse("03/02/2020", formato);
		System.out.println("14-" + f0302.until(LocalDate.parse("05/07/2021", formato)));
		// 15-Ver que fecha sale si sumamos el periodo anterior a la fecha 12/11/2022
		LocalDate f1211 = LocalDate.parse("12-11-2022", formatoG);
		Period periodo = f0302.until(LocalDate.parse("05/07/2021", formato));
		System.out.println("15-" + f1211.plus(periodo));
		// 16-Establecer que dia de la semana era el 22/4/2022
		LocalDate f2204 = LocalDate.parse("22-04-2022", formatoG);
		System.out.println("16-" + f2204.getDayOfWeek());
		// 17-Ver que dia de la semana era hace tres dias
		LocalDate hoy = LocalDate.now();
		LocalDate hace3 = hoy.minusDays(3);
		System.out.println("17-" + hace3.getDayOfWeek());
		// 18-Indicar el nombre en castellano del mes actual
		Locale es = new Locale("es", "ES");
		System.out.println("18-" + hace3.getMonth().getDisplayName(TextStyle.FULL,es));
		// 19-Ver que día de la semana era el ultimo día del mes de October de 1940
		LocalDate fecha = YearMonth.of(1940, Month.OCTOBER).atEndOfMonth();
		System.out.println("19-" + fecha.getDayOfWeek());
		// 20-Presentar la fecha correspondiente al dia 253 del año 1989
		System.out.println("20-" + LocalDate.ofYearDay(1989,253));
		// 21-Cuantos segundos han pasado desde las 10:15 hasta las 12:30
		LocalTime ini = LocalTime.of(10,15);
		LocalTime fin = LocalTime.of(12,30);
		System.out.println("21-" + ini.until(fin, ChronoUnit.SECONDS));
	}
}