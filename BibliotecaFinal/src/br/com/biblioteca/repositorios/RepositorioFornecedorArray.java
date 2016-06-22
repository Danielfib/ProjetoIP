package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.interfaces.RepositorioFornecedor;

public class RepositorioFornecedorArray implements RepositorioFornecedor {
	private Fornecedor[] fornecedor; 
	private int indice;

	public RepositorioFornecedorArray(int size){
		fornecedor = new Fornecedor[size];
	}


	public Fornecedor[] getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor[] fornecedor) {
		this.fornecedor = fornecedor;
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}


	@Override

	public void inserir(Fornecedor novoFornecedor ) {
		fornecedor[indice]=novoFornecedor;
		indice++;

	}

	@Override
	public Fornecedor procurar(int cnpj) {
		for(int i = 0 ; i < indice; i++){
			if ( fornecedor[i].getCNPJ() == cnpj ){
				return fornecedor[i];
			}

		}
		return null;
	}

	@Override
	public void remover(Fornecedor novoFornecedor) {
		Fornecedor tal = procurar(novoFornecedor.getCNPJ());
		if(tal!=null){
			tal = fornecedor[indice-1];
			fornecedor[indice-1]=null;
			indice--;
		}

	}

	@Override
	public Fornecedor atualizar(Fornecedor novoFornecedor) {
		Fornecedor tal = procurar(novoFornecedor.getCNPJ());
		if (tal != null) {
			tal = novoFornecedor;
			return tal;
		}
		return null;

	}
}

