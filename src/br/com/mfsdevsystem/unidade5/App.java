package br.com.mfsdevsystem.unidade5;

public class App {

	public static void main(String[] args) {
			
		Curso curso = new Curso(1,"Especialização em Gestão de meio ambiente","EAD","PUC-GO",22000);
		
		System.out.println(curso);
		
		System.out.println(curso.idCurso());
		System.out.println(curso.nome());
		
		System.out.println(curso.valor());
		
		
	}

}
