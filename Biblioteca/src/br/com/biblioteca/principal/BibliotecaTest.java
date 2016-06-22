package br.com.biblioteca.principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.Emprestimo;
import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.basic.Fornecedor;
import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.basic.Pessoa;
import br.com.biblioteca.exceptions.EmprestimoException;
import br.com.biblioteca.exceptions.EspacoEstudoException;
import br.com.biblioteca.exceptions.FornecedorException;
import br.com.biblioteca.exceptions.LivroException;
import br.com.biblioteca.exceptions.PessoaException;
import br.com.biblioteca.negocio.CadastroEmprestimo;
import br.com.biblioteca.negocio.CadastroEspacoEstudo;
import br.com.biblioteca.negocio.CadastroFornecedor;
import br.com.biblioteca.negocio.CadastroLivros;
import br.com.biblioteca.negocio.CadastroPessoa;
import br.com.biblioteca.repositorios.RepositorioEmprestimosArray;
import br.com.biblioteca.repositorios.RepositorioEmprestimosLista;
import br.com.biblioteca.repositorios.RepositorioEspacosEstudoArray;
import br.com.biblioteca.repositorios.RepositorioEspacosEstudoLista;
import br.com.biblioteca.repositorios.RepositorioFornecedorArray;
import br.com.biblioteca.repositorios.RepositorioFornecedorLista;
import br.com.biblioteca.repositorios.RepositorioLivroArray;
import br.com.biblioteca.repositorios.RepositorioLivroLista;
import br.com.biblioteca.repositorios.RepositorioPessoasArray;
import br.com.biblioteca.repositorios.RepositorioPessoasLista;

public class BibliotecaTest {

	public static void main(String[] args) {
		Biblioteca biblioteca;

		CadastroEmprestimo cadEmp = null;
		CadastroEspacoEstudo cadEspEst = null;
		CadastroFornecedor cadFor = null;
		CadastroLivros cadLiv = null;
		CadastroPessoa cadPes = null;

		Path path = Paths.get("config.txt");
		try {
			byte[] b = Files.readAllBytes(path);
			String s = new String(b);
			if (s.equals("")) {
				manipulaArquivo(path);
			}

			if (s.equals("lista")) {
				cadEmp = new CadastroEmprestimo(
						new RepositorioEmprestimosLista());
				cadEspEst = new CadastroEspacoEstudo(
						new RepositorioEspacosEstudoLista());
				cadFor = new CadastroFornecedor(
						new RepositorioFornecedorLista());
				cadLiv = new CadastroLivros(new RepositorioLivroLista());
				cadPes = new CadastroPessoa(new RepositorioPessoasLista());

			} else {
				cadEmp = new CadastroEmprestimo(
						new RepositorioEmprestimosArray(10));
				cadEspEst = new CadastroEspacoEstudo(
						new RepositorioEspacosEstudoArray(10));
				cadFor = new CadastroFornecedor(new RepositorioFornecedorArray(
						10));
				cadLiv = new CadastroLivros(new RepositorioLivroArray(10));
				cadPes = new CadastroPessoa(new RepositorioPessoasArray(10));

			}

			biblioteca = new Biblioteca(cadEmp, cadEspEst, cadLiv, cadPes,
					cadFor);

			Pessoa p = new Aluno("Maria", 2, 0.5, 10);
			Livro l = new Livro("Java", "1", new Fornecedor("Saraiva", 111),
					false, 10);
			Fornecedor f = new Fornecedor("Saraiva", 12345);
			Emprestimo e = new Emprestimo(p, l);
			EspacoEstudo esp = new EspacoEstudo(1);

			// biblioteca.pegarLivroEmprestado(p, l);
			// biblioteca.cadastrarEspEstudo(1);
			// biblioteca.removerEspEstudo(new EspacoEstudo(2));
			biblioteca.cadastrarLivro(l);

		} catch (IOException | LivroException | FornecedorException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void manipulaArquivo(Path path) throws IOException {
		Files.write(path, "lista".getBytes());
	}

}
