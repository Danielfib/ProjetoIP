package br.com.biblioteca.negocio;

import br.com.biblioteca.basic.Aluno;
import br.com.biblioteca.basic.EspacoEstudo;
import br.com.biblioteca.interfaces.RepositorioEspacoEstudo;

public class CadastroEspacosEstudo {
	
	private RepositorioEspacoEstudo espacosEstudo;
	
	public CadastroEspacosEstudo(RepositorioEspacoEstudo espaco){
		this.espacosEstudo = espaco;
	}
	
	public void cadastrar(EspacoEstudo espaco){
		if(this.espacosEstudo.procurar(espaco.getIdentificador()) == null){
			this.espacosEstudo.inserir(espaco);
		}else{
			//Exception
		}
		
	}
	public void remover (EspacoEstudo espaco){
		if(this.espacosEstudo.procurar(espaco.getIdentificador()) != null){
			this.espacosEstudo.remover(espaco);
		}else{
			//Exception
		}
	}
	public void atualizar (EspacoEstudo espaco){
		if(espacosEstudo.atualizar(espaco) == null){
			//Exception
		}
	}
	public EspacoEstudo procurar(int identificador){
		return espacosEstudo.procurar(identificador);
	}
}
