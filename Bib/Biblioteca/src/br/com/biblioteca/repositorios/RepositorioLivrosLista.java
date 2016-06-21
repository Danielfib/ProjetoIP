
public class RepositorioLivrosLista implements RepositorioLivro {

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
	
	public Quadrado procurar(Livro livro){
		for ( Quadrado n = primeiro; n !=null ; n = n.getProx()){
			if(n.getLivro()==livro){
				return n ;
			}
		}
		return null;
		//retorna exception NEException (Não Encontrado);
	}
	@Override
	
	public void remover(Livro livro) {
		Quadrado anterior = null;
		Quadrado p = primeiro;
 
        while (p != null && p.getLivro() != livro) {
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
	
	public void atualizar(Livro livro){
		
	}
}
class Quadrado{
	private Livro livro;
	private Quadrado prox;
	
	public Quadrado(){
		
	}
	public Quadrado(Livro livro){
		this.livro = livro;
	}
	public Quadrado(Livro livro, Quadrado prox) {
		this.livro = livro;
		this.prox = prox;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Quadrado getProx() {
		return prox;
	}
	public void setProx(Quadrado prox) {
		this.prox = prox;
	}
	
}