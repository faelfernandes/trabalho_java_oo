package parte2;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;
	
	public double calcularSalario() {
		return (super.getSalarioBase() + this.valorVendas) - (super.getSalarioBase() * (super.getImposto()/100));
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
