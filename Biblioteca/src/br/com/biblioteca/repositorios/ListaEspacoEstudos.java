package br.com.biblioteca.repositorios;

public class ListaEspacoEstudos {

	private ElementoEspacoEstudo primeiro;
	private ElementoEspacoEstudo ultimo;
	private int qtd;

	public ElementoEspacoEstudo getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(ElementoEspacoEstudo primeiro) {
		this.primeiro = primeiro;
	}

	public ElementoEspacoEstudo getUltimo() {
		return ultimo;
	}

	public void setUltimo(ElementoEspacoEstudo ultimo) {
		this.ultimo = ultimo;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
