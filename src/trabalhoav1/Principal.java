package trabalhoav1;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Iniciando Projeto");
		System.out.println("------------------------");
		System.out.println("---- Classe Gerente ----");
		System.out.println("------------------------");
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Rafael Fernandes");
		gerente1.setIdade(21);
		gerente1.setSexo("Masculino");
		gerente1.setSalario(2000.00);
		gerente1.setMatricula("0123");
		
		gerente1.getInfo();
		
		System.out.println("------------------------");
		System.out.println("---- Classe Gerente ----");
		System.out.println("------------------------");
		
		Vendedor vendedor1 = new Vendedor();
		vendedor1.setNome("Maria da Silva");
		vendedor1.setIdade(21);
		vendedor1.setSexo("Feminino");
		vendedor1.setSalario(1850.00);
		vendedor1.setMatricula("1234");
		vendedor1.setValorVendas(50);
		vendedor1.setQntVendas(10);
		
		System.out.println("------------------------");
		System.out.println("---- Classe Gerente ----");
		System.out.println("------------------------");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria da Silva");
		cliente1.setIdade(21);
		cliente1.setSexo("Feminino");
		cliente1.setValorDivida(800);
		cliente1.setAnoNascimento(2000);
		
		System.out.println("-------------------------");
		
		
		
	}

}
