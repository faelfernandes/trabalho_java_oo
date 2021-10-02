package parte1;

/**
 * Classe Cliente
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public class Principal {

	public static void main(String[] args) {
		
		/* ---- Classe Gerente ---- */
		
		System.out.println("------------------------");
		System.out.println("Iniciando Projeto");
		System.out.println("------------------------");
		System.out.println("---- Classe Gerente ----");
		System.out.println("------------------------");
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Rafael Fernandes");
		gerente1.setIdade(21);
		gerente1.setSexo("Masculino");
		gerente1.setNomeGerencia("Vendas");
		gerente1.setSalario(2000.00);
		gerente1.setMatricula("0123");
		
		gerente1.getInfo();
		
		/* ---- Classe Vendedor ---- */
		
		System.out.println("------------------------");
		System.out.println("---- Classe Vendedor ---");
		System.out.println("------------------------");
		
		Vendedor vendedor1 = new Vendedor();
		vendedor1.setNome("Maria da Silva");
		vendedor1.setIdade(19);
		vendedor1.setSexo("Feminino");
		vendedor1.setSalario(1850.00);
		vendedor1.setMatricula("1234");
		vendedor1.setValorVendas(50);
		vendedor1.setQntVendas(10);
		
		vendedor1.getInfo();
		
		/* ---- Classe Empregado ---- */
		
		System.out.println("------------------------");
		System.out.println("---- Classe Empregado ----");
		System.out.println("------------------------");
		
		Empregado empregado1 = new Empregado();
		empregado1.setNome("Felipe Almeida");
		empregado1.setIdade(18);
		empregado1.setSexo("Masculino");
		empregado1.setSalario(1600.00);
		empregado1.setMatricula("2345");
		
		empregado1.getInfo();
		
		/* ---- Classe Cliente ---- */
		
		System.out.println("------------------------");
		System.out.println("---- Classe Cliente ----");
		System.out.println("------------------------");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria da Silva");
		cliente1.setIdade(21);
		cliente1.setSexo("Feminino");
		cliente1.setValorDivida(800);
		cliente1.setAnoNascimento(2000);
		
		cliente1.getInfo();
		
		System.out.println("-------------------------");
		
	}
}
