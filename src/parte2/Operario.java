package parte2;

public class Operario extends Empregado {

	private double valorProducao;
	private double comissao;
	
	private double calcularSalario(double valor) {
		return valor +  this.getComissao();
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
