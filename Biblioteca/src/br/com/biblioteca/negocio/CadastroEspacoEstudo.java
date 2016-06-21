package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.interfaces.RepositorioEspacoEstudo;

public class CadastroEspacoEstudo {
	
	private RepositorioEspacoEstudo espacosEstudo;
	
	public CadastroEspacoEstudo(RepositorioEspacoEstudo espaco){
		this.espacosEstudo = espaco;
	}
	
	public void cadastrar(EspacoEstudo espaco){
		
	}
	public void remover (EspacoEstudo espaco){
		
	}
	public void atualizar (EspacoEstudo espaco){
		
	}
	public EspacoEstudo procurar(int identificador){
		return null;
	}
}
