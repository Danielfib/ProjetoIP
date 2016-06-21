package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioEmprestimos;

public class RepositorioEmprestimosArray implements RepositorioEmprestimos {
	
	private Emprestimo[] emprestimos;
	private int index;
	
	public RepositorioEmprestimosArray(int tam) {
		emprestimos = new Emprestimo[tam];
	}

	public Emprestimo[] getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(Emprestimo[] emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void inserir(Emprestimo e) {
		emprestimos[index] = e;
		index++;
		
	}

	@Override
	public Emprestimo procurar(Livro l, Aluno a) {
		for(int i = 0; i < index; i++) {
			if(emprestimos[i].getLivro().getIdLivro().equals(l.getIdLivro()) 
					&& emprestimos[i].getAluno().getID() == a.getID()) {
				return emprestimos[i];
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
		e = emprestimos[index-1];
		emprestimos[index-1] = null;
		index--;
	}

}
