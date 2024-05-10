package br.com.mfsdevsystem.unidade2;
import java.util.Scanner;

public class MediaTurma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o número de alunos por turma? ");
		int totalAlunos = sc.nextInt();
	    int alunos = 0, alunosAprovados = 0, alunosReprovados = 0 ;
		Double media = 0.0, mediaTurma = 0.0;
		Double nota1, nota2;
	   for (int i = 0; i < totalAlunos; i++ ) {
			
			System.out.println("Digite primeira nota do aluno "+(i+1));
			nota1 = sc.nextDouble();
		
			System.out.println("Digite a segunda nota do aluno "+(i+1));
			nota2 = sc.nextDouble();
			
			media = (nota1 + nota2) /2;
			
			if ( media >=6 ) {
				alunosAprovados++;
			}else {
				alunosReprovados++;
			}
            mediaTurma = mediaTurma + media;     		
			
		} ;
		mediaTurma = mediaTurma / totalAlunos;
		
		System.out.println("A média da turma é "+mediaTurma);
		System.out.println("Total de alunos aprovados: "+alunosAprovados);
		System.out.println("Total de alunos reprovados: "+alunosReprovados);
		sc.close();
		
	}
	
  

}
