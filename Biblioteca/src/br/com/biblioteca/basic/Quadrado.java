package br.com.biblioteca.basic;

import br.com.biblioteca.basic.Livro;

public class Quadrado {
	private Livro livro;
	private Quadrado prox;

	public Quadrado() {

	}

	public Quadrado(Livro livro) {
		this.livro = livro;
	}

	public Quadrado(Livro livro, Quadrado prox) {
		this.livro = livro;
		this.prox = prox;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Quadrado getProx() {
		return prox;
	}

	public void setProx(Quadrado prox) {
		this.prox = prox;
	}

}
