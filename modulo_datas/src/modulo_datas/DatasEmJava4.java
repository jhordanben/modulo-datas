package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {
		
		LocalDate dataAntiga = LocalDate.of(2029, 6, 30);
		
		LocalDate dataNova = LocalDate.of(2021, 12, 1);
		
		Period periodo = Period.between(dataNova, dataAntiga);
		
		System.out.println("Periodo é : " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias ");
		

		
		
	}

}
