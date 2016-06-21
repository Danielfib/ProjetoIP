package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;
import br.com.biblioteca.repositorios.RepositorioEmprestimosArray;

public class CadastroEmprestimo {

	private RepositorioEmprestimos emprestimos;
	
	public CadastroEmprestimo (RepositorioEmprestimos emp) {
		this.emprestimos = emp;
	}
	
	public void cadastrar(Emprestimo e) {
		if(emprestimos.procurar(e.getLivro(), e.getAluno()) == null) {
			emprestimos.inserir(e);
		} else {
			// Exception
		}
	}
	
	public void remover(Emprestimo e) {
		if(emprestimos.procurar(e.getLivro(), e.getAluno()) != null) {
			emprestimos.remover(e);
		} else {
			// Execption
		}
	}
	
	public void atualizar(Emprestimo e) {
		if(emprestimos.atualizar(e) == null) {
			// Exception
		}
	}
	
	public Emprestimo procurar(Livro l, Aluno a) {
		return emprestimos.procurar(l, a);
	}
	
}