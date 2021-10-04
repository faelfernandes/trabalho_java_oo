package parte2;

/**
 * Classe Pessoa
 * @author Rafael Fernandes
 * @author Dhionathan Jobim
 * @author Marcos Muller
 * @author Sara Mageste
 * @author César Augusto
 * @version 1.0
 */
public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	/* Getters and Setters */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
