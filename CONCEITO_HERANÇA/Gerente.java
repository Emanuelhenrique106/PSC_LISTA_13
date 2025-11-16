package AtividadeLista;

public class Gerente extends Funcionario {

    private String departamento;

    
    public Gerente(String nome, String cpf, int idade, double salario, String cargo, String departamento) {
        super(nome, cpf, idade, salario, cargo);
           this.departamento = departamento;
    }

  
    @Override
    public void exibirDadosBasicos() {
    	
    	
        // CHAMA DADOS BASICOS DA PESSOA
        super.exibirDadosBasicos();

        
        System.out.println("Cargo: " + getCargo());
          System.out.println("Departamento: " + departamento);
    }
}