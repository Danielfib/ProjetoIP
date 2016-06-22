package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.interfaces.RepositorioEspacoEstudo;

public class RepositorioEspacosEstudoLista implements RepositorioEspacoEstudo {
	ListaEspacoEstudos lista = new ListaEspacoEstudos();

	public void inserir(EspacoEstudo espaco) {
		ElementoEspacoEstudo entrada = new ElementoEspacoEstudo();
		ElementoEspacoEstudo auxilio = new ElementoEspacoEstudo();
		if (lista.getQtd() == 0) {
			entrada.setEspaco(espaco);
			lista.setPrimeiro(entrada);
			lista.setUltimo(entrada);
			lista.setQtd(lista.getQtd() + 1);
		} else {
			auxilio = lista.getPrimeiro();
			while (auxilio.getProx() != null) {
				auxilio = auxilio.getProx();
			}
			entrada.setEspaco(espaco);
			auxilio.setProx(entrada);
			lista.setUltimo(entrada);
			lista.setQtd(lista.getQtd() + 1);
		}
	}

	public EspacoEstudo procurar(int identificador) {
		ElementoEspacoEstudo teste = new ElementoEspacoEstudo();
		if (lista.getQtd() == 0) {
			return null;
		} else {
			teste = lista.getPrimeiro();
			for (int i = 0; i <= 1; i++) {
				if (teste.getEspaco().getIdentificador() == identificador) {
					i = 2;
					return teste.getEspaco();
				} else if (teste.getProx() != null) {
					i = 0;
					teste = teste.getProx();
				} else {
					return null;
				}
			}
		}
		return null;
	}

	public void remover(EspacoEstudo espaco) {
		ElementoEspacoEstudo teste = new ElementoEspacoEstudo();
		if (lista.getQtd() == 0) {
		} else {
			teste = lista.getPrimeiro();
			if (teste.getProx() != null) {
				if (teste.getEspaco() == espaco) {
					lista.setPrimeiro(lista.getPrimeiro().getProx());
					lista.setQtd(lista.getQtd() - 1);
					// Remove o primeiro valor da lista e substitui pelo
					// próximo
				} else if (teste.getProx().getEspaco() == espaco) {
					teste.setProx(teste.getProx().getProx());
					lista.setQtd(lista.getQtd() - 1);
				} else {
					teste = teste.getProx();
				}
			} else {
			}
		}
	}

	@Override
	public EspacoEstudo atualizar(EspacoEstudo espaco) {
		EspacoEstudo auxiliar = procurar(espaco.getIdentificador());
		if (auxiliar != null) {
			auxiliar = espaco;
		}
		return auxiliar;

	}

}
