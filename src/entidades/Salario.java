package entidades;

public class Salario {
	private double salarioBruto;
	private double salarioLiquido;
	private double inss;
	private double irrf;

	public Salario() {
	}

	public Salario(double salarioBruto, double inss, double irrf) {
		super();
		this.salarioBruto = salarioBruto;
		this.inss = inss;
		this.irrf = irrf;
		this.salarioLiquido = salarioBruto - inss - irrf;
	}

	public double calcularSalario(double plusSalario) {
		return salarioLiquido + plusSalario;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getIrrf() {
		return irrf;
	}

	public void setIrrf(double irrf) {
		this.irrf = irrf;
	}

	@Override
	public String toString() {
		return "salarioBruto=" + salarioBruto + ", salarioLiquido=" + salarioLiquido + ", inss=" + inss + ", irrf="
				+ irrf;
	}

}
