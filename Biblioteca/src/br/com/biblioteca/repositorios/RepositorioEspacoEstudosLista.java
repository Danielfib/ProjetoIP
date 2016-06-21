package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.interfaces.RepositorioEspacoEstudo;

public class RepositorioEspacoEstudosLista implements RepositorioEspacoEstudo {
	ListaEspacoEstudos lista = new ListaEspacoEstudos();

	public void inserir(EspacoEstudo espaco) {
		ElementoEspacoEstudo entrada = new ElementoEspacoEstudo();
		ElementoEspacoEstudo auxilio = new ElementoEspacoEstudo();
		if (lista.getQtd() == 0) {
			entrada.setEspaco(espaco);
			entrada.setProx(null);
			lista.setPrimeiro(entrada);
			lista.setUltimo(entrada);
			lista.setQtd(lista.getQtd() + 1);
		} else {
			auxilio = lista.getPrimeiro();
			while (auxilio.getProx() != null) {
				auxilio = auxilio.getProx();
			}
			entrada.setEspaco(espaco);
			entrada.setProx(null);
			auxilio.setProx(entrada);
			lista.setUltimo(entrada);
			lista.setQtd(lista.getQtd() + 1);
		}
	}

	public EspacoEstudo procurar(int identificador) {
		ElementoEspacoEstudo teste = new ElementoEspacoEstudo();
		if (lista.getQtd() == 0) {
			return null;
			// retorna exception LVException (Lista Vazia)
		} else {
			teste = lista.getPrimeiro();
			for (int i = 0; i <= 1; i++) {
				if (teste.getEspaco().getIdentificador() == identificador) {
					i = 2;
					return teste.getEspaco();
					// retorna o espaço indicado;
				} else if (teste.getProx() != null) {
					i = 0;
					teste = teste.getProx();
				} else {
					return null;
					// retorna exception NEException (Não Encontrado);
				}
			}
		}
		return null;
	}

	public void remover(int identificador) {
		ElementoEspacoEstudo teste = new ElementoEspacoEstudo();
		if (lista.getQtd() == 0) {
			// retorna exception LVException (Lista Vazia)
		} else {
			teste = lista.getPrimeiro();
			if (teste.getProx() != null) {
				if (teste.getEspaco().getIdentificador() == identificador) {
					lista.setPrimeiro(lista.getPrimeiro().getProx());

					// Remove o primeiro valor da lista e substitui pelo
					// próximo
				} else if (teste.getProx().getEspaco().getIdentificador() == identificador) {
					teste.setProx(teste.getProx().getProx());
				} else {
					teste = teste.getProx();
				}
			} else {
				// Retorna NEException (Não Encontrado)
			}
		}
	}

	@Override
	public void atualizar(EspacoEstudo espaco) {
		// TODO Auto-generated method stub
		
	}

}
