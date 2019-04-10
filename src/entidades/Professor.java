package entidades;

import java.util.List;

public class Professor extends Funcionario {

	private String formacao;
	private List<String> diciplinas;
	private Curso curso;

	public Professor() {
	}

	public Professor(String nome, String rg, String cpf, int anoNasc, String sexo, int matricula, String setor,
			String cargo, Salario salario, String formacao, NivelEnum nivel, List<String> diciplinas, Curso curso) {
		super(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, salario, nivel);
		this.formacao = formacao;
		this.diciplinas = diciplinas;
		this.curso = curso;
	}

	public Professor cadastrarProfessor(String nome, String rg, String cpf, int anoNasc, String sexo, int matricula,
			String setor, String cargo, Salario salario, String formacao, NivelEnum nivel, List<String> diciplinas,
			Curso curso) {
		return new Professor(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, salario, formacao, nivel,
				diciplinas, curso);
	}

	public void exibirProfessor() {
		System.out.println(this.toString());
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public List<String> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(List<String> diciplinas) {
		this.diciplinas = diciplinas;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + ", formacao=" + formacao + ", curso=" + curso + ", diciplinas=" + diciplinas;
	}

}
