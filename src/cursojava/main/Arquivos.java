package cursojava.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Aluno;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		//instanciando um aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Leandro");
		aluno1.setIdade(32);
		aluno1.setEmail("leandro@teste.com");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ester");
		aluno2.setIdade(25);
		aluno2.setEmail("ester@teste.com");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Jackson");
		aluno3.setIdade(28);
		aluno3.setEmail("jackson@teste.com");
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Eliana");
		aluno4.setIdade(33);
		aluno4.setEmail("eliana@teste.com");
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		File arquivo = new File("C://ws-alex-dev-treinamento/aula-poo-heranca/src/cursojava/main/arquivo.csv");
		
		if (!arquivo.exists()) {//se o arquivo não existe, vai ser criado automaticamente
			arquivo.createNewFile();
		}
		
		/*Instância o objeto que escreve no arquivo*/
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		
		/*Varre a lista de alunos*/
		/*Essa lista pode vir de um banco de dados*/
		for(Aluno aluno : alunos) {
			escrever_no_arquivo.write(
			aluno.getNome()+";" 
			 + aluno.getIdade()+";" 
			 + aluno.getEmail() + "\n");
		}
		
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		
		
	}
}
