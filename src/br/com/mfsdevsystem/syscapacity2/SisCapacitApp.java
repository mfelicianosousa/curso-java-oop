package br.com.mfsdevsystem.syscapacity2;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class SisCapacitApp implements IServidorPublico, ICurso {
	
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
	    
	    ServidorPublico servidor = new ServidorPublico(matricula,nome, orgao,cargo, lotacao,email, salario);
	   
	    /*
	    servidor.setMatricula(matricula);
	    servidor.setNome(nome);
	    servidor.setOrgao(orgao);
	    servidor.setCargo(cargo);
	    servidor.setLotacao(lotacao)
	    servidor.setEmail(email)
	    servidor.setSalario(salario)
         */   
	    
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
		
		sistema.adicionarServidoresPublico();
		sistema.adicionarServidoresPublico();
		System.out.println("***** Listar 2 Cursos");
		sistema.listarServidorPublico();
		
		sistema.adicionarCurso();
		sistema.adicionarCurso();
		System.out.println("***** Listar 2 Cursos");
		sistema.listarCursos();
		
		/*
		 sistema.adicionarCursoServidorPublico(1, 10); 
		 sistema.adicionarCursoServidorPublico(1, 20);
	
		 sistema.adicionarCursoServidorPublico(2, 10);
		 sistema.adicionarCursoServidorPublico(2, 20);
		
		 sistema.listarCursoServidorPublico(1);
		 sistema.listarCursoServidorPublico(2);
	    */
		sistema.adicionarServidorCurso(10, 1);
		sistema.adicionarServidorCurso(10, 2);
		sistema.adicionarServidorCurso(20, 1);
		sistema.adicionarServidorCurso(20, 2);
		
		sistema.listarServidoresCurso(10);
		sistema.listarServidoresCurso(20);
		
		
	}
	@Override
	public void listarCurso() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterarCurso(br.com.mfsdevsystem.syscapacity.Curso servidorAlterado) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarServidorCurso(int idcurso, int matricula) {
        
		boolean encontrou = false;
		
    	for (Curso curso : cursos) {
    		if (curso.getIdCurso() == idcurso) {
    			// pesquisa servidor pela matricula idcurso 
    			for (ServidorPublico servidor : servidores) {
    	    		if  (matricula == servidor.getMatricula()){
    	    			 curso.setServidores(servidor);
    	    			encontrou = true;
    	  			   break;
    	    		}
    			}
    		}
		}
    	if (!encontrou) {
    		System.out.println("O Servidor publico com a matricula informada não existe!!!");
    	}else {
    		System.out.println("O curso "+idcurso+" foi incluido no Servidor Público com a matricula "+matricula);
    	}
		

		
	}
	@Override
	public void excluirServidorCurso(int idcurso, int matricula) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarServidoresCurso(int idcurso) {
		
		for (Curso curso : cursos) {
    		
    		if (curso.getIdCurso() == idcurso) {
    			System.out.println(curso);
        		System.out.print("Servidores:");
    			curso.getServidores();    		
    		}
		}
		
	}
	@Override
	public void adicionarServidorPublico() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterarServidorPublico(br.com.mfsdevsystem.syscapacity.ServidorPublico servidorAlterado) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calcularFolhaServidorPublicos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarCursoServidorPublico(int matricula, int idcurso) {
		
		boolean encontrou = false;
		
    	for (ServidorPublico servidor : servidores) {
    		if (matricula == servidor.getMatricula()) {
    			// pesquisa curso pelo idcurso 
    			for (Curso curso : cursos) {
    	    		if (curso.getIdCurso() == idcurso) {
    	    			servidor.setCursos(curso);
    	    			encontrou = true;
    	  			   break;
    	    		}
    			}
    		}
		}
    	if (!encontrou) {
    		System.out.println("O Servidor publico com a matricula informada não existe!!!");
    	}else {
    		System.out.println("O curso "+idcurso+" foi incluido no Servidor Público com a matricula "+matricula);
    	}
		
	}
	@Override
	public void excluirCursoServidorPublico(int matricula, int idcurso) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarCursoServidorPublico(int matricula) {
	
    	for (ServidorPublico servidor : servidores) {
    		
    		if (matricula == servidor.getMatricula()) {
    			System.out.println(servidor);
        		System.out.print("Cursos:");
    			servidor.getCursos();    		
    		}
		}
    			
	}
}
