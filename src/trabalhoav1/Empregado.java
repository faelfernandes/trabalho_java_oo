package trabalhoav1;

/**
 * Classe Empregado
 * @author Rafael
 * @version 1.0
 */
public class Empregado extends Pessoa {
	private double salario;
	private String matricula;
	
	private double valorInss(double valor) {
		return (valor * (valor / 11));
	}
	
	public void getInfo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Valor Inss: " + this.valorInss(this.getSalario()));
		System.out.println("Matricula: " + this.getMatricula());
	}
	
	/* Getters and Setters */
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
