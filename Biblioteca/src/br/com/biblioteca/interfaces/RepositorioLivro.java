package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.basic.Quadrado;

public interface RepositorioLivro {

	public void inserir(Livro livro);

	public Livro procurar(String titulo);

	public void remover(Livro livro);

	public Livro atualizar(Livro livro);

}
