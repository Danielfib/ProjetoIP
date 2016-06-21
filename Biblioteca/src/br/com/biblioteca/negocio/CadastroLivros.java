package br.com.biblioteca.negocio;


import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioLivro;

public class CadastroLivros {

	private RepositorioLivro novoLivro;
	
	public CadastroLivros(RepositorioLivro livro){
		this.novoLivro = livro;
		
	}
	
	public void cadastrar(Livro livro){
		if (this.novoLivro.procurar(livro.getTitulo()) == null){
			this.novoLivro.inserir(livro);
		}else{
			//exception
		}
	}
	public void remover(Livro livro){
		if (this.novoLivro.procurar(livro.getTitulo()) != null){
			this.novoLivro.remover(livro);
		}else{
			//exception
		}
	}
	public void atualizar(Livro livro){
		if(novoLivro.atualizar(livro)==null){
			//execpiton
		}
	}
	
	public Livro procurar(String titulo){
		return novoLivro.procurar(titulo);
		
	}
	
	
}
