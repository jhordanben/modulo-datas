package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {
		
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual : " + localDate.getDayOfMonth());
		
		System.out.println("Dia da semana : " + localDate.getDayOfWeek());
		
		System.out.println("Dia do ano : " + localDate.getDayOfYear());
		

	}

}
