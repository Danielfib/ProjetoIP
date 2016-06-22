package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Fornecedor;

import br.com.biblioteca.interfaces.RepositorioFornecedor;

import br.com.biblioteca.basic.Quadrado1;

public class RepositorioFornecedorLista implements RepositorioFornecedor {

	public Quadrado1 primeiro;

	public void criarLista() {
		primeiro = null;
	}

	// public void inserirInverso(Fornecedor) {
	// Quadrado1 frist = new Quadrado1(i);
	// frist.setNumero(i);
	// frist.setProx(primeiro);
	// primeiro = frist;
	// }
	@Override
	public void inserir(Fornecedor fornecedor) {
		Quadrado1 frist = primeiro;
		if (primeiro == null) {
			primeiro = new Quadrado1(fornecedor);
		} else {
			while (frist.getProx() != null) {
				frist = frist.getProx();
			}
			frist.setProx(new Quadrado1(fornecedor));
		}
	}

	@Override
	public Fornecedor procurar(int cnpj) {
		for (Quadrado1 n = primeiro; n != null; n = n.getProx()) {
			if (n.getFornecedor().getCNPJ() == cnpj) {
				return n.getFornecedor();
			}
		}
		return null;
		// retorna exception NEException (Não Encontrado);
	}

	@Override
	public void remover(Fornecedor fornecedor) {
		Quadrado1 anterior = null;
		Quadrado1 p = primeiro;

		while (p != null && p.getFornecedor().getCNPJ() != fornecedor.getCNPJ()) {
			anterior = p;
			p = p.getProx();
		}
		if (p == null) {
			return;
		}
		if (anterior == null) {
			primeiro = p.getProx();
		} else {
			anterior.setProx(p.getProx());
		}
	}

	public Fornecedor atualizar(Fornecedor novoFornecedor) {
		Fornecedor novo = procurar(novoFornecedor.getCNPJ());
		if (novo != null) {
			novo = novoFornecedor;
		}
		return novo;
	}

}
