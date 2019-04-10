package entidades;

import java.util.List;

public class CoordenadorCurso extends Professor {
	private String area;
	private double plusSalario;

	public CoordenadorCurso() {
		// TODO Auto-generated constructor stub
	}

	public CoordenadorCurso(String nome, String rg, String cpf, int anoNasc, String sexo, int matricula, String setor,
			String cargo, Salario salario, String formacao, NivelEnum nivel, List<String> diciplinas, String area,
			double plusSalario, Curso curso) {
		super(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, salario, formacao, nivel, diciplinas, curso);
		this.area = area;
		this.plusSalario = plusSalario;
	}

	public CoordenadorCurso cadasrarCoordenadorCurso(String nome, String rg, String cpf, int anoNasc, String sexo,
			int matricula, String setor, String cargo, Salario salario, String formacao, NivelEnum nivel,
			List<String> diciplinas, String area, double plusSalario, Curso curso) {
		return new CoordenadorCurso(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, salario, formacao, nivel,
				diciplinas, area, plusSalario, curso);
	}

	public void exibirCoordenadorCurso() {
		System.out.println(this.toString());
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPlusSalario() {
		return plusSalario;
	}

	public void setPlusSalario(double plusSalario) {
		this.plusSalario = plusSalario;
	}

	@Override
	public String toString() {
		return super.toString() + ", area=" + area + ", plusSalario=" + plusSalario;
	}

}
