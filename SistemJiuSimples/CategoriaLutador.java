package SistemJiuSimples;

public class CategoriaLutador extends PessoaX {
	
	String categoria; 
	
	public CategoriaLutador(String nome, int idade, String sexo, double peso, String faixa, String cpf, String categoria) {
		super(nome, idade, sexo, peso, faixa, cpf); 
		
		if(sexo.equalsIgnoreCase("masculino")) {
			if(peso > 0 && peso < 57.5 ) {
				categoria = "galo"; 
				
			}else if(peso < 64 ) {
				categoria = "pluma";
				
				}else if(sexo.equalsIgnoreCase("feminino")) {
			if(peso > 0 && peso < 48.5 ) {
				categoria = "galo"; 
				
			}else if(peso < 53.5 ) {
				categoria = "pluma";
				
			}}}
		
		
	}
		
	
	
	 
	
			
	
	public void apresentar() {
		System.out.println(categoria);
	} 

	}
