package Arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;

public class EscreverJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setCpf("1312312312");
		usuario1.setLogin("state of grace");
		usuario1.setNome("red");
		usuario1.setSenha("31312312312");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setCpf("1312312112312312");
		usuario2.setLogin("tell me why");
		usuario2.setNome("fearless");
		usuario2.setSenha("41554542");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = new Gson().toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\benar\\eclipse-workspace\\novo-projeto-java\\modulo_datas\\src\\Arquivos\\Arquivos.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		
		//***------------------------ LENDO O ARQUIVO JSON ----------------------------------------
		
		FileReader fileReader = new FileReader("C:\\Users\\benar\\eclipse-workspace\\novo-projeto-java\\modulo_datas\\src\\Arquivos\\Arquivos.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
			
			System.out.println("leitura do arquivo json" + listUsuarios);
			
		}

	}

}
