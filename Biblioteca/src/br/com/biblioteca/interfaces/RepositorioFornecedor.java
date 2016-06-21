package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.basic.Quadrado1;

public interface RepositorioFornecedor {

	void inserir(Fornecedor fornecedor);
	public Quadrado1 procurar(Fornecedor fornecedor);
	void remover(Fornecedor fornecedor);
	void atualizar(Fornecedor fornecedor);
}
