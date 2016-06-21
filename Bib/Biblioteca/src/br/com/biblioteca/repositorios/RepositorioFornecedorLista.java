
public class RepositorioFornecedorLista {

	public Quadrado1 primeiro;

	public void criarLista() {
		primeiro = null;
	}

//	public void inserirInverso(Fornecedor) {
//		Quadrado1 frist = new Quadrado1(i);
//		frist.setNumero(i);
//		frist.setProx(primeiro);
//		primeiro = frist;
//	}
	@Override
	
	public void inserir(Fornecedor fornecedor) {
		Quadrado1 frist = primeiro;
		if (primeiro == null) {
			primeiro = new Quadrado1(fornecedor);
		} else {
			while (frist.getProx() != null) {
				frist = frist.getProx();
			}
			frist.setProx(new Quadrado1(fornecedor));
		}
	}
	
	@Override
	
	public Quadrado1 procurar(Fornecedor fornecedor){
		for ( Quadrado1 n = primeiro; n !=null ; n = n.getProx()){
			if(n.getFornecedor()==Fornecedor){
				return n ;
			}
		}
		return null;
		//retorna exception NEException (Não Encontrado);
	}
	@Override
	
	public void remover(Fornecedor fornecedor) {
		Quadrado1 anterior = null;
		Quadrado1 p = primeiro;
 
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
class Quadrado1{
	private Fornecedor fornecedor;
	private Quadrado1 prox;
	
	public Quadrado1(){
		
	}
	public Quadrado1(Fornecedor fonecedor){
		this.fornecedor = fornecedor;
	}
	public Quadrado1(Fornecedor fonecedor, Quadrado1 prox) {
		this.fornecedor = fornecedor;
		this.prox = prox;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Quadrado1 getProx() {
		return prox;
	}
	public void setProx(Quadrado1 prox) {
		this.prox = prox;
	}
	
	
}

