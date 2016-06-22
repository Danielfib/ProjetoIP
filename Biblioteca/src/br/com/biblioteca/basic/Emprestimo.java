package br.com.biblioteca.basic;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {

	private Pessoa aluno;
	private Livro livro;
	private Calendar dataEmprestimo;
	private Calendar dataDevolucao;

	public Emprestimo(Pessoa aluno, Livro livro) {
		this.aluno = aluno;
		this.livro = livro;

		this.dataEmprestimo = Calendar.getInstance();
		this.dataDevolucao = Calendar.getInstance();

		this.dataDevolucao.add(this.dataEmprestimo.DAY_OF_MONTH, 7);
	}

	public Pessoa getAluno() {
		return aluno;
	}

	public void setAluno(Pessoa aluno) {
		this.aluno = aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double gerarMulta() {
		return (0.5) * ((dataDevolucao.getTimeInMillis() - dataEmprestimo
				.getTimeInMillis()) * 24 * 60 * 60 * 1000);
	}

}
