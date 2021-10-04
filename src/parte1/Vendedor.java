package parte1;

/**
 * Classe Vendedor
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public class Vendedor extends Empregado {
	
	private double valorVendas;
	private int qntVendas;
	
	private double valorInss(double valor) {
		return (valor * (valor / 9));
	}
	
	public void getInfo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Valor Inss: " + this.valorInss(this.getSalario()));
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Valor vendas: " + this.getValorVendas());
		System.out.println("Qtd vendas: " + this.getQntVendas());
	}
	
	/* Getters and Setters */
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getQntVendas() {
		return qntVendas;
	}
	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
}