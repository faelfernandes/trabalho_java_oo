package parte2;

/**
 * Classe Fornecedor
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public double obterSaldo() {
		return (this.getValorCredito() - this.getValorDivida());
	}
	
	public void getInfo() {
	    System.out.println("Nome Completo: " + this.getNome());
	    System.out.println("Telefone: " + this.getTelefone());
	    System.out.println("Endereço: " + this.getEndereco());
	    System.out.println("Saldo: " + this.obterSaldo());
	}
	
	/* Getters and Setters */
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}
