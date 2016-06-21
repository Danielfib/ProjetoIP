package br.com.biblioteca.basic;

import br.com.biblioteca.basic.Fornecedor;;

public class Quadrado1{
	private Fornecedor fornecedor;
	private Quadrado1 prox;
	
	public Quadrado1(){
		
	}
	public Quadrado1(Fornecedor fonecedor){
		this.fornecedor = fornecedor;
	}
	public Quadrado1(Fornecedor fonecedor, Quadrado1 prox) {
		this.fornecedor = fornecedor;
		this.prox = prox;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Quadrado1 getProx() {
		return prox;
	}
	public void setProx(Quadrado1 prox) {
		this.prox = prox;
	}
	
	
}
