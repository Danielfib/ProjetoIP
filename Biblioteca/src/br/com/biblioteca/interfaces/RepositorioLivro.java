package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.basic.Quadrado;

public interface RepositorioLivro {

	 void inserir(Livro livro);
	 public Livro procurar(Livro livro);
	 void remover(Livro livro);
	 void atualizar(Livro livro);

}
