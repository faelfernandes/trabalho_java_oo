package trabalhoav1;

public class Cliente extends Pessoa{
	
	private double valorDivida;
	private int anoNascimento;
	
	public void setValorDivida(float infoDados) {
		valorDivida = infoDados;
	}
	
	public void setAnoNascimento(int infoDados2) {
		anoNascimento = infoDados2;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

}