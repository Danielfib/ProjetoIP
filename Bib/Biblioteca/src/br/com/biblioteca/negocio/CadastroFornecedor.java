package br.com.biblioteca.negocio;


import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.interfaces.RepositorioFornecedor;

public class CadastroFornecedor {

	private RepositorioFornecedor Fornecedor;
	
	public CadastroFornecedor (RepositorioFornecedor novo) {
		this.Fornecedor = novo;
	}
	
	public void cadastrar(Fornecedor e) {

	}
	
	public void remover(Fornecedor e) {
		
	}
	
	public void atualizar(Fornecedor e) {
		//nao feito no repositorioFornecedorLISTA NEM ARRAY***
	}
	
	public Fornecedor procurar(Fornecedor l) {
		return null;
	}
}