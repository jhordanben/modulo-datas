package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivosTxt {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//achar arquivo -> nome da variavel
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\benar\\eclipse-workspace\\novo-projeto-java\\modulo_datas\\src\\Arquivos\\Arquivos.txt"));
		//fileinputstream é pra ACHAR o arquivo
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8"); //scanner é para LER o arquivo
		//ler -> nome da variavel 
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) { //while = enquanto
			
			String linha = lerArquivo.nextLine(); //nextLine é para ler a próxima linha de texto de um arquivo
		
			//se a linha for diferente de NULL e diferente de VAZIO, ou seja, nextLine le a proxima linha SE ela NAO FOR VAZIA
			if (linha != null && !linha.isEmpty()) {
				
				String [] dados = linha.split("\\;");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
			}
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa); //imprime a variavel pessoa
				
				
				
				
			}
			
		}
		
	}




