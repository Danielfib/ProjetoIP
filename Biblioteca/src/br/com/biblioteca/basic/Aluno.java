package br.com.biblioteca.basic;

import br.com.biblioteca.exceptions.EspacoEstudoException;
import br.com.biblioteca.exceptions.LivroException;
import br.com.biblioteca.repositorios.RepositorioEmprestimosArray;
import br.com.biblioteca.repositorios.RepositorioEmprestimosLista;

public class Aluno extends Pessoa {
	private double valorMulta;
	private int cotaImpressao;
	RepositorioEmprestimosArray arrayEmprestimos = new RepositorioEmprestimosArray(100);
	RepositorioEmprestimosLista listaEmprestimos = new RepositorioEmprestimosLista();

	public Aluno(String Nome, int ID, double valorMulta, int cotaImpressao) {
		super(Nome, ID);
		this.valorMulta = valorMulta;
		this.cotaImpressao = cotaImpressao;
	}	

	public double getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(double valorMulta) {
		this.valorMulta = valorMulta;
	}

	public int getCotaImpressao() {
		return cotaImpressao;
	}

	public void setCotaImpressao(int cotaImpressao) {
		this.cotaImpressao = cotaImpressao;
	}

	public void pegarLivroArray(Livro livro) throws LivroException {
		if (livro.isConsulta() == true) {
			throw new LivroException("Este livro não pode sair da biblioteca!");
		} else {
			if (livro.getDisponiveis() > 0) {
				Emprestimo e = new Emprestimo(this, livro);
				arrayEmprestimos.inserir(e);
				livro.setDisponiveis(livro.getDisponiveis() - 1);
			} else {
				throw new LivroException("Não existem exemplares deste livro disponíveis para empréstimo.");
			}
		}
	} // para arrays
	public void devolverLivroArray(Livro livro) {
		arrayEmprestimos.remover(arrayEmprestimos.procurar(livro, this));
		livro.setDisponiveis(livro.getDisponiveis() + 1);
	}

	public void pegarLivroLista(Livro livro) throws LivroException {
		if (livro.isConsulta() == true) {
			throw new LivroException("Este livro não pode sair da biblioteca!");
		} else {
			if (livro.getDisponiveis() > 0) {
				Emprestimo e = new Emprestimo(this, livro);
				listaEmprestimos.inserir(e);
				livro.setDisponiveis(livro.getDisponiveis() - 1);
			} else {
				throw new LivroException("Não existem exemplares deste livro disponíveis para empréstimo.");
			}
		}
	} // para lista

	public void devolverLivroLista(Livro livro) {
		listaEmprestimos.remover(listaEmprestimos.procurar(livro, this));
		livro.setDisponiveis(livro.getDisponiveis() - 1);
	}

	public void reservarEspaco(EspacoEstudo espaco) throws EspacoEstudoException {
		if (espaco.getAluno() == null) {
			espaco.setAluno(this);
		} else {
			throw new EspacoEstudoException ("O espaço já se encontra reservado!");
		}
	}

	public void sairEspaco(EspacoEstudo espaco) {
		espaco.setAluno(null);
	}

}
