package br.com.mfsdevsystem.syscapacity;
/*
 * Author: Marcelino Feliciano de Sousa
 * Versão: 1.0;
 * Descrição: Classe que representa o Servidor Público
 *
 * */
public class ServidorPublico {
	
    private int matricula;
    private String nome;
    private String foto;
    private String orgao;
    private String vinculo;
    private String cargo;
    private String lotacao;
    private String exercicio;
    private String email;
    private String telefone;
    private String celular;
    private String cpf;
    private String naturalidade;
    private double salario;

    // Construtor privado para impedir a criação direta de objetos ServidorPublico
    private ServidorPublico() {}

    // Método para obter um Builder para criar instâncias de ServidorPublico
    public static Builder builder() {
        return new Builder();
    }

    // Métodos getters para os atributos

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getFoto() {
        return foto;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getVinculo() {
        return vinculo;
    }
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLotacao() {
        return lotacao;
    }
    
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}
	
    public String getExercicio() {
        return exercicio;
    }
    
    public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
		this.email = email;
	}
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
    public String getCelular() {
        return celular;
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

    public void setSalario(double salario) {
		this.salario = salario;
	}
    @Override
	public String toString() {
		return "ServidorPublico [matricula=" + matricula + ", nome=" + nome + ", orgao=" + orgao + ", vinculo="
				+ vinculo + ", cargo=" + cargo + ", lotacao=" + lotacao + ", salario=" + salario + "]";
	}

	// Classe Builder para construir objetos ServidorPublico
    public static class Builder {
        private ServidorPublico servidor;

        public Builder() {
            this.servidor = new ServidorPublico();
        }

        public Builder matricula(int matricula) {
            servidor.matricula = matricula;
            return this;
        }

        public Builder nome(String nome) {
            servidor.nome = nome;
            return this;
        }

        public Builder foto(String foto) {
            servidor.foto = foto;
            return this;
        }

        public Builder orgao(String orgao) {
            servidor.orgao = orgao;
            return this;
        }

        public Builder vinculo(String vinculo) {
            servidor.vinculo = vinculo;
            return this;
        }

        public Builder cargo(String cargo) {
            servidor.cargo = cargo;
            return this;
        }

        public Builder lotacao(String lotacao) {
            servidor.lotacao = lotacao;
            return this;
        }

        public Builder exercicio(String exercicio) {
            servidor.exercicio = exercicio;
            return this;
        }

        public Builder email(String email) {
            servidor.email = email;
            return this;
        }

        public Builder telefone(String telefone) {
            servidor.telefone = telefone;
            return this;
        }

        public Builder celular(String celular) {
            servidor.celular = celular;
            return this;
        }

        public Builder cpf(String cpf) {
            servidor.cpf = cpf;
            return this;
        }

        public Builder naturalidade(String naturalidade) {
            servidor.naturalidade = naturalidade;
            return this;
        }
        
        public Builder salario(double salario) {
            servidor.salario = salario;
            return this;
        }

        // Método para construir e retornar um objeto ServidorPublico
        public ServidorPublico build() {
            return servidor;
        }
    }
}
