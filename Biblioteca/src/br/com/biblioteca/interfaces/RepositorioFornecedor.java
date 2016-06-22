package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.basic.Quadrado1;

public interface RepositorioFornecedor {

	public void inserir(Fornecedor fornecedor);

	public Fornecedor procurar(int cnpj);

	public void remover(Fornecedor fornecedor);

	public Fornecedor atualizar(Fornecedor fornecedor);
}
