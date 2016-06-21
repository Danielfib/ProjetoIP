package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;

public interface RepositorioEmprestimos {

	public void inserir(Emprestimo e);
	public Emprestimo procurar(Livro l, Aluno a);
	public void atualizar(Emprestimo e);
	public void remover(Emprestimo e);
	
}
