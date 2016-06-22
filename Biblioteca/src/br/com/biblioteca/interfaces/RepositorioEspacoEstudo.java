package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.EspacoEstudo;

public interface RepositorioEspacoEstudo {

	public void inserir(EspacoEstudo espaco);

	public EspacoEstudo procurar(int identificador);

	public void remover(EspacoEstudo espaco);

	public EspacoEstudo atualizar(EspacoEstudo espaco);

}