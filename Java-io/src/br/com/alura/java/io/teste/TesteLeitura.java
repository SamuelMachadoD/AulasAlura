package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		//Fluxo de entrada de arquivo
//		FileInputStream fis = new FileInputStream("Iorem.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Iorem.txt")));
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();		
	}
}
