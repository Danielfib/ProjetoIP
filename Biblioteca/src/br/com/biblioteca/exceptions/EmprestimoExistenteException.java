package br.com.biblioteca.exceptions;

public class EmprestimoExistenteException extends Exception {

	public EmprestimoExistenteException() {
		super("Empréstimo Existente!");
	}
	
}
