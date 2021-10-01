package trabalhoav1;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private int qntVendas;
	
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
	
	public void getInfo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Valor vendas: " + this.getValorVendas());
		System.out.println("Qtd vendas: " + this.getQntVendas());
	}
}