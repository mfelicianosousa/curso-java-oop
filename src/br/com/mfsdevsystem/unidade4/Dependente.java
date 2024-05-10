package br.com.mfsdevsystem.unidade4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/*
 * Author: Marcelino Feliciano de Sousa
 * Versão: 1.0;
 * Descrição: Classe que representa o Dependente
 *
 * */

public class Dependente {

	DateTimeFormatter date_sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String nome;
	private String cpf ;
	private String genero;
	private LocalDate dataNascimento;
	private String idade ; 
	
	public Dependente() {
		
	}
   
	public Dependente(String nome, String cpf, String genero, LocalDate dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return LocalDate.parse(dataNascimento.toString(), date_sdf);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	private void setIdade() {
		// calcula idade atual
		// return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now()); // simplificado, idade em anos
		LocalDate dataHoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataHoje);
	   this.idade = String.format("%d anos, %d meses e %d dias.",periodo.getYears(),periodo.getMonths(),periodo.getDays());
	}
	
	public String getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Dependente [nome:" + nome + ", cpf: " + cpf + ", genero:" + genero + ", dataNascimento=" +dataNascimento
				+ ", idade=" + idade + "]";
	}



	// Classe Builder para construir objetos Dependente
    public static class Builder {
        private Dependente dependente;

        public Builder() {
            this.dependente = new Dependente();
        }

        public Builder nome(String nome) {
            dependente.nome = nome;
            return this;
        }
        public Builder cpf( String cpf) {
            dependente.cpf = cpf;
            return this;
        }
        
        public Builder genero( String genero) {
            dependente.genero = genero;
            return this;
        }
        
        public Builder dataNascimento( LocalDate dataNascimento) {
            dependente.dataNascimento = dataNascimento;
            dependente.setIdade();
            return this;
        }
     // Método para construir e retornar um objeto Dependente
        public Dependente build() {
            return dependente;
        }
    }

	
}
