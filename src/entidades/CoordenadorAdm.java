package entidades;

public class CoordenadorAdm extends Funcionario {
	private String area;
	private double plusSalario;

	public CoordenadorAdm() {
	}

	public CoordenadorAdm(String nome, String rg, String cpf, int anoNasc, String sexo, int matricula, String setor,
			String cargo, String area, double plusSalario, Salario salario, NivelEnum nivel) {
		super(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, salario, nivel);
		this.area = area;
		this.plusSalario = plusSalario;
	}

	public CoordenadorAdm cadastrarCoordenadorAdm(String nome, String rg, String cpf, int anoNasc, String sexo,
			int matricula, String setor, String cargo, String area, double plusSalario, Salario salario,
			NivelEnum nivel) {
		return new CoordenadorAdm(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, area, plusSalario, salario,
				nivel);
	}

	@Override
	public double getValorSalario() {
		return getSalario().calcularSalario(this.plusSalario);
	}

	public void exibirCoordenadorAdm() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString() + ", area=" + area + ", plusSalario=" + plusSalario + "]";
	}

}
