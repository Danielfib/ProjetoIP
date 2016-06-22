package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.exceptions.FornecedorException;
import br.com.biblioteca.exceptions.LivroException;
import br.com.biblioteca.interfaces.RepositorioFornecedor;

public class CadastroFornecedor {

	private RepositorioFornecedor repositorioFornecedor;

	public CadastroFornecedor(RepositorioFornecedor fornecedor) {
		this.repositorioFornecedor = fornecedor;

	}

	public void cadastrar(Fornecedor fornecedor) throws FornecedorException {
		if (this.repositorioFornecedor.procurar(fornecedor.getCNPJ()) == null) {
			this.repositorioFornecedor.inserir(fornecedor);
		} else {
			throw new FornecedorException("Fornecedor com esse CNPJ já existe!");
		}
	}

	public void remover(Fornecedor fornecedor) throws FornecedorException {
		if (this.repositorioFornecedor.procurar(fornecedor.getCNPJ()) != null) {
			this.repositorioFornecedor.remover(fornecedor);
		} else {
			throw new FornecedorException(
					"Não existe fornecedor com esse CNPJ!");

		}
	}

	public void atualizar(Fornecedor fornecedor) throws FornecedorException {
		if (repositorioFornecedor.atualizar(fornecedor) == null) {
			throw new FornecedorException("Não existe esse fornecedor!");

		}
	}

	public Fornecedor procurar(int cnpj) throws FornecedorException {
		Fornecedor fornecedor = repositorioFornecedor.procurar(cnpj);
		if (fornecedor == null) {
			throw new FornecedorException(
					"Não existe fornecedor com esse CNPJ!");
		} else {
			return fornecedor;
		}

	}

}
