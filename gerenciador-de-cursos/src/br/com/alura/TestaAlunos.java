package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		//Set<String> alunos = new HashSet<>();
		alunos.add("Samuel");
		alunos.add("Rodrigo");
		alunos.add("Paulo");
		alunos.add("Renato");
		alunos.add("Omar");
		alunos.add("Ana");
		alunos.add("Renato");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {
			
		});
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}

}
