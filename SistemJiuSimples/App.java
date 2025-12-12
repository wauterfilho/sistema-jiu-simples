package SistemJiuSimples;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	private Scanner entrada = new Scanner(System.in); 
	
	
	private ArrayList<PessoaX> pessoas = new ArrayList<>();
    private ArrayList<EquipeX> equipes = new ArrayList<>();
    private ArrayList<ProfessorX> professores = new ArrayList<>();
    private ArrayList<ColaboradorX> colaboradores = new ArrayList<>();
    private ArrayList<CompetidorX> competidores = new ArrayList<>();
    
    public void iniciar() { 
    	
    	int opcao = -1; 
    	
    	while(opcao != 0) {
    		System.out.println("\n-------Menu Principal------");
    		System.out.println("Digite 1 para CADASTRO DE PESSOA");
    		System.out.println("Digite 2 para LISTAR PESSOAS");
    		System.out.println("Digite 0 para SAIR");
    		System.out.println("---ESCOLHA UMA ALTERNATIVA---");
    		
    		opcao = entrada.nextInt(); 
    		entrada.nextLine(); 
    		
    		switch (opcao) {
    		case 1 : 
    			cadastrarPessoa(); 
    			break; 
    		case 2:
    			listarPessoas(); 
    			break; 
    		case 0:
    			System.out.println("Encerrando.....");
    			break;     		
    		}
    	}    	
    }
    

    private void cadastrarPessoa() {
    	System.out.println("Nome: ");
    	String nome = entrada.nextLine();
    	
    	System.out.println("Idade: ");
    	String idade = entrada.nextLine(); 
    	
    	System.out.println("Sexo: ");
    	String sexo = entrada.nextLine();
    	
    	System.out.println("Peso: ");
    	
    	String peso = entrada.nextLine();
    	
    	System.out.println("Faixa: ");
    	String faixa = entrada.nextLine();
    	
    	System.out.println("CPF: ");
    	String cpf = entrada.nextLine();
    	
    	//public PessoaX(String nome, int idade, 	String sexo, double peso, String faixa, String cpf )
    	
    	PessoaX p = new PessoaX(nome, idade, sexo, peso, faixa, cpf); 
    	pessoas.add(p); 
    	
    	System.out.println("✔ Pessoa cadastrada com sucesso!");    	
    	
    }
    
    private void listarPessoas() {
    	
    	   		if(pessoas.isEmpty()) {
    			System.out.println("Nenhuma pessoa cadastrada...");
    			return; 
    		}
    		
    		System.out.println("\n----LISTA DE PESSOAS----");
    		
    		for(PessoaX listaPessoa : pessoas) {
    			listaPessoa.exibirPessoa();
    		}
    		
    		
    		
    		
    		
    	
    	
    	
    	
    	
    	}
    
    
    
    

}
