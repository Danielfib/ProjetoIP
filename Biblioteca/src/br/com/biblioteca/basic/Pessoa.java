package br.com.biblioteca.basic;

public abstract class Pessoa {
	private String Nome;
	private int ID;

	public Pessoa(String nome, int id) {
		this.Nome = nome;
		this.ID = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
