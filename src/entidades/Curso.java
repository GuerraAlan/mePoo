package entidades;

public class Curso {
	private String curso;
	private String descricao;
	private double valor;
	private String sala;

	public Curso() {
	}

	public Curso(String curso, String descricao, double valor, String sala) {
		super();
		this.curso = curso;
		this.descricao = descricao;
		this.valor = valor;
		this.sala = sala;
	}

	public Curso cadastrarCurso(String curso, String descricao, double valor, String sala) {
		return new Curso(curso, descricao, valor, sala);
	}

	public void exibirCurso() {
		System.out.println(this.toString());
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "curso=" + curso + ", descricao=" + descricao + ", valor=" + valor + ", sala=" + sala;
	}

}
