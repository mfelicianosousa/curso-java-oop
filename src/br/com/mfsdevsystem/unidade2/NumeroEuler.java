package br.com.mfsdevsystem.unidade2;

import java.util.Scanner;

/* Escreva um programa que calcule o valor de e^x que pode ser obtido com boa aproximação pelos 30
 *  primeiros termos da serie de euler
 *  e^x = x^1 / 1! + x^2 / 2! + x^3 / 3! + x^4 / 4! + x^5 / 5! + ...
 *  
 * */

public class NumeroEuler {

	public static void main(String[] args) {
		
		double ex = 0;
		double x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número x? ");
		x = sc.nextDouble();


		for (int i=1; i <=30; i++) {
			ex = ex + ( Math.pow(x, i) ) / fatorial( i );
		}
		System.out.println("O valor de e("+x+") é = "+ex);
		
		sc.close();
	}

	public static long fatorial(int i) {
		        
        long resultado = 1;
        for (int x = 1; x <= i; x++) {
            resultado *= x;
        }
        return resultado;
	}
	
	public static double fatorialModify(int i) {
		return( switch(i) {
			case 0,1 -> 1;
			default -> {
				double fatorial = i * fatorialModify(i-1);
				yield fatorial;
			}
		});
	}
}
