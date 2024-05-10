package br.com.mfsdevsystem.unidade4;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		Curso curso = new Curso.Builder()
				 .idCurso(1)
				 .nome("Especialização em Gestão de meio ambiente e das Cidades")
		         .formaRealizacao("EAD")
		         .ofertante("PUC-GO")
		         .vagas(50)
		         .valor(22000)
		         .build();
		
		Dependente dependente = new Dependente.Builder()
				.nome("Pedro Feliciano")
				.cpf("123.455.677-78")
				.dataNascimento(LocalDate.of(2021,7,15))
				.genero("Masculino")
				.build();
		
	    Telefone telResidencial = new Telefone("Residencial", "5591322453");
	    Telefone telComercial = new Telefone("Comercial", "55914009877");
	    
		ServidorPublico servidor = new ServidorPublico(4, "Marcelino Feliciano");
		//		.Builder()
	    //		.matricula(4)
	    //		.nome("Paulo F Sampaio")
	    //		.orgao("RFB")
	    //		.cargo("Auditor")
	    //		.lotacao("Manaus")
	    //		.email("paulo.sampaio@rfb.gmail")
	    //		.salario(30000)
	    //		.cursos(curso)
	    //		.dependentes(dependente)
	    //		.telefones(telComercial)
	    //		.telefones(telResidencial)
        //        .build();
		
		
		servidor.getCursos();
		servidor.getDependentes();
		servidor.getTelefones();
		
		Estatutario estatutario = new Estatutario(10,40000, 4, "Marcelino Feliciano de Sousa");
		/*      .Builder()
				.matricula(4)
				.nome("Marcelino Feliciano")
				.cargo("")
				.tempoServico(10)
		        //.salarioBase(5000.0)
				.build();
		
		estatutario.setTempoServico(10);
		estatutario.setSalarioBase(4000);
		*/
	
		System.out.println(estatutario);
		System.out.println(estatutario.getMatricula());
		System.out.println(estatutario.getNome());
		System.out.println(estatutario.getSalarioBase());
	    //
		Comissionado comissionado =  new Comissionado(10000,40000,1,"Marcelino Feliciano de Sousa") ;
		/* 
		 * Comissionado.Builder()
				.matricula(4)
				.nome("Marcelino Feliciano")
				.build();
		comissionado.setComissao(10);
		comissionado.setSalarioFixo(4000);
		
		*/
		System.out.println(comissionado);
		System.out.println(comissionado.getMatricula());
		System.out.println(comissionado.getNome());
		System.out.println(comissionado.salario);
	
		Temporario temporario = new Temporario(2,"Luisa Teixeira","100104-8", 3000);
		
		System.out.println(temporario);
		System.out.println(temporario.getMatricula());
		System.out.println(temporario.getNome());
		System.out.println(temporario.getContrato());
		System.out.println(temporario.calcularSalarioHorasExtras(30));
		
		
		
		
	}

}
