package modulo_datas;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual é : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual é : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		System.out.println("data e hora atual é : " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
			
			
			
		}
		

	}

