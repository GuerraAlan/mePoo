package entidades;

public class Funcionario extends Pessoa {

	private int matricula;
	private String setor;
	private String cargo;
	private Salario salario;
	private NivelEnum nivel;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String rg, String cpf, int anoNasc, String sexo, int matricula, String setor,
			String cargo, Salario salario, NivelEnum nivel) {
		super(nome, rg, cpf, anoNasc, sexo);
		this.matricula = matricula;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
		this.nivel = nivel;
	}

	public Funcionario cadastrarFuncionario(String nome, String rg, String cpf, int anoNasc, String sexo, int matricula,
			String setor, String cargo, Salario salario, NivelEnum nivel) {
		return new Funcionario(nome, rg, cpf, anoNasc, sexo, matricula, setor, cargo, salario, nivel);
	}

	public void exibirFuncionario() {
		System.out.println(toString());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Salario getSalario() {
		return salario;
	}

	public double getValorSalario() {
		return salario.getSalarioLiquido();
	}

	@Override
	public String toString() {
		return super.toString() + ", matricula=" + matricula + ", setor=" + setor + ", cargo=" + cargo + ", salario="
				+ this.getValorSalario() + ", nivel=" + nivel;
	}

}
