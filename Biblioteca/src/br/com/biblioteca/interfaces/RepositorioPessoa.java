package br.com.biblioteca.interfaces;

import br.com.biblioteca.basic.Pessoa;


public interface RepositorioPessoa {	
    public void inserir(Pessoa pessoa);	
    public Pessoa procurar (Pessoa pessoa);
    public void remover (Pessoa pessoa);
    public void atualizar(Pessoa pessoa);	

}




