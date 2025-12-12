package SistemJiuSimples;


import java.util.ArrayList;
import java.util.Scanner;



public class SistemaX {
	public static void main(String[] args) {
		
		//-----LISTA DE PESSOAS --------
		
		Scanner entrada = new Scanner(System.in); 
		
		
		
		ArrayList<PessoaX> pessoas = new ArrayList<PessoaX>();
		
		PessoaX any = new PessoaX("Any Maria", 50, "feminino", 50, "branca", "000000000");
		pessoas.add(any); 
		PessoaX neto = new PessoaX("Neto", 30, "masculino", 50, "azul", "000000000"); 
		pessoas.add(neto);
		PessoaX bruna = new PessoaX("Bruna", 30, "feminino", 50, "roxa", "000000000"); 
		pessoas.add(bruna);
		PessoaX monike = new PessoaX("Monike", 20, "feminino", 50, "marrom", "000000000"); 
		pessoas.add(monike);
		PessoaX silvio = new PessoaX("Silvio", 30, "masculino", 30, "preta", "000000000"); 
		pessoas.add(silvio);
		PessoaX rhuan = new PessoaX("Rhuan", 50, "masculino", 20, "branca", "000000000"); 
		pessoas.add(rhuan);
		
		//-----LISTA DE EQUIPES --------
		
		ArrayList<EquipeX> equipes = new ArrayList<EquipeX>(); 
		
		EquipeX novaUniao = new EquipeX("Nova União", "12345678000100", "Escorrego da caita 100", any); 
		equipes.add(novaUniao); 
		EquipeX deLaRiva = new EquipeX("De La Riva", "1111178000100", "Buraco da caita 100", neto); 
		equipes.add(deLaRiva); 
		
		//-----LISTA DE PROFESSORES --------
		
		ArrayList<ProfessorX> professores = new ArrayList<ProfessorX>(); 
		
		ProfessorX anyProf = new ProfessorX(any, deLaRiva); 
		professores.add(anyProf);
		ProfessorX brunaProf = new ProfessorX(bruna, novaUniao); 
		professores.add(brunaProf);		
		
		//-----LISTA DE COLABORADORES --------		
		
		ArrayList<ColaboradorX> colaboradores = new ArrayList<ColaboradorX>(); 
		
		ColaboradorX rhuanColab = new ColaboradorX(rhuan, "Faz tudo"); 
		colaboradores.add(rhuanColab); 
		
		//-----LISTA DE COMPETIDORES --------
		
		ArrayList<CompetidorX> competidores = new ArrayList<CompetidorX>(); 
		
		CompetidorX monikeCompet = new CompetidorX(monike, novaUniao, anyProf); 
		competidores.add(monikeCompet); 
		CompetidorX silvioCompet = new CompetidorX(silvio, novaUniao, anyProf); 
		competidores.add(silvioCompet); 
		CompetidorX rhuanCompet = new CompetidorX(rhuan, deLaRiva, brunaProf); 
		competidores.add(rhuanCompet); 
		CompetidorX netoCompet = new CompetidorX(neto, deLaRiva, brunaProf); 
		competidores.add(netoCompet); 
		
		
		
		
		
		
		for(PessoaX teste : pessoas) {
			teste.exibirPessoa();		
	}
		for(EquipeX teste : equipes) {
			teste.exibirEquipe();		
	}
		for(ProfessorX teste : professores) {
			teste.exibirProfessor();		
	}
		for(ColaboradorX teste : colaboradores) {
			teste.exibirColaborador();		
	}
		for(CompetidorX teste : competidores) {
			teste.calcularCategoria();
			teste.exibirCompetidor();		
	}
		
		
	
	entrada.close();
}}
