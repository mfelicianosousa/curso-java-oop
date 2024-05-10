/*
 * Author: Marcelino Feliciano de Sousa
 * Versão: 1.0;
 * Descrição: Classe que representa o Servidor Público
 *
 * */

package br.com.mfsdevsystem.syscapacity2;

import java.util.LinkedList;
import java.util.List;

public class ServidorPublico {
	
    protected int matricula;
    protected String nome;
    protected String foto;
    protected String orgao;
    protected String vinculo;
    protected String cargo;
    protected String lotacao;
    protected String exercicio;
    protected String email;
    protected String telefone;
    protected String celular;
    protected String cpf;
    protected String naturalidade;
    protected double salario;
    
    /******* Constantes **********/
    private final float VALOR_HORA_EXTRA = 40;
   
    // Reuso - Associação
    private List<Curso> cursos = new LinkedList<Curso>();
    
    // Reuso - Agregação
    private List<Dependente> dependentes = new LinkedList<Dependente>();
    
    // Reuso - Composição
    private List<Telefone> telefones = new LinkedList<Telefone>();
  
    public ServidorPublico() {
    	
    }
    public ServidorPublico(int matricula, String nome, String orgao, String cargo, String lotacao, String email, double salario) {
    	this.matricula= matricula;
    	this.nome = nome;
    	this.orgao = orgao;
    	this.cargo = cargo;
    	this.lotacao = lotacao;
    	this.email = email;
    	this.salario = salario;
    }
    
   public ServidorPublico(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
   }

   // Métodos getters para os atributos

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
        return foto;
    }

    public String getOrgao() {
        return orgao;
    }

    public String getVinculo() {
        return vinculo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getLotacao() {
        return lotacao;
    }

    public String getExercicio() {
        return exercicio;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    
    public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
        return cpf;
    }

    public String getNaturalidade() {
        return naturalidade;
    }
    
    public double getSalario() {
		return salario;
	}
    
    public void getCursos() {
       System.out.println(cursos);
	}

	public void setCursos(Curso curso) {
		this.cursos.add( curso );
	}

	//public List<Dependente> getDependentes() {
	//	return dependentes;
	//}

	public void getDependentes() {
    	for (Dependente dependente: dependentes)
		  System.out.println(dependente);
	}
	
	public void setDependentes(Dependente dependente) {
		this.dependentes.add(dependente);
	}

	//public List<Telefone> getTelefones() {
	//	return telefones;
	//}

	public void getTelefones() {
    	for (Telefone telefone: telefones)
		  System.out.println(telefone);
	}
	
	public void setTelefones(Telefone telefone) {
		this.telefones.add(telefone);
	}
	
    public final double calcularSalarioHorasExtras(int... horasTrabalhadas ){
		
		double salarioMensal = 0;
        for (int horasExtras : horasTrabalhadas)
        	salarioMensal = horasExtras * VALOR_HORA_EXTRA;
		
		return salario+salarioMensal;
	}

	@Override
	public String toString() {
		return "ServidorPublico [matricula=" + matricula + ", nome=" + nome + ", orgao=" + orgao + ", vinculo="
				+ vinculo + ", cargo=" + cargo + ", lotacao=" + lotacao + ", salario=" + salario + "]";
	}
	
}
