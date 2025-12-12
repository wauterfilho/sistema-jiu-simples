package SistemJiuSimples;

public class PessoaX {

	String nome; 
	int idade; 
	String sexo; 
	double peso; 
	String faixa;
	String cpf;
	
	
	public PessoaX(String nome, int idade, 	String sexo, double peso, String faixa, String cpf ) {
		this.nome = nome; 
		this.idade = idade; 
		this.sexo = sexo; 
		this.peso = peso; 
		this.faixa = faixa;
		this.cpf = cpf; 
	
	}
	
	public void exibirPessoa() {
		System.out.println("----------PESSOA---------");
		System.out.println("Pessoa sem classificação");
		System.out.println("Nome........." + nome);
		System.out.println("CPF.........." + cpf);
		System.out.println("Idade........" + idade);
		System.out.printf("Peso.........%.2f\n" , peso);
		System.out.println("faixa........." + faixa);
		System.out.println(".......................");
	}
	
}
