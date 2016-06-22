package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.interfaces.RepositorioEspacoEstudo;
import br.com.biblioteca.exceptions.EspacoEstudoException;

public class CadastroEspacoEstudo {

	private RepositorioEspacoEstudo espacosEstudo;

	public CadastroEspacoEstudo(RepositorioEspacoEstudo espaco) {
		this.espacosEstudo = espaco;
	}

	public void cadastrar(EspacoEstudo espaco) throws EspacoEstudoException {
		if (this.espacosEstudo.procurar(espaco.getIdentificador()) == null) {
			this.espacosEstudo.inserir(espaco);
		} else {
			throw new EspacoEstudoException("Espaco ja existente");
		}

	}

	public void remover(EspacoEstudo espaco) throws EspacoEstudoException {
		if (this.espacosEstudo.procurar(espaco.getIdentificador()) != null) {
			this.espacosEstudo.remover(espaco);
		} else {
			throw new EspacoEstudoException("Espaco inexistente");
		}
	}

	public void atualizar(EspacoEstudo espaco) throws EspacoEstudoException {
		if (espacosEstudo.atualizar(espaco) == null) {
			throw new EspacoEstudoException("Espaco inexistente");
		}
	}

	public EspacoEstudo procurar(int identificador)
			throws EspacoEstudoException {
		if (espacosEstudo.procurar(identificador) == null) {
			throw new EspacoEstudoException("Espaco inexistente");
		} else {
			return espacosEstudo.procurar(identificador);
		}
	}
}
