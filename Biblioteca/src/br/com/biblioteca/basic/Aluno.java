package br.com.biblioteca.basic;

public class Aluno extends Pessoa {
	private double valorMulta;
	private int cotaImpressao;

	public Aluno(String Nome, int ID, double valorMulta, int cotaImpressao) {
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

	public void pegarLivro(Livro livro) {
		// add na lista de emprestimo
	}

	public void devolverLivro(Livro livro) {
		// remover da lista de emprestimo

	}

	public void reservarEspaco(EspacoEstudo espaco) {

	}
}
