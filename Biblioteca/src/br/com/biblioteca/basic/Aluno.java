package br.com.biblioteca.basic;

import br.com.biblioteca.exceptions.EspacoEstudoException;
import br.com.biblioteca.exceptions.LivroException;
import br.com.biblioteca.repositorios.RepositorioEmprestimosArray;
import br.com.biblioteca.repositorios.RepositorioEmprestimosLista;

public class Aluno extends Pessoa {
	private double valorMulta;
	private int cotaImpressao;	

	public Aluno(String Nome, int ID, double valorMulta, int cotaImpressao) {
		super(Nome, ID);
		this.valorMulta = valorMulta;
		this.cotaImpressao = cotaImpressao;
	}	

	public double getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(double valorMulta) {
		this.valorMulta = valorMulta;
	}

	public int getCotaImpressao() {
		return cotaImpressao;
	}

	public void setCotaImpressao(int cotaImpressao) {
		this.cotaImpressao = cotaImpressao;
	}	

	public void reservarEspaco(EspacoEstudo espaco) throws EspacoEstudoException {
		if (espaco.getAluno() == null) {
			espaco.setAluno(this);
		} else {
			throw new EspacoEstudoException ("O espaço já se encontra reservado!");
		}
	}

	public void sairEspaco(EspacoEstudo espaco) {
		espaco.setAluno(null);
	}

}
