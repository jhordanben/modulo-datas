package Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApacheApoi {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("C:\\Users\\benar\\eclipse-workspace\\novo-projeto-java\\modulo_datas\\src\\Arquivos\\arquivo_excel.xls");

		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("stateofgrace@gmail.com");
		pessoa1.setIdade(19);
		pessoa1.setNome("red");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("jumpthenfall@gmail.com");
		pessoa2.setIdade(24);
		pessoa2.setNome("fearless");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("backtodecember@gmail.com");
		pessoa3.setIdade(16);
		pessoa3.setNome("speaknow");
	
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("epiphany@gmail.com");
		pessoa4.setIdade(22);
		pessoa4.setNome("folklore");
		
		Pessoa pessoa5 = new Pessoa();
		pessoa5.setEmail("TTPD@gmail.com");
		pessoa5.setIdade(1);
		pessoa5.setNome("downbad");
		
		
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);		
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);
		
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); //ESCREVE NAS LINHAS DA PLANILHA
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("planilha do jhordan"); //CRIA A PLANILHA
		
		int numeroLinha = 0; 
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++); //criando linha na planilha
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula ++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula ++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula ++);
			celIdade.setCellValue(p.getIdade());
			
		}
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); //escreve planilha em arquivo
		saida.flush();
		saida.close();
		
		System.out.println("planilha foi criada");
		
	}

}
