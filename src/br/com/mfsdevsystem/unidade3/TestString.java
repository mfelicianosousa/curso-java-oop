package br.com.mfsdevsystem.unidade3;

import java.util.List;

public class TestString {

	public static void main(String[] args) {
		
		String s1 = "Alo";
		String s2 = "Alo";
		String s3 = s2;
		
		String s4 = new String("Alo");
		String s5 = new String("Alo");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		List<String> nomes ;
		// List<int> numeros; // Error
		List<Integer> numeros;
		
	}

}
