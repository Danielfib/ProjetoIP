package br.com.biblioteca.basic;

public class Funcionario extends Pessoa {

	void cadastrarLivro(Livro livro) {
		Livro livr = new Livro(livro.getTitulo(), livro.getIdLivro(),
				livro.getFornecedor(), false, livro.getQuatidade());
		// add livr na lista
	}

	void cadstrarAluno(Aluno aluno) {
	}

	void retiraMulta(Aluno a) {
		a.setValorMulta(0);
	}

}