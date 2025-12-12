package SistemJiuSimples;

public class ColaboradorX  {
	
	PessoaX pessoaFunci;
	String funcao;
	
	 
	
	//testeGit
	
	
	public ColaboradorX(PessoaX pessoaFunci, String funcao ) {
		this.pessoaFunci = pessoaFunci; 
		this.funcao = funcao; 
	}
	
	public void exibirColaborador() {
		System.out.println("----------COLABORADOR---------");
		System.out.println("Colaborador........" + pessoaFunci.nome);
		System.out.println("Função............." + funcao);
		System.out.println("CPF Colaborador...." + pessoaFunci.cpf);
		System.out.println("Idade Colaborador.." + pessoaFunci.idade);		
		System.out.println("------------------------------");
	}
	
	
	

}

