package br.com.alura;

import java.util.TreeSet;

public class TesteReciboTreeSet {

	public static void main(String[] args) {
		Recibo rec1 = new Recibo();
		Recibo rec2 = new Recibo();
		Recibo rec3 = new Recibo();
		TreeSet<Recibo> recibos = new TreeSet<>(); //TreeSet precisa de um comparable ou comparator
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
	}

}
