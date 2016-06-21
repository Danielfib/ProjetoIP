package br.com.biblioteca.basic;

public class Node {
	private Pessoa pessoa;
	private Node proximo;
	
	public Node (Pessoa pessoa){
		this.pessoa = pessoa;
	}
	
	public Node (Pessoa pessoa, Node proximo){
		this.pessoa = pessoa;
		this.proximo = proximo;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	

}
