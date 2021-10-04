package parte2;

/**
 * Classe Empregado
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	private double calcularSalario() {
		return this.salarioBase - (this.salarioBase * (this.imposto / 100));
	}
	
	public void getInfo() {
	    System.out.println("Nome Completo: " + this.getNome());
	    System.out.println("Telefone: " + this.getTelefone());
	    System.out.println("Endereço: " + this.getEndereco());
	    System.out.println("Codigo do Setor: " + this.getCodigoSetor());
	    System.out.println("Salario Bruto: " + this.getSalarioBase());
	    System.out.println("Salario Líquido: " + this.calcularSalario());
	}
	
	/* Getters and Setters */
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}	
}
