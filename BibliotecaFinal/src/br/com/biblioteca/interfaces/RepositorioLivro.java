package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.basic.Quadrado;

public interface RepositorioLivro {

	 void inserir(Livro livro);
	 Livro procurar(String titulo);
	 void remover(Livro livro);
	 Livro atualizar(Livro livro);


}
