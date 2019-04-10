package entidades;

public class Aluno extends Pessoa {

	private int codigo;
	private String interesse;
	private Curso curso;

	public Aluno() {
	}

	public Aluno(String nome, String rg, String cpf, int anoNasc, String sexo, int codigo, String interesse,
			Curso curso) {
		super(nome, rg, cpf, anoNasc, sexo);
		this.codigo = codigo;
		this.interesse = interesse;
		this.curso = curso;
	}

	public Aluno cadastrarAluno(String nome, String rg, String cpf, int anoNasc, String sexo, int codigo,
			String interesse, Curso curso) {
		return new Aluno(nome, rg, cpf, anoNasc, sexo, codigo, interesse, curso);
	}

	public void exibirAluno() {
		System.out.println(this.toString());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getInteresse() {
		return interesse;
	}

	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + " codigo=" + codigo + ", interesse=" + interesse + ", curso=" + curso;
	}

}
