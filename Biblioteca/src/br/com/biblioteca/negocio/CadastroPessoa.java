package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Pessoa;
import br.com.biblioteca.exceptions.PessoaException;
import br.com.biblioteca.interfaces.RepositorioPessoa;

public class CadastroPessoa {
	private RepositorioPessoa pessoas;

	public CadastroPessoa(RepositorioPessoa pessoa) {
		this.pessoas = pessoa;
	}

	public void cadastrar(Pessoa pessoa) throws PessoaException {
		if (pessoas.procurar(pessoa) == null) {
			pessoas.inserir(pessoa);
		} else {
			if (pessoa instanceof Aluno) {
				throw new PessoaException("Aluno já existente!");
			} else {
				throw new PessoaException("Funcionário já existente!");
			}
		}
	}

	public void remover(Pessoa pessoa) throws PessoaException {
		if (pessoas.procurar(pessoa) != null) {
			pessoas.remover(pessoa);
		} else {
			if (pessoa instanceof Aluno) {
				throw new PessoaException("Aluno inexistente!");
			} else {
				throw new PessoaException("Funcionário inexistente!");
			}
		}
	}

	public void atualizar(Pessoa pessoa) throws PessoaException {
		if (pessoas.atualizar(pessoa) == null) {
			if (pessoa instanceof Aluno) {
				throw new PessoaException("Aluno inexistente!");
			} else {
				throw new PessoaException("Funcionário inexistente!");
			}
		}
	}

	public Pessoa procurar(Pessoa pessoa) {
		return pessoas.procurar(pessoa);
	}

}
