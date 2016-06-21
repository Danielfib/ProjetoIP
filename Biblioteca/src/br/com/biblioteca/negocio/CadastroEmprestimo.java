package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;

public class CadastroEmprestimo {

	private RepositorioEmprestimos emprestimos;
	
	public CadastroEmprestimo (RepositorioEmprestimos emp) {
		this.emprestimos = emp;
	}
	
	public void cadastrar(Emprestimo e) {

	}
	
	public void remover(Emprestimo e) {
		
	}
	
	public void atualizar(Emprestimo e) {
		
	}
	
	public Emprestimo procurar(Livro l, Aluno a) {
		return null;
	}
	
}
