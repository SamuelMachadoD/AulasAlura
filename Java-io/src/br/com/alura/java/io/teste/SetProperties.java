package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetProperties {

	public static void main(String[] args) throws IOException {
		//import deve ser java.util.Properties
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); //chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		
		props.store(new FileWriter("conf.properties"), "algum comentário");

	}

}
