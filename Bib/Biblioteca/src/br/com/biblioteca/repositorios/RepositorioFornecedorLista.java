
public class RepositorioFornecedorLista {

	public Quadrado primeiro;

	public void criarLista() {
		primeiro = null;
	}

//	public void inserirInverso(Fornecedor) {
//		Quadrado frist = new Quadrado(i);
//		frist.setNumero(i);
//		frist.setProx(primeiro);
//		primeiro = frist;
//	}
	@Override
	
	public void inserir(Fornecedor fornecedor) {
		Quadrado frist = primeiro;
		if (primeiro == null) {
			primeiro = new Quadrado(fornecedor);
		} else {
			while (frist.getProx() != null) {
				frist = frist.getProx();
			}
			frist.setProx(new Quadrado(fornecedor));
		}
	}
	
	@Override
	
	public Quadrado procurar(Fornecedor fornecedor){
		for ( Quadrado n = primeiro; n !=null ; n = n.getProx()){
			if(n.getFornecedor()==Fornecedor){
				return n ;
			}
		}
		return null;
		//retorna exception NEException (Não Encontrado);
	}
	@Override
	
	public void remover(Fornecedor fornecedor) {
		Quadrado anterior = null;
		Quadrado p = primeiro;
 
        while (p != null && p.getFornecedor() != fornecedor) {
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
	
	public void atualizar(Fornecedor fornecedor){
		
	}
}
class Quadrado{
	private Fornecedor fornecedor;
	private Quadrado prox;
	
	public Quadrado(){
		
	}
	public Quadrado(Fornecedor fonecedor){
		this.fornecedor = fornecedor;
	}
	public Quadrado(Fornecedor fonecedor, Quadrado prox) {
		this.fornecedor = fornecedor;
		this.prox = prox;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Quadrado getProx() {
		return prox;
	}
	public void setProx(Quadrado prox) {
		this.prox = prox;
	}
	
	
}
}
