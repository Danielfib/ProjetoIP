package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioFornecedor;

public class CadastroFornecedor {

	private RepositorioFornecedor novoFornecedor;
	
	public CadastroFornecedor(RepositorioFornecedor fornecedor){
		this.novoFornecedor = fornecedor;
		
	}
	
	public void cadastrar(Fornecedor fornecedor){
		if (this.novoFornecedor.procurar(fornecedor.getCNPJ()) == null){
			this.novoFornecedor.inserir(fornecedor);
		}else{
			//exception
		}
	}
	public void remover(Fornecedor fornecedor){
		if (this.novoFornecedor.procurar(fornecedor.getCNPJ()) != null){
			this.novoFornecedor.remover(fornecedor);
		}else{
			//exception
		}
	}
	public void atualizar(Fornecedor fornecedor){
		if(novoFornecedor.atualizar(fornecedor)==null){
			//execpiton
		}
	}
	
	public Fornecedor procurar(int cnpj){
		return novoFornecedor.procurar(cnpj);
		
	}
	
}
