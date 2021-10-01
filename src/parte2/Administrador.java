package parte2;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	private double calcularSalario() {
		return (super.getSalarioBase() + this.ajudaDeCusto) - (super.getSalarioBase() * (super.getImposto()/100));
	}
	
	/* Getters and Setters */
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}	
}
