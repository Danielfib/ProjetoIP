package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.interfaces.RepositorioEspacoEstudo;

public class RepositorioEspacoEstudoArray implements RepositorioEspacoEstudo {
	
	private EspacoEstudo[] espacos;
	private int base;
	
	public RepositorioEspacoEstudoArray(int tam) {
		espacos = new EspacoEstudo[tam];
	}

	public EspacoEstudo[] getEspacosEstudo() {
		return espacos;
	}

	public void setEspacosEstudo(EspacoEstudo[] espacos) {
		this.espacos = espacos;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public void inserir(EspacoEstudo espaco) {
		espacos[base] = espaco;
		base++;
		
	}

	@Override
	public EspacoEstudo procurar(int identificador) {
		for(int i = 0; i < base; i++) {
			if(espacos[i].getIdentificador() == identificador) {
				return espacos[i];
			}
		}
		return null;
	}

	@Override
	public void atualizar(EspacoEstudo espaco) {
		EspacoEstudo auxiliar = procurar(espaco.getIdentificador());
		if(auxiliar != null) {
			auxiliar = espaco;
		}
	}

	@Override
	public void remover(int identificador) {
		EspacoEstudo auxiliar = procurar(identificador);
		if(auxiliar != null) {
			auxiliar = espacos[base-1];
			espacos[base-1] = null;
			base--;
		}
	}

}
