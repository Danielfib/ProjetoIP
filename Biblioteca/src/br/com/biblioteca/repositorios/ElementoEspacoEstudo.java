package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.EspacoEstudo;

public class ElementoEspacoEstudo {
	private EspacoEstudo espaco;
	private ElementoEspacoEstudo prox;

	public EspacoEstudo getEspaco() {
		return espaco;
	}

	public void setEspaco(EspacoEstudo espaco) {
		this.espaco = espaco;
	}

	public ElementoEspacoEstudo getProx() {
		return prox;
	}

	public void setProx(ElementoEspacoEstudo prox) {
		this.prox = prox;
	}
}
