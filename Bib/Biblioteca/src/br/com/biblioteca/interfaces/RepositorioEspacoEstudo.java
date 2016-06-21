package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.EspacoEstudo;

public interface RepositorioEspacoEstudo {
	
	void inserir(EspacoEstudo espaco);

	EspacoEstudo procurar(int identificador);

	void remover(int identificador);

	void atualizar(EspacoEstudo espaco);

}