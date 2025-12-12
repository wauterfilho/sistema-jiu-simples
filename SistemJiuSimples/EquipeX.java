package SistemJiuSimples;

public class EquipeX {
	
	PessoaX responsavel; 	
	String nomeEquipe; 
	String cnpj; 
	String endereco;
	 
	
	
	public EquipeX(String nomeEquipe, String cnpj, String endereco, PessoaX responsavel) {
		this.nomeEquipe = nomeEquipe; 
		this.cnpj = cnpj; 
		this.endereco = endereco;
		this.responsavel = responsavel; 	
	
	}
	
	public void exibirEquipe() {
		System.out.println("----------EQUIPE---------");
		System.out.println("Equipe............." + nomeEquipe);
		System.out.println("Responsável........" + responsavel.nome);
		System.out.println("CNPJ..............." + cnpj);
		System.out.println("-------------------------");
	}
		
	
	

}
