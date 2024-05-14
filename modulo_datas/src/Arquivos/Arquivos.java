package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static void main(String[] args) throws IOException{
		
	
	
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
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	pessoas.add(pessoa1);
	pessoas.add(pessoa2);		
	pessoas.add(pessoa3);
	
	
		
		File arquivo = new File("C:\\Users\\benar\\eclipse-workspace\\novo-projeto-java\\modulo_datas\\src\\Arquivos\\Arquivos.csv");
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
			
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		
	}

}
