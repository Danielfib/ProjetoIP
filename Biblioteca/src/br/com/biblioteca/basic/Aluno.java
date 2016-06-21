package br.com.biblioteca.basic;

import br.com.biblioteca.repositorios.RepositorioEmprestimosArray;
import br.com.biblioteca.repositorios.RepositorioEmprestimosLista;

public class Aluno extends Pessoa {
	private double valorMulta;
	private int cotaImpressao;
	RepositorioEmprestimosArray arrayEmprestimos = new RepositorioEmprestimosArray(100);
	RepositorioEmprestimosLista listaEmprestimos = new RepositorioEmprestimosLista();

	public Aluno(String Nome, int ID, double valorMulta, int cotaImpressao) {
		this.valorMulta = valorMulta;
		this.cotaImpressao = cotaImpressao;
	}

	public Aluno(Aluno aluno) {
		this.Nome = aluno.getNome();
		this.ID = aluno.getID();
		this.cotaImpressao = aluno.cotaImpressao;
		this.valorMulta = aluno.valorMulta;
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

	public void pegarLivroArray(Livro livro) {
		if (livro.isConsulta() == true) {
			// exception de ser de consulta
		} else {
			if (livro.getDisponiveis() > 0) {
				Emprestimo e = new Emprestimo(this, livro, null);
				arrayEmprestimos.inserir(e);
				livro.setDisponiveis(livro.getDisponiveis() - 1);
			} else {
				// Exception de nao ter livro
			}
		}
	} // para arrays

	public void devolverLivroArray(Livro livro) {
		arrayEmprestimos.remover(arrayEmprestimos.procurar(livro, this));
		livro.setDisponiveis(livro.getDisponiveis() + 1);
	}

	public void pegarLivroLista(Livro livro) {
		if (livro.isConsulta() == true) {
			// expception
		} else {
			if (livro.getDisponiveis() > 0) {
				Emprestimo e = new Emprestimo(this, livro, null);
				listaEmprestimos.inserir(e);
				livro.setDisponiveis(livro.getDisponiveis() - 1);
			} else {
				//exception de n ter livro
			}
		}
	} // para lista

	public void devolverLivroLista(Livro livro) {
		listaEmprestimos.remover(listaEmprestimos.procurar(livro, this));
		livro.setDisponiveis(livro.getDisponiveis() - 1);
	}

	public void reservarEspaco(EspacoEstudo espaco) {
		if (espaco.getAluno() == null) {
			espaco.setAluno(this);
		} else {
			// exception de espaço lotado
		}
	}

	public void sairEspaco(EspacoEstudo espaco) {
		espaco.setAluno(null);
	}

}
