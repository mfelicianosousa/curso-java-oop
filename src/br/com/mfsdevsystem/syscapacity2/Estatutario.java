package br.com.mfsdevsystem.syscapacity2;

public class Estatutario extends ServidorPublico {

	protected int tempoServico;
	protected double salarioBase;
	
	public Estatutario() {	
	}
	
	public Estatutario(int tempoServico, double salarioBase, int matricula, String nome) {
		super(matricula, nome);
		this.tempoServico = tempoServico;
		this.salarioBase = salarioBase;
	}
	
	public int getTempoServico() {
		return tempoServico;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Estatutario [tempoServico=" + tempoServico + ", salarioBase=" + salarioBase + ", matricula=" + matricula
				+ ", nome=" + nome + "]";
	}


	
	
}
