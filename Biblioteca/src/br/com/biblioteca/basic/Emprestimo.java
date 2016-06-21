package br.com.biblioteca.basic;

import java.util.Calendar;

public class Emprestimo {

	private Aluno aluno;
	private Livro livro;
	private Calendar dataEmprestimo;
	private Calendar dataDevolucao;
	
	public Emprestimo(Aluno aluno, Livro livro, Calendar dataEmprestimo) {
		this.aluno = aluno;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao.add(this.dataEmprestimo.DAY_OF_MONTH, 7);
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
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
		return (0.5) * 
				((dataDevolucao.getTimeInMillis() - 
						dataEmprestimo.getTimeInMillis())
						* 24 * 60 * 60 * 1000);
	}
	
}
