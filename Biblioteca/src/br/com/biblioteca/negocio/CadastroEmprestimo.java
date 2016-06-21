package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.exceptions.EmprestimoExistenteException;
import br.com.biblioteca.exceptions.EmprestimoNaoEncontradoException;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;
import br.com.biblioteca.repositorios.RepositorioEmprestimosArray;

public class CadastroEmprestimo {

	private RepositorioEmprestimos emprestimos;
	
	public CadastroEmprestimo (RepositorioEmprestimos emp) {
		this.emprestimos = emp;
	}
	
	public void cadastrar(Emprestimo e) throws EmprestimoExistenteException {
		if(emprestimos.procurar(e.getLivro(), e.getAluno()) == null) {
			emprestimos.inserir(e);
		} else {
			throw new EmprestimoExistenteException();
		}
	}
	
	public void remover(Emprestimo e) throws EmprestimoNaoEncontradoException {
		if(emprestimos.procurar(e.getLivro(), e.getAluno()) != null) {
			emprestimos.remover(e);
		} else {
			throw new EmprestimoNaoEncontradoException();
		}
	}
	
	public void atualizar(Emprestimo e) throws EmprestimoNaoEncontradoException {
		if(emprestimos.atualizar(e) == null) {
			throw new EmprestimoNaoEncontradoException();
		}
	}
	
	public Emprestimo procurar(Livro l, Aluno a) throws EmprestimoNaoEncontradoException {
		Emprestimo emp = emprestimos.procurar(l, a);
		if(emp == null) {
			throw new EmprestimoNaoEncontradoException();
		}
		return emp;
	}
	
}
