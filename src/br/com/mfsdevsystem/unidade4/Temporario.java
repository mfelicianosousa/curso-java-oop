package br.com.mfsdevsystem.unidade4;

public class Temporario extends ServidorPublico {

	private String contrato;
	private double salario;
	
	private final float VALOR_HORA_EXTRA = 30;
	
	public Temporario() {
		super();
	}
	
	public Temporario(int matricula, String nome, String contrato, double salario) {
		super( matricula, nome);
		this.contrato = contrato;
		this.salario = salario;
		super.salario = salario;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	 public final double calcularSalarioHorasExtras(int horasTrabalhadas ){
			
			double salarioMensal = 0;
	        salarioMensal = salarioMensal + horasTrabalhadas * VALOR_HORA_EXTRA;
			
			return this.salario+salarioMensal;
		}

	@Override
	public String toString() {
		return "Temporario [contrato=" + contrato + ", salario=" + salario + ", matricula=" + matricula + ", nome="
				+ nome + "]";
	}
}
