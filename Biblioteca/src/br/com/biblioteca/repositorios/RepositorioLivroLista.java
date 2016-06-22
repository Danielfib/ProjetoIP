package br.com.biblioteca.repositorios;

import br.com.biblioteca.basic.Livro;
import br.com.biblioteca.interfaces.RepositorioLivro;
import br.com.biblioteca.basic.Quadrado;

public class RepositorioLivroLista implements RepositorioLivro {

	public Quadrado primeiro;

	public void criarLista() {
		primeiro = null;
	}

//	public void inserirInverso(Livro) {
//		Quadrado frist = new Quadrado(i);
//		frist.setNumero(i);
//		frist.setProx(primeiro);
//		primeiro = frist;
//	}
	@Override
	
	public void inserir(Livro livro) {
		Quadrado frist = primeiro;
		if (primeiro == null) {
			primeiro = new Quadrado(livro);
		} else {
			while (frist.getProx() != null) {
				frist = frist.getProx();
			}
			frist.setProx(new Quadrado(livro));
		}
	}
	
	@Override
	
	public Livro procurar(String titulo){
		for ( Quadrado n = primeiro; n !=null ; n = n.getProx()){
			if(n.getLivro().getTitulo()==titulo){
				return n.getLivro();
			}
		}
		return null;
		//retorna exception NEException (Não Encontrado);
	}
	@Override
	
	public void remover(Livro livro) {
		Quadrado anterior = null;
		Quadrado p = primeiro;
 
        while (p != null && p.getLivro().getTitulo() != livro.getTitulo()) {
            anterior = p;
            p = p.getProx();
        }
        if (p == null) {
            return;
        }
        if (anterior == null) {
            primeiro = p.getProx();
        } else {
            anterior.setProx(p.getProx());
        }
    }
	
	@Override
	
	public Livro atualizar(Livro novoLivro) {
		Livro novo = procurar(novoLivro.getTitulo());
		if(novo != null) {
			novo = novoLivro;
		}
		return novo;
	}
}		
