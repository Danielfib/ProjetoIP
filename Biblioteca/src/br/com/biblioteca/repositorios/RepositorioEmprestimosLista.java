package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;

public class RepositorioEmprestimosLista implements RepositorioEmprestimos {
	
	private ListaEmprestimo head = new ListaEmprestimo();

	@Override
	public void inserir(Emprestimo e) {
		if(head.getEmprestimo() == null) {
			head.setEmprestimo(e);
		} else {
			ListaEmprestimo aux = head;
			while(aux.getNext() != null) {
				aux = aux.getNext();	
			}
			aux.setNext(new ListaEmprestimo(e));
		}
	}

	@Override
	public Emprestimo procurar(Livro l, Aluno a) {
		ListaEmprestimo aux = head;
		while(aux.getEmprestimo() != null) {
			if(aux.getEmprestimo().getLivro().getIdLivro().equals(l.getIdLivro()) 
					&& aux.getEmprestimo().getAluno().getID() == a.getID()) {
				return aux.getEmprestimo();
			}
			if(aux.getNext() != null) {
				aux = aux.getNext();
			}
		}
		return null;
	}

	@Override
	public Emprestimo atualizar(Emprestimo e) {
		Emprestimo emp = procurar(e.getLivro(), e.getAluno());
		if(emp != null) {
			emp = e;
		}
		return emp;
	}

	@Override
	public void remover(Emprestimo e) {
	}

}