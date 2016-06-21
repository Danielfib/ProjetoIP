package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;

public class RepositorioEmprestimosLista implements RepositorioEmprestimos {
	
	private  ListaEmprestimo lista = new ListaEmprestimo();

	@Override
	public void inserir(Emprestimo e) {
		if(lista.getEmprestimo() == null) {
			lista.setEmprestimo(e);
		} else {
			
		}
	}

	@Override
	public Emprestimo procurar(Livro l, Aluno a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Emprestimo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Emprestimo e) {
		// TODO Auto-generated method stub
		
	}

}
