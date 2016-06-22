package br.com.biblioteca.principal;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.exceptions.EmprestimoException;
import br.com.biblioteca.negocio.CadastroEmprestimo;
import br.com.biblioteca.negocio.CadastroEspacoEstudo;
import br.com.biblioteca.negocio.CadastroLivros;

public class Biblioteca {

	CadastroEmprestimo cadastroEmprestimo;
	CadastroEspacoEstudo cadastroEspEstudo;
	CadastroLivros cadastroLivro;
	
	public Biblioteca(CadastroEmprestimo cadastroEmprestimo,
			CadastroEspacoEstudo cadastroEspEstudo, CadastroLivros cadastroLivro) {
		this.cadastroEmprestimo = cadastroEmprestimo;
		this.cadastroEspEstudo = cadastroEspEstudo;
		this.cadastroLivro = cadastroLivro;
	}

	public CadastroEmprestimo getCadastroEmprestimo() {
		return cadastroEmprestimo;
	}

	public void setCadastroEmprestimo(CadastroEmprestimo cadastroEmprestimo) {
		this.cadastroEmprestimo = cadastroEmprestimo;
	}

	public CadastroEspacoEstudo getCadastroEspEstudo() {
		return cadastroEspEstudo;
	}

	public void setCadastroEspEstudo(CadastroEspacoEstudo cadastroEspEstudo) {
		this.cadastroEspEstudo = cadastroEspEstudo;
	}

	public CadastroLivros getCadastroLivro() {
		return cadastroLivro;
	}

	public void setCadastroLivro(CadastroLivros cadastroLivro) {
		this.cadastroLivro = cadastroLivro;
	}
	
	public void pegarLivroEmprestado(Aluno a, Livro l) throws EmprestimoException {
		cadastroEmprestimo.cadastrar(new Emprestimo(a, l));
	}
	
}
