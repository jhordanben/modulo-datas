package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws Exception {
		
		File arquivo = new File ("C:\\Users\\benar\\eclipse-workspace\\novo-projeto-java\\modulo_datas\\src\\Arquivos\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(arquivo);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelula + " valor gravado na aula ");
			
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		
		System.out.println("planilha atualizada de novovvvv");
		
		
		
	}
		
		


}


