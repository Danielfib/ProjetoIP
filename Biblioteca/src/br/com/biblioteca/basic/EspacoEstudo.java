package br.com.biblioteca.basic;

public class EspacoEstudo { // Classe espEstudo

	private Aluno aluno; // Classe aluno: Substituir com devido nome
	private int identificador; // int referente ao identificador do espaço

	public EspacoEstudo() { // Construtor vazio
		this.aluno = null;
		this.identificador = 0;
	}

	public EspacoEstudo(int identificador) { // Criará um novo espaço de Estudo.
		this.aluno = null;
		this.identificador = identificador;
	}

	public void reservarEsp(Aluno aluno) { // Reservará o espaço ao aluno.
		this.aluno = aluno;
	}

	public void tirarReserva() { // Removerá a reserva feita.
		this.aluno = null;
	}

	/*public void imprimir(Aluno aluno, int paginas) { // Método para imprimir.
		if ((aluno.getCotaImpressao() > 0)
				&& (aluno.getCotaImpressao() - paginas > 0)) {
			aluno.setCotaImpressao(aluno.getCotaImpressao() - paginas);
			// retorna executado;
		} else {
			// retorna exceção;
		}

	}*/

	// Getters n' Setters
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}
