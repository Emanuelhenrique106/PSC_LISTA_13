package AtividadeLista;

public class TesteHeranca {

	public static void main(String[] args) {
		   

//>>>>>> 1. Instância de Pessoa
			
Pessoa p1 = new Pessoa("Emanuel Henrique", "180.923.239.23", 30);
   System.out.println("--------- Pessoa ----------");
     p1.exibirDadosBasicos();
       System.out.println();      
		        
//>>>>> 2. Instância de Funcionario
         
	Funcionario f1 = new Funcionario("Joao pedro", "895.866.546.90", 28, 3500.00, "ANALISTA JUNIOR ");
       System.out.println("-------- Funcionário ----------");
         f1.exibirDadosBasicos();
		    System.out.println("Salário anual: R$ " + f1.calcularSalarioAnual());
	         System.out.println();
	         
  //>>>>>> 3. Instância de Gerente         
	         
      Gerente g1 = new Gerente("Diego de souza", "888.876.566.78", 40, 9300.00, "GERENTE DO SETOR DE TI", "Tecnologia");
        System.out.println("-------- Gerente ---------");
		    g1.exibirDadosBasicos();
		      System.out.println("Salário anual: R$ " + g1.calcularSalarioAnual());
		        System.out.println();
		    
		

	}

}
