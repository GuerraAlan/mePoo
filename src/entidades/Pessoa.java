package entidades;

public class Pessoa {
	private String nome;
	private String rg;
	private String cpf;
	private int anoNasc;
	private String sexo;

	public Pessoa() {

	}

	public Pessoa(String nome, String rg, String cpf, int anoNasc, String sexo) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.anoNasc = anoNasc;
		this.sexo = sexo;
	}

	public Pessoa cadastrar(String nome, String rg, String cpf, int anoNasc, String sexo) {
		return new Pessoa(nome, rg, cpf, anoNasc, sexo);
	}

	public void exibirInf() {
		System.out.println(this.toString());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", anoNasc=" + anoNasc + ", sexo=" + sexo;
	}

}
