package br.com.mfsdevsystem.syscapacity;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class SisCapacitApp {
	
	/* Atributos */
	List<ServidorPublico> servidores = new LinkedList<>();
	
	List<Curso> cursos = new LinkedList<>();
	
	/* Metodos CRUD Servidor Público */
	public void adicionarServidoresPublico() {
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula: "));
	    String nome = JOptionPane.showInputDialog("Nome: ");
	    String orgao = JOptionPane.showInputDialog("Orgão Público: ");
	    String cargo = JOptionPane.showInputDialog("Cargo: ");
	    String lotacao = JOptionPane.showInputDialog("Lotacao: ");
	    String email = JOptionPane.showInputDialog("Email: ");
	    Double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
	    
	    ServidorPublico servidor = new ServidorPublico.Builder()
	    		.matricula(matricula)
	    		.nome(nome)
	    		.orgao(orgao)
	    		.cargo(cargo)
	    		.lotacao(lotacao)
	    		.email(email)
	    		.salario(salario)
                .build();
	    
	    servidores.add(servidor);
	    
	}
	public void listarServidorPublico() {
		
		for (ServidorPublico servidor : servidores) {
			System.out.println(servidor);
		}
	}
	
    public void listarServidorPublico(int matricula) {
    	boolean encontrou = false;
    	for (ServidorPublico servidor : servidores) {
    		if (matricula == servidor.getMatricula()) {
    		   System.out.println(servidor);
    		   encontrou = true;
			   break;
    		}
    	
		}
    	if (!encontrou) {
    		System.out.println("O Servidor com a matricula "+matricula+" não encontrado!!!");
    	}
    }
    
	public void alterarServidorPublico(ServidorPublico servidorAlterado) {
		boolean encontrou = false;
    	for (ServidorPublico servidor : servidores) {
    		if (servidorAlterado.getMatricula() == servidor.getMatricula()) {
    			servidores.remove(servidor);
    			servidores.add(servidorAlterado);
    			encontrou = true;
  			    break;
    		}
		}
    	if (!encontrou) {
    		System.out.println("O Servidor com a matricula "+servidorAlterado.getMatricula()+" não encontrado!!!");
    	}else {
    		System.out.println("O Servidor com a matricula "+servidorAlterado.getMatricula()+" foi alterada com sucesso");
    	}
	}
	
    
    public void excluirServidorPublico(int matricula) {
    	boolean encontrou = false;
    	for (ServidorPublico servidor : servidores) {
    		if (matricula == servidor.getMatricula()) {
    			servidores.remove(servidor);
    			 encontrou = true;
  			   break;
    		}
		}
    	if (!encontrou) {
    		System.out.println("O Servidor com a matricula "+matricula+" não encontrado!!!");
    	}else {
    		System.out.println("O Servidor com a matricula "+matricula+" foi excluido com sucesso");
    	}
    }
	
	// método - ServidorPublico
	public void calcularFolhaServidoresPublicos() {
	
		double folhaSalarial = 0 ;
		for (ServidorPublico servidor : servidores) {
			
			folhaSalarial = folhaSalarial + servidor.getSalario();
		
		}
		System.out.println("Folha Salarial "+folhaSalarial);
	}
	
	
	/* Metodos CRUD Para Curso */
	public void adicionarCurso() {
		
		int idCurso = Integer.parseInt(JOptionPane.showInputDialog("Id Curso: "));
	    String nome = JOptionPane.showInputDialog("Nome: ");
	    String formaRealizacao = JOptionPane.showInputDialog("FormaRealizacao: ");
	    String ofertante = JOptionPane.showInputDialog("Ofertante: ");
	    Double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
	    
	    Curso curso = new Curso.Builder()
	    		.idCurso(idCurso)
	    		.nome(nome)
	    		.formaRealizacao(formaRealizacao)
	    		.ofertante(ofertante)
	    		.valor(valor)
                .build();
	    
	    cursos.add(curso);
	    
	}
	
    public void listarCursos() {
		
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
	}
    
    public void listarCurso(int idCurso) {
    	boolean encontrou = false;
    	for (Curso curso : cursos) {
    		if (idCurso == curso.getIdCurso()) {
    		   System.out.println(curso);
    		   encontrou = true;
			   break;
    		}
    	
		}
    	if (!encontrou) {
    		System.out.println("O Curso com o id "+idCurso+" não encontrado!!!");
    	}
    }
    
    
    //
    public void alterarCurso(Curso cursoAlterado) {
		boolean encontrou = false;
    	for (Curso curso : cursos) {
    		if (cursoAlterado.getIdCurso() == curso.getIdCurso()) {
    			cursos.remove(curso);
    			cursos.add(cursoAlterado);
    			encontrou = true;
  			    break;
    		}
		}
    	if (!encontrou) {
    		System.out.println("O Curso com o id "+cursoAlterado.getIdCurso()+" não encontrado!!!");
    	}else {
    		System.out.println("O Curso com o id "+cursoAlterado.getIdCurso()+" foi alterada com sucesso");
    	}
	}
	
    
    public void excluirCurso(int idCurso) {
    	boolean encontrou = false;
    	for (Curso curso : cursos) {
    		if (idCurso == curso.getIdCurso()) {
    			cursos.remove(curso);
    			encontrou = true;
  			   break;
    		}
		}
    	if (!encontrou) {
    		System.out.println("O Curso com o id "+idCurso+" não encontrado!!!");
    	}else {
    		System.out.println("O Curso com o id "+idCurso+" foi excluido com sucesso");
    	}
    }
    
    
	public static void main(String[] args) {
	   
		SisCapacitApp sistema = new SisCapacitApp();
		
		/*
		sistema.adicionarServidoresPublico();
		sistema.adicionarServidoresPublico();
		sistema.listarServidorPublico();
		
		 ServidorPublico servidor = new ServidorPublico.Builder()
		    		.matricula(4)
		    		.nome("Paulo F Sampaio")
		    		.orgao("RFB")
		    		.cargo("Auditor")
		    		.lotacao("Manaus")
		    		.email("paulo.sampaio@rfb.gmail")
		    		.salario(30000)
	                .build();
		    
		    sistema.alterarServidorPublico(servidor);
		    sistema.listarServidorPublico();
		    
		*/
		sistema.adicionarCurso();
		sistema.adicionarCurso();
		System.out.println("***** Listar 2 Cursos");
		sistema.listarCursos();
		
		sistema.listarCurso(1);
		sistema.listarCurso(2);
		
		
		sistema.listarCursos();
		
		Curso cursoAlterado = new Curso.Builder()
									 .idCurso(2)
									 .nome("Especialização em Gestão de meio ambiente e das Cidades")
							         .formaRealizacao("EAD")
							         .ofertante("PUC-GO")
							         .vagas(50)
							         .valor(22000)
							         .build();
		
		sistema.alterarCurso(cursoAlterado);
		
		sistema.listarCursos();
		
		sistema.excluirCurso(2);
		System.out.println("***** Listar 1 Curso");
		sistema.listarCursos();
		
		
	}
}
