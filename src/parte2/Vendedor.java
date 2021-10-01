package parte2;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;
	
	public double calcularSalario(double valor) {
		return (super.getSalarioBase() + this.valorVendas) - (super.getSalarioBase() * (super.getImposto()/100));
	}
	
	/* Getters and Setters */
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
