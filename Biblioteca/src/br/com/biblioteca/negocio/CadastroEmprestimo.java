package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.exceptions.EmprestimoException;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;

public class CadastroEmprestimo {

	private RepositorioEmprestimos emprestimos;
	
	public CadastroEmprestimo (RepositorioEmprestimos emp) {
		this.emprestimos = emp;
	}
	
	public void cadastrar(Emprestimo e) throws EmprestimoException {
		if(emprestimos.procurar(e.getLivro(), e.getAluno()) == null) {
			emprestimos.inserir(e);
		} else {
			throw new EmprestimoException("Empréstimo Existente!");
		}
	}
	
	public void remover(Emprestimo e) throws EmprestimoException {
		if(emprestimos.procurar(e.getLivro(), e.getAluno()) != null) {
			emprestimos.remover(e);
		} else {
			throw new EmprestimoException("Empréstimo Inexistente!");
		}
	}
	
	public void atualizar(Emprestimo e) throws EmprestimoException {
		if(emprestimos.atualizar(e) == null) {
			throw new EmprestimoException("Empréstimo Inexistente!");
		}
	}
	
	public Emprestimo procurar(Livro l, Aluno a) throws EmprestimoException {
		Emprestimo emp = emprestimos.procurar(l, a);
		if(emp == null) {
			throw new EmprestimoException("Empréstimo Inexistente!");
		}
		return emp;
	}
	
}
