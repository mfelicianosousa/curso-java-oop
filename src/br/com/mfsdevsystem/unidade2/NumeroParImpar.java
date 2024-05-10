package br.com.mfsdevsystem.unidade2;
import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		
		String resposta = parImpar( numero );
		
		System.out.println("O número "+numero+" "+resposta );
		
		sc.close();

	}
	
    private static String parImpar( int numero ) {
    	int resto = numero % 2;
		if (resto == 0) {
			return "par";
			
		} else {
			return "impar";
		}
    }

}
