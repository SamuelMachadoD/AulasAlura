package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole??es do Java",
				"Samuel");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole??es", 22));
		
		Aluno a1 = new Aluno("Rodrigo", 12345);
		Aluno a2 = new Aluno("Samuel", 69420);
		Aluno a3 = new Aluno("Pedro", 130841);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//Iterator(Moda antiga)
		Set<Aluno>alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()){
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		//Vector
		Vector<Aluno> vetor = new Vector<>();
		
		//For Each (Forma mais atual)
		System.out.println("Alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O Aluno " + a1 + " est? matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1)); 
		
		Aluno turini = new Aluno("Rodrigo", 12345);
		System.out.println("E esse Turini, est? matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 ? == ao Turini?");
		System.out.println(a1.equals(turini));
		
		
	}

}
