package br.com.biblioteca.basic;

public class Livro {

	// nao fiz ainda o atributo " quantidade" pq estou enrolado
	private String titulo;
	private String IdLivro;
	private Fornecedor fornecedor;
	private boolean consulta;
	private int quantidade;
	private int disponiveis = quantidade;

	public Livro() {
	}

	public Livro(String titulo, String idLivro, Fornecedor fornecedor,
			boolean consulta, int quantidade) {

		this.titulo = titulo;
		IdLivro = idLivro;
		this.fornecedor = fornecedor;
		this.consulta = consulta;
		this.quantidade = quantidade;
	}

	// getters e setters do meu livr�o

	public int getquantidade() {
		return quantidade;
	}

	public int getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(int disponiveis) {
		this.disponiveis = disponiveis;
	}

	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdLivro() {
		return IdLivro;
	}

	public void setIdLivro(String idLivro) {
		this.IdLivro = idLivro;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public boolean isConsulta() {
		return consulta;
	}

	public void setConsulta(boolean consulta) {
		this.consulta = consulta;
	}

}