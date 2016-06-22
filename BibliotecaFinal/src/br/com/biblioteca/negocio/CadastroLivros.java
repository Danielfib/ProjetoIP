package br.com.biblioteca.negocio;


import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.exceptions.LivroException;
import br.com.biblioteca.interfaces.RepositorioLivro;

public class CadastroLivros {

	private RepositorioLivro repositorioLivro;
	
	public CadastroLivros(RepositorioLivro livro){
		this.repositorioLivro = livro;
		
	}
	
	public void cadastrar(Livro livro) throws LivroException {
		if (this.repositorioLivro.procurar(livro.getTitulo()) == null){
			this.repositorioLivro.inserir(livro);
		}else{
			throw new LivroException("Livro com esse titulo já existe!");
		}
	}
	public void remover(Livro livro) throws LivroException {
		if (this.repositorioLivro.procurar(livro.getTitulo()) != null){
			this.repositorioLivro.remover(livro);
		}else{
			throw new LivroException("Livro não existe!");
		}
	}
	public void atualizar(Livro livro) throws LivroException{
		if(repositorioLivro.atualizar(livro)==null){
			throw new LivroException("Livro não existe!");
		}
	}
	
	public Livro procurar(String titulo) throws LivroException{
		Livro livro = repositorioLivro.procurar(titulo);
		if (livro== null){
			throw new LivroException("Livro não existe com esse titulo!");
		}else{
			return livro;
		}
	}
	
	
}
