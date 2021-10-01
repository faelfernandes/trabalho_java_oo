package parte2;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;
	
	public double calcularSalario(double valor) {
		return valor + comissao;
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
