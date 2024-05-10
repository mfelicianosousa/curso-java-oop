package br.com.mfsdevsystem.unidade3;

public class ServidorPublico {
	
	/* Constructor */
	public ServidorPublico() {
		totalServidores++;
	}
	
    public ServidorPublico(int matricula, String nome, String cargo) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		totalServidores++;
	}

    /******* Constantes **********/
    float VALOR_HORA_EXTRA = 40;
    
	/****** Atributos ***********/
    
    private static int totalServidores;
    
	private int matricula;
	private String nome;
	private String sexo;
	private String foto;
	private String orgao;
	private String vinculo;
	private double salario;
	private int idade;
	private int tempoContribuicao;
	private String cargo;
	private String lotacao;
	private String exercicio;
	private String email;
	private String telefone;
	private String celular;
	private String cpf;
	private String naturalidade;
	private Avaliacao avaliacao;
	
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTempoContribuicao() {
		return tempoContribuicao;
	}

	public void setTempoContribuicao(int tempoContribuicao) {
		this.tempoContribuicao = tempoContribuicao;
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

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public final double calcularSalarioHorasExtras(int... horasTrabalhadas ){
		
		double salarioMensal = 0;
        for (int horasExtras : horasTrabalhadas)
        	salarioMensal = horasExtras * VALOR_HORA_EXTRA;
		
		return salario+salarioMensal;
	}
	
	
	public static int getTotalServidores() {
		return totalServidores;
	}
		
	@Override
	public String toString() {
		return "ServidorPublico: [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", cargo=" + cargo
				+ ", lotacao=" + lotacao + "]";
	}
	
	public int mostrarTamanhoNome() {
		return this.nome.length();
	}
	
	public void mostrarPreNome() {
		System.out.println(this.nome.substring(0,nome.indexOf(" ")));
	}
	public void mostrarSobreNome() {
		System.out.println(this.nome.substring(nome.indexOf(" ")+1));
	}

	public static void main(String[] args) {
		
		ServidorPublico servidorPublico1 = new ServidorPublico(1,"Isabela Sampaio dos Santos","Auditor");
			// servidorPublico1.setMatricula( 1 );
		// servidorPublico1.setNome("Isabela");
		// servidorPublico1.setCargo("Auditor");
		servidorPublico1.setSexo("F");
		servidorPublico1.setOrgao("ANVISA");
		servidorPublico1.setLotacao("Brasilia");
		servidorPublico1.setEmail("assoftbel@gmail.com");
		servidorPublico1.setSalario(2000);
		servidorPublico1.setAvaliacao(Avaliacao.EXCELENTE);

		
		System.out.println(servidorPublico1.toString());
		System.out.println(servidorPublico1.calcularSalarioHorasExtras(20,30));
		
		System.out.println( servidorPublico1.mostrarTamanhoNome());
		servidorPublico1.mostrarPreNome();
		servidorPublico1.mostrarSobreNome();
		
		
		
		
		ServidorPublico servidorPublico2 = new ServidorPublico(2,"Heila","Estagiária");
		// totalServidores++;
		// servidorPublico2.setMatricula( 2 );
	    // servidorPublico2.setNome("Heila");
		// servidorPublico2.setCargo("Estagiário");
		servidorPublico2.setSexo("F");
		servidorPublico2.setOrgao("STN");
		servidorPublico2.setLotacao("Brasilia");
		servidorPublico2.setEmail("heila@gmail.com");
		servidorPublico2.setSalario(1800.00);
		servidorPublico2.calcularSalarioHorasExtras(10);
		servidorPublico2.setAvaliacao(Avaliacao.BOM);
		
		System.out.println(servidorPublico2.toString());
		
		ServidorPublico servidorPublico3 = new ServidorPublico(3,"Maria","Analista");
		// totalServidores++;
		// servidorPublico3.matricula = 3;
		// servidorPublico3.setNome("Maria");
		// servidorPublico3.setCargo("Analista");
		
		servidorPublico3.setSexo("F");
		servidorPublico3.setOrgao("ENAP");
		servidorPublico3.setLotacao("Brasilia");
		servidorPublico3.setEmail("mariafontenelle@gmail.com");
		servidorPublico3.setSalario(3900.00);
		servidorPublico3.calcularSalarioHorasExtras(10);
		servidorPublico3.setAvaliacao(Avaliacao.REGULAR);
		System.out.println(servidorPublico3.toString());
		
		ServidorPublico servidorPublico4 = new ServidorPublico(4,"Caio Santos","Analista Tributário");
		// totalServidores++;
		// servidorPublico4.setMatricula(4);
		// servidorPublico4.setNome("Caio Santos");
		// servidorPublico4.setCargo("Analista Tributario") ;
		servidorPublico4.setSexo("M");
		servidorPublico4.setOrgao("RFB");
		servidorPublico4.setLotacao("Rio de Janeiro");
		servidorPublico4.setEmail("caiosantos@gmail.com");
		servidorPublico4.setSalario(2800.00);	
		servidorPublico4.setAvaliacao(Avaliacao.INSATISFATORIO);
		servidorPublico4.calcularSalarioHorasExtras(20);
		System.out.println(servidorPublico4.toString());
		
		ServidorPublico servidorPublico5 = new ServidorPublico();
		// totalServidores++;
		servidorPublico5.setMatricula(5);
		servidorPublico5.setNome("João Batista Santos");
		servidorPublico5.setCargo("Analista I") ;
		servidorPublico5.setSexo("M");
		servidorPublico5.setOrgao("RFB");
		servidorPublico5.setLotacao("Rio de Janeiro");
		servidorPublico5.setEmail("joao.batista@gmail.com");
		servidorPublico5.setSalario(3200.00);
		servidorPublico5.setAvaliacao(Avaliacao.BOM);
		
		System.out.println("Total servidores!! "+getTotalServidores());
	}
}
