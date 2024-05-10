package br.com.mfsdevsystem.unidade2;

import java.util.Scanner;

/*
 * 
 * */
public class VendaCartuchos {

	public static void main(String[] args) {
		
		final int VALOR_CARTUCHO = 50;
		
		Scanner sc = new Scanner(System.in);
		
		double totalVenda = 0, totalDesconto = 0, totalComDesconto=0 ;
	
		int totalCartuchos = 0;
		System.out.println("Digite o número de cartuchos vendidos? ");
		totalCartuchos = sc.nextInt();
		
		totalVenda =  (totalCartuchos * VALOR_CARTUCHO);
		
		if (totalCartuchos <=500 ) {
			totalDesconto = (totalVenda * 5)/100;
		} else if (totalCartuchos >= 501 && totalCartuchos <= 1000) {
			totalDesconto = (totalVenda * 7)/100;
		} else if (totalCartuchos >= 1001 && totalCartuchos <= 1500) {
			totalDesconto = (totalVenda * 9)/100;
		}else if (totalCartuchos >= 1501) {
			totalDesconto = (totalVenda * 10)/100;
		}
		totalComDesconto = totalVenda - totalDesconto;
		
		System.out.println("Total de cartuchos: "+totalCartuchos);
		System.out.println("Total de Vendas:   "+totalVenda);
		System.out.println("Total de Desconto: "+totalDesconto);
		System.out.println("Total Com Vendas: "+totalComDesconto);
	}

}
