package SistemJiuSimples;



public class ProfessorX  {
	
	PessoaX pessoaProf;
	EquipeX equipeProf; 
	
	
	
	
	
	public ProfessorX(PessoaX pessoaProf, EquipeX equipeProf) {
		
		this.pessoaProf = pessoaProf; 
		this.equipeProf = equipeProf; 
		
	}
	
	public void exibirProfessor() {
		System.out.println("----------PROFESSOR---------");
		System.out.println("Professor.........." + pessoaProf.nome);
		System.out.println("Equipe............." + equipeProf.nomeEquipe);
		System.out.println("Faixa.............." + pessoaProf.faixa);
		System.out.println("CPF Professor......" + pessoaProf.cpf);
		System.out.println("Idade Professor...." + pessoaProf.idade);
		System.out.println("----------------------------");
			
	}
	

}
