package trabalhoav1;

/**
 * Classe Gerente
 * @author Rafael
 * @version 1.0
 */
public class Gerente extends Empregado {
	
	private String nomeGerencia;
	
	private double valorInss(double valor) {
		return (valor * (valor / 13));
	}
	
	public void getInfo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Setor: " + this.getNomeGerencia());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Valor Inss: " + this.valorInss(this.getSalario()));
		System.out.println("Matricula: " + this.getMatricula());
	}

	/* Getters and Setters */
	
	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
}