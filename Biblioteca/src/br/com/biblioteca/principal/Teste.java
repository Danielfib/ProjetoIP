package br.com.biblioteca.principal;

import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		
		Calendar dataEmprestimo = Calendar.getInstance();
		
		Calendar dataDevolucao = Calendar.getInstance();
		dataDevolucao.add(dataEmprestimo.DAY_OF_MONTH, 7);
		
		System.out.println(dataDevolucao.getTime().getMonth());
	}

}