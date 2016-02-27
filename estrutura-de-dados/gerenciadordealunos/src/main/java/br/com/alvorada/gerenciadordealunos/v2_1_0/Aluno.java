package br.com.alvorada.gerenciadordealunos.v2_1_0;

public class Aluno {
	public static final int POSICAO_NOTA_PRIMEIRO_BIMESTRE = 0;
	public static final int POSICAO_NOTA_SEGUNDO_BIMESTRE = 1;

	private String nomeAluno;
	private int cpf;
	private String classeDoAluno;
	private Nota[] notas = new Nota[2];

	public Aluno(String nomeAluno, int cpf, String classeDoAluno) {
		this.nomeAluno = nomeAluno;
		this.cpf = cpf;
		this.classeDoAluno = classeDoAluno;
		this.notas = new Nota[2];
		this.notas[POSICAO_NOTA_PRIMEIRO_BIMESTRE] = new Nota();
		this.notas[POSICAO_NOTA_SEGUNDO_BIMESTRE] = new Nota();
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setClasseDoAluno(String classeDoAluno) {
		this.classeDoAluno = classeDoAluno;
	}

	public Nota[] getNotas() {
		return notas;

	}

	public void setNotas(Nota[] nota) {
		this.notas = nota;
	}

	@Override
	public String toString() {
		return "Aluno:\t" + nomeAluno + "\nCPF:  \t" + cpf + "\nClasse:\t" + classeDoAluno + "\n\nNOTAS:\n1º Bimestre\t2º Bimestre\tMédia:\n   "
				+ notas[POSICAO_NOTA_PRIMEIRO_BIMESTRE].getNota() + "\t\t   " + notas[POSICAO_NOTA_SEGUNDO_BIMESTRE].getNota() + "\t\t "
				+ (notas[POSICAO_NOTA_PRIMEIRO_BIMESTRE].getNota() + notas[POSICAO_NOTA_SEGUNDO_BIMESTRE].getNota())/ 2;
	}

}
