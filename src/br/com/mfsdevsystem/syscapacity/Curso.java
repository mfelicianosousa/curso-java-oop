package br.com.mfsdevsystem.syscapacity;

/*
 * Author: Marcelino Feliciano de Sousa
 * Versão: 1.0;
 * Descrição: Classe que representa o curso
 *
 * */
public class Curso {
    private int idCurso;
    private String nome;
    private String foto;
    private String formaRealizacao;
    private String ofertante;
    private int vagas;
    private double valor;
    private String site;
    private String situacao;

    // Construtor privado para impedir a criação direta de objetos Curso
    private Curso() {}

    
    public Curso(int idCurso, String nome, String foto, String formaRealizacao, String ofertante, int vagas,
			double valor) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
		this.foto = foto;
		this.formaRealizacao = formaRealizacao;
		this.ofertante = ofertante;
		this.vagas = vagas;
		this.valor = valor;
	}


	// Método para obter um Builder para criar instâncias de Curso
    public static Builder builder() {
        return new Builder();
    }

    // Métodos getters para os atributos

    public int getIdCurso() {
        return idCurso;
    }

    public String getNome() {
        return nome;
    }

    public String getFoto() {
        return foto;
    }

    public String getFormaRealizacao() {
        return formaRealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public int getVagas() {
        return vagas;
    }

    public double getValor() {
        return valor;
    }

    public String getSite() {
        return site;
    }

    public String getSituacao() {
        return situacao;
    }

    
    @Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nome=" + nome + ", formaRealizacao=" + formaRealizacao + ", ofertante="
				+ ofertante + ", valor=" + valor + "]";
	}


	// Classe Builder para construir objetos Curso
    public static class Builder {
        private Curso curso;

        public Builder() {
            this.curso = new Curso();
        }

        public Builder idCurso(int idCurso) {
            curso.idCurso = idCurso;
            return this;
        }

        public Builder nome(String nome) {
            curso.nome = nome;
            return this;
        }

        public Builder foto(String foto) {
            curso.foto = foto;
            return this;
        }

        public Builder formaRealizacao(String formaRealizacao) {
            curso.formaRealizacao = formaRealizacao;
            return this;
        }

        public Builder ofertante(String ofertante) {
            curso.ofertante = ofertante;
            return this;
        }

        public Builder vagas(int vagas) {
            curso.vagas = vagas;
            return this;
        }

        public Builder valor(double valor) {
            curso.valor = valor;
            return this;
        }

        public Builder site(String site) {
            curso.site = site;
            return this;
        }

        public Builder situacao(String situacao) {
            curso.situacao = situacao;
            return this;
        }

        // Método para construir e retornar um objeto Curso
        public Curso build() {
            return curso;
        }
    }
}