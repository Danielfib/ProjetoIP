package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Emprestimo;

public class ListaEmprestimo {

	private Emprestimo emprestimo;
	private ListaEmprestimo next;
	
	public ListaEmprestimo() {}
	
	public ListaEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public ListaEmprestimo getNext() {
		return next;
	}

	public void setNext(ListaEmprestimo next) {
		this.next = next;
	}
	
}
