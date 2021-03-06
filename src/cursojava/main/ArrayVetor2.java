package cursojava.main;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor2 {

	public static void main(String[] args) {
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro Amorim");
		aluno.setNomeEscola("Professor João Nomberto");
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setNomeDisciplina("Curso Java");
		Double[] notas = {8.8,7.5,8.8,100.0};
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNomeDisciplina("Programação OO");
		Double[] notas2 = {9.8,7.1,5.2,7.7};
		disciplina2.setNota(notas2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNomeDisciplina("Lógica de programação I");
		Double[] notas3 = {5.5,8.2,9.1,6.9};
		disciplina3.setNota(notas3);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		aluno.getDisciplinas().add(disciplina3);
		
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso " + aluno.getNomeEscola());
		System.out.println("--------------------- Disciplina do aluno --------------------");
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina : " + disc.getNomeDisciplina());
			System.out.println("As notas da disciplina "+disc.getNomeDisciplina()+" são : ");
			
			double notaMax = 0;
			for (int posicao = 0; posicao < disc.getNota().length; posicao++) {
				System.out.println("Posição : " + posicao + " é igual : " + disc.getNota()[posicao]);
				
				/*Descobrindo a maior nota de cada disciplina*/
				if (posicao == 0) {
					notaMax = disc.getNota()[posicao];
				} else {
					if (disc.getNota()[posicao] > notaMax) {
						notaMax = disc.getNota()[posicao];
					}
				}
			}
			System.out.println("A maior nota da disciplina :: " + disc.getNomeDisciplina() + " é de valor igual :: " + notaMax);
		}
	}
}
