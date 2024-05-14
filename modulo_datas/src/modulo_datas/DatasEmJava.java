package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		

		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-09-04"), LocalDate.now());
		
		System.out.println("possui " + dias + " entre uma data e outra");
		
	}

}
