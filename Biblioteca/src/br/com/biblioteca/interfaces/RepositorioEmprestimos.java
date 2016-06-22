package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.basic.Pessoa;

public interface RepositorioEmprestimos {

	public void inserir(Emprestimo e);

	public Emprestimo procurar(Livro l, Pessoa p);

	public Emprestimo atualizar(Emprestimo e);

	public void remover(Emprestimo e);

}
