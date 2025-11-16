package AtividadeLista;

public class Funcionario extends Pessoa {


  private double salario;
    private String cargo;

	    // Construtor usando super() para chamar o pai
	    
    public Funcionario(String nome, String cpf, int idade, double salario, String cargo) {
	   super(nome, cpf, idade); //
	      this.salario = salario;
	        this.cargo = cargo;
	    }

	
	  public double calcularSalarioAnual() {
	    return salario * 12;
	    }


      public String getCargo() {
	    return cargo;
	    }
	}


