package parte2;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	private double calcularSalario(double valor) {
		return valor +  this.getAjudaDeCusto();
	}
	
	/* Getters and Setters */
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}	
}
