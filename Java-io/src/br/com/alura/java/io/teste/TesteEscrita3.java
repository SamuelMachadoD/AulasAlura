package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscrita3 {
	
	public static void main(String[] args) throws IOException {

		//BufferedWriter bw = new BufferedWriter(new FileWriter("Iorem2.txt"));
		//PrintStream ps = new PrintStream("Iorem2.txt");
		PrintWriter ps = new PrintWriter("Iorem2.txt");
		//PrintStream ps = new PrintStream(new File("blabla.txt")); - Cria Arquivo ja com informações;
		
		ps.println("abrada purros berto");
		ps.println();
		ps.println("fajosfijajfa");
		
		
		ps.close();
	
		
	}
}
