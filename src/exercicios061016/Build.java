package exercicios061016;

public class Build {
	String nome="";
	int pontosCasa=0;
	int pontosFora=0;
	int numJogos=0;
	
	public String Build (String no) {
		nome = no;
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public int getPontosCasa() {
		return pontosCasa;
	}

	public int getPontosFora() {
		return pontosFora;
	}

	public int getNumJogos() {
		return numJogos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPontosCasa(int pontosCasa) {
		this.pontosCasa = pontosCasa;
	}

	public void setPontosFora(int pontosFora) {
		this.pontosFora = pontosFora;
	}

	public void setNumJogos(int numJogos) {
		this.numJogos = numJogos;
	}
}
