package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AtividadeIterator {

	public static void main(String[] args) {
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> iterador = letras.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
	}

}
