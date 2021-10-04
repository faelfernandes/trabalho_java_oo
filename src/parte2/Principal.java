package parte2;

/**
 * Classe Principal
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public class Principal {
	
	public static void main(String[] args) {

		/* ---- Classe Administrador ---- */
		
		System.out.println("------------------------");
		System.out.println("#  Iniciando Projeto   #");
		System.out.println("------------------------");
		System.out.println("- Classe Administrador -");
		System.out.println("------------------------");
		
		Administrador administrador1 = new Administrador();
		administrador1.setNome("João da Silva");
		administrador1.setTelefone("32 9912345678");
		administrador1.setEndereco("Rua Maria das Dores");
		administrador1.setCodigoSetor(123);
		administrador1.setSalarioBase(2400);
		administrador1.setImposto(12);
		administrador1.setAjudaDeCusto(800);
		
		administrador1.getInfo();
		
		/* ---- Classe Fornecedor ---- */
		
		System.out.println("------------------------");
		System.out.println("--- Classe Fornecedor --");
		System.out.println("------------------------");
		
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.setNome("Yudi Almeida");
		fornecedor1.setTelefone("32 4002-8922");
		fornecedor1.setEndereco("Rua Bom dia & Companhia");
		fornecedor1.setValorCredito(10000);
		fornecedor1.setValorDivida(8000);
		
		fornecedor1.getInfo();
		
		/* ---- Classe Vendedor ---- */
		
		System.out.println("------------------------");
		System.out.println("---- Classe Vendedor ---");
		System.out.println("------------------------");
		
		Vendedor vendedor1 = new Vendedor();
		vendedor1.setNome("Priscilla Alcantara");
		vendedor1.setTelefone("32 9970-7070");
		vendedor1.setEndereco("Rua Itapecerica da Serra");
		vendedor1.setCodigoSetor(234);
		vendedor1.setSalarioBase(1850);
		vendedor1.setValorVendas(300);
		
		vendedor1.getInfo();
		
		/* ---- Classe Operario ---- */
		
		System.out.println("------------------------");
		System.out.println("---- Classe Operario ---");
		System.out.println("------------------------");
		
		Operario operario1 = new Operario();
		operario1.setNome("Alberto Junior");
		operario1.setTelefone("32 9970-7070");
		operario1.setEndereco("Rua Bernardo Campos");
		operario1.setCodigoSetor(234);
		operario1.setSalarioBase(1850);
		operario1.setValorProducao(200);
		operario1.setComissao(25);
		
		operario1.getInfo();
		
		/* ---- Classe Empregado ---- */
		
		System.out.println("------------------------");
		System.out.println("--- Classe Empregado ---");
		System.out.println("------------------------");
		
		Empregado empregado1 = new Empregado();
		empregado1.setNome("Abner Soares");
		empregado1.setTelefone("32 3200-2440");
		empregado1.setEndereco("Rua Bruno Campos Silva");
		empregado1.setCodigoSetor(025);
		empregado1.setSalarioBase(1850);
		
		empregado1.getInfo();
		
	}
}
