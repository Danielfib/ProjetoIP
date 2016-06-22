package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Livro;

import br.com.biblioteca.interfaces.RepositorioLivro;

public class RepositorioLivroArray implements RepositorioLivro {
	private Livro[] livro;
	private int indice;

	public RepositorioLivroArray(int size) {
		livro = new Livro[size];
	}

	public Livro[] getLivro() {
		return livro;
	}

	public void setLivro(Livro[] livro) {
		this.livro = livro;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	@Override
	public void inserir(Livro novoLivro) {
		livro[indice] = novoLivro;
		indice++;

	}

	@Override
	public Livro procurar(String titulo) {
		for (int i = 0; i < indice; i++) {
			if (livro[i].getTitulo() == titulo) {
				return livro[i];
			}

		}
		return null;
	}

	@Override
	public void remover(Livro novoLivro) {
		Livro tal = procurar(novoLivro.getTitulo());
		if (tal != null) {
			tal = livro[indice - 1];
			livro[indice - 1] = null;
			indice--;
		}

	}

	@Override
	public Livro atualizar(Livro novoLivro) {
		Livro tal = procurar(novoLivro.getTitulo());
		if (tal != null) {
			tal = novoLivro;
			return tal;

		}
		return null;

	}
}
