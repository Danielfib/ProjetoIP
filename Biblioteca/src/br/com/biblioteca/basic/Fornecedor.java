package br.com.biblioteca.basic;

public class Fornecedor {

	private String Nome;
	private int CNPJ;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public Livro fornecerLivros(String titulo, int quantidade,
			boolean consulta, String id) {

		Livro livrofornecedor = new Livro(titulo, id, this, consulta,
				quantidade);

		return livrofornecedor;
	}
}