package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Colaborador;
import model.Competidor;
import model.Equipe;
import model.Pessoa;
import model.Professor;

public class App {
	
	private Scanner entrada = new Scanner(System.in); 
	
	
	
	private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Equipe> equipes = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();
    private ArrayList<Competidor> competidores = new ArrayList<>();
    
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
    	String idade1 = entrada.nextLine(); 
    	int idade = Integer.parseInt(idade1); 
    	
    	System.out.println("Sexo: ");
    	String sexo = entrada.nextLine();
    	
    	System.out.println("Peso: ");
    	
    	String peso1 = entrada.nextLine();
    	double peso = Double.parseDouble(peso1);
    	
    	System.out.println("Faixa: ");
    	String faixa = entrada.nextLine();
    	
    	System.out.println("CPF: ");
    	String cpf = entrada.nextLine();
    	
    	//public PessoaX(String nome, int idade, 	String sexo, double peso, String faixa, String cpf )
    	
    	Pessoa p = new Pessoa(nome, idade, sexo, peso, faixa, cpf); 
    	pessoas.add(p); 
    	
    	System.out.println("✔ Pessoa cadastrada com sucesso!");    	
    	
    }
    
    private void listarPessoas() {
    	
    	   		if(pessoas.isEmpty()) {
    			System.out.println("Nenhuma pessoa cadastrada...");
    			return; 
    		}
    		
    		System.out.println("\n----LISTA DE PESSOAS----");
    		
    		for(Pessoa listaPessoa : pessoas) {
    			listaPessoa.exibirPessoa();
    		}
    		
    		
    		
    		
    		
    	
    	
    	
    	
    	
    	}
   
    
    
 

}
