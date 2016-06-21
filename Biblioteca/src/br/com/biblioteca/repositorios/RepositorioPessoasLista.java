package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Node;
import br.com.biblioteca.basic.Pessoa;
import br.com.biblioteca.interfaces.RepositorioPessoa;

public class RepositorioPessoasLista implements RepositorioPessoa {

	public Node first;

	public void criarLista() {
		first = null;
	}

	@Override
	public void inserir(Pessoa pessoa) {
		Node primeiro = first;
		if (first == null){
			first = new Node(pessoa);
		} else {
			while (primeiro.getProximo() != null){
				primeiro = primeiro.getProximo(); //vai ate o ultimo da lista
			}			
			primeiro.setProximo(new Node(pessoa));
		}
	}

	@Override
	public Pessoa procurar(Pessoa pessoa) {
		for (Node node = first; node != null; node = node.getProximo()){
			if (node.getPessoa().getID() == pessoa.getID()){
				return pessoa;
			}
		}
		return null;		
	}

	@Override
	public void remover(Pessoa pessoa) {
		Node prev = null;
		Node prim = first;
		
		while (prim != null && prim.getPessoa().getID() != pessoa.getID()){
			prev = prim;
			prim = prim.getProximo();
		}
		if (prim==null){
			return;
		}
		if (prev == null){
			first = prim.getProximo(); 
		} else {
			prev.setProximo(prim.getProximo());
		}
	}

	@Override
	public Pessoa atualizar(Pessoa pessoa) {
		Pessoa p = procurar(pessoa);
		if (p != null){
			p = pessoa;
		}
		return p;		

	}

}
