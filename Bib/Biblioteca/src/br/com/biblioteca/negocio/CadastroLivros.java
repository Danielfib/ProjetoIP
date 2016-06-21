package br.com.biblioteca.negocio;


import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioLivro;

public class CadastroLivros {

	private RepositorioLivros livros;
	
	public CadastroLivro (RepositorioLivro novo) {
		this.Livros = novo;
	}
	
	public void cadastrar(Livro e) {

	}
	
	public void remover(Livro e) {
		
	}
	
	public void atualizar(Livro e) {
		//nao feito no repositorioLivroLISTA NEM ARRAY***
	}
	
	public Livro procurar(Livro l) {
		return null;
	}
}