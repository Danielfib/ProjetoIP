package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.basic.Quadrado1;

public interface RepositorioFornecedor {

	void inserir(Fornecedor fornecedor);
	Fornecedor procurar(int cnpj );
	void remover(Fornecedor fornecedor);
	Fornecedor atualizar(Fornecedor fornecedor);
}
