package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Livro;

public interface RepositorioLivros {

	public void inserir(Livro livro);
	public Livro procurar(Livro livro);
	public void remover(Livro livro);
	public void atualizar(Livro livro);

}
