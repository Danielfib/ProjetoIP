public class Livro {
	
	//nao fiz ainda o atributo " quantidade" pq estou enrolado
	private String titulo;
	private String IdLivro;
	private Fornecedor fornecedor;
	private boolean consulta;
	private int quatidade;	
	
	public Livro() {
	}
	

	public Livro(String titulo, String idLivro, Fornecedor fornecedor,
			boolean consulta, int quatidade) {
		
		this.titulo = titulo;
		IdLivro = idLivro;
		this.fornecedor = fornecedor;
		this.consulta = consulta;
		this.quatidade = quatidade;
	}


	//getters e setters do meu livrão

	public int getQuatidade() {
		return quatidade;
	}


	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIdLivro() {
		return IdLivro;
	}
	public void setIdLivro(String idLivro) {
		this.IdLivro = idLivro;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public boolean isConsulta() {
		return consulta;
	}
	public void setConsulta(boolean consulta) {
		this.consulta = consulta;
	}
	

	
}