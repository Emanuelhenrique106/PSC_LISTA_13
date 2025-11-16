package AtividadeLista;

  public class Pessoa {

    protected String nome;
	  protected String cpf;
	    protected int idade;

	 
   public Pessoa(String nome, String cpf, int idade) {
       this.nome = nome;
	     this.cpf = cpf;
	      this.idade = idade;
	    }

	 // EXIBIÇAO DE DADOS   
   public void exibirDadosBasicos() {
	 System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
	       System.out.println("Idade: " + idade);
	    }
	}


