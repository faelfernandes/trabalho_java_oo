package parte2;

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;
	
	private double calcularSalario() {
		return (super.getSalarioBase() + this.ajudaDeCusto) - (super.getSalarioBase() * (super.getImposto()/100));
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
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}	
}
