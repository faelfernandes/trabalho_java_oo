package parte2;

/**
 * Classe Operario
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public class Operario extends Empregado {

	private double valorProducao;
	private double comissao;
	
	private double calcularSalario() {
		return super.getSalarioBase() - ((super.getImposto() / 100) * super.getSalarioBase()) + ((this.comissao / 100) * this.getValorProducao());
	}
	
	public void getInfo() {
	    System.out.println("Nome Completo: " + this.getNome());
	    System.out.println("Codigo do Setor: " + this.getCodigoSetor());
	    System.out.println("Telefone: " + this.getTelefone());
	    System.out.println("Endereço: " + this.getEndereco());
	    System.out.println("Salario Bruto: " + this.getSalarioBase());
	    System.out.println("Salario Líquido: " + this.calcularSalario());
	}
	
	/* Getters and Setters */
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
