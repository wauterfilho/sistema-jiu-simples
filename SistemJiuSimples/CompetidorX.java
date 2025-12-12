package SistemJiuSimples;

public class CompetidorX {
	
	PessoaX pessoaCompeti; 
	EquipeX equipe; 
	ProfessorX professor; 
	String categoria; 
	
	public CompetidorX(PessoaX pessoaCompeti,  EquipeX equipe, ProfessorX professor ) {
		
		this.pessoaCompeti = pessoaCompeti; 
		this.equipe = equipe; 
		this.professor = professor; 
	}
	
	
	public void calcularCategoria() { 
		if(pessoaCompeti.sexo.equalsIgnoreCase("masculino")) {
			if(pessoaCompeti.peso > 0 && pessoaCompeti.peso < 57.5) {
				categoria = "galo";   
			}else if(pessoaCompeti.peso < 64 ) {
				categoria = "pluma"; 
		}
		}
		if(pessoaCompeti.sexo.equalsIgnoreCase("feminino")) {
			if(pessoaCompeti.peso > 0 && pessoaCompeti.peso < 48.5) {
				categoria = "galo";   
			}else if(pessoaCompeti.peso < 53.5 ) {
				categoria = "pluma"; 
		}
		}
	}
		
	

	
	public void exibirCompetidor() {		
		System.out.println("----------COMPETIDOR---------");
		System.out.println("Nome.........." + pessoaCompeti.nome);
		System.out.println("CPF..........." + pessoaCompeti.cpf);
		System.out.println("Idade........." + pessoaCompeti.idade);
		System.out.printf("Peso...........%.2f\n" , pessoaCompeti.peso);
		System.out.println("Faixa........." + pessoaCompeti.faixa);
		System.out.println("Categoria....." + categoria);
		System.out.println("Professor....." + professor);
		System.out.println("----------------------------");		
	}
	
	

}
