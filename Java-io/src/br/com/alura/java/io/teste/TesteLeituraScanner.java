package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			//linhaScanner.useLocale(Locale.US); Padr?o de numeros decimais
			linhaScanner.useDelimiter(",");
			String valor1 = linhaScanner.next();
			String valor2 = linhaScanner.next();
			String valor3 = linhaScanner.next();
			String valor4 = linhaScanner.next();
			String valor5 = linhaScanner.next();
			int valor6 = linhaScanner.nextInt();
			//int valorX = linhaScanner.nextInt(); - pode pegar com atributos diferentes de String
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %s - %s - %s - %s - %d", valor1, valor2, valor3, valor4, valor5, valor6);
			//% define formata??o da variavel em ordem
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores));
			//System.out.println(valores[4]);
		}
		scanner.close();
	}

}
