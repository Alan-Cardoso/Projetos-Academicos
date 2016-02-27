package br.com.alvorada.gerenciadordealunos.v2_1_0;

/**
 * STUDENTS MANAGEMENT SOFTWARE - SMS
 * 
 * Phase 01 CRUD operations with next attributes (name, documentNumber,
 * classroom).
 * 
 * Phase 02 register students grades
 * 
 */
public class CadastroDeAlunos {
	private static final int ALTERAR_TAMANHO_DA_LISTA = 10;
	private static Aluno[] listaDeAlunos = new Aluno[10];
	private static int primeiraPosicaoLivreNaListaDeAlunos = 0;

	/**
	 * Limpar a tela pulando 50 linhas.
	 */
	private static void limparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	/**
	 * Aumentar o tamanho da lista de alunos(Array). <br>
	 * tamanho atual mais a constante ALTERAR_TAMANHO_DA_LISTA
	 * 
	 * @param listaOriginal
	 *            (Array com o tamanho a alterar)
	 * @return lista maior que a original com todos os dados incluidos
	 */
	private static Aluno[] aumentarListaDeAlunos(Aluno[] listaOriginal) {
		Aluno[] listaTemporaria = new Aluno[listaOriginal.length + ALTERAR_TAMANHO_DA_LISTA];
		for (int numeroDaLinha = 0; numeroDaLinha < primeiraPosicaoLivreNaListaDeAlunos; numeroDaLinha++) {
			listaTemporaria[numeroDaLinha] = listaOriginal[numeroDaLinha];
		}
		return listaTemporaria;
	}

	/**
	 * Dimminuir tamanho da lista de alunos (Array). <br>
	 * tamanho atual menos a constante ALTERAR_TAMANHO_DA_LISTA
	 * 
	 * @param listaOriginal
	 *            (Array com o tamanho a alterar)
	 * @return lista menor que a original com todos os dados incluidos.
	 */
	private static Aluno[] diminuirListaDeAlunos(Aluno[] listaOriginal) {
		Aluno[] listaTemporaria = new Aluno[listaOriginal.length - ALTERAR_TAMANHO_DA_LISTA];
		for (int numeroDaLinha = 0; numeroDaLinha < primeiraPosicaoLivreNaListaDeAlunos; numeroDaLinha++) {
			listaTemporaria[numeroDaLinha] = listaOriginal[numeroDaLinha];
		}
		return listaTemporaria;
	}

	/**
	 * Opção 1 do programa - Cadastrar aluno
	 */
	private static void cadastrarAluno() {
		int numeroDeAlunosACadastrar = Teclado.capturarInt("Quantos alunos deseja cadastrar?\n");
		if ((primeiraPosicaoLivreNaListaDeAlunos + numeroDeAlunosACadastrar) >= listaDeAlunos.length) {
			listaDeAlunos = aumentarListaDeAlunos(listaDeAlunos);
		}
		for (int i = 0; i < numeroDeAlunosACadastrar; i++) {
			System.out.println((i + 1) + "º Aluno:");
			String nomeAluno = Teclado.capturarString("Digite o nome do aluno:");
			
			
			while(nomeAluno.length()==0){
				System.err.println("Você não digitou nada.\nTente novamente.");
				nomeAluno = Teclado.capturarString("Digite o nome do aluno:");
			}
			
			int cpf = Teclado.capturarInt("Digite o número do CPF:");
			String classeDoAluno = Teclado.capturarString("Digite a classe:");

			listaDeAlunos[primeiraPosicaoLivreNaListaDeAlunos] = new Aluno(nomeAluno, cpf, classeDoAluno);

			primeiraPosicaoLivreNaListaDeAlunos++;
			System.out.println("\n\n");
		}

	}

	/**
	 * Opção 2 do programa - listar todos os alunos
	 */
	private static void listarTodosOsAlunos() {
		limparTela();
		System.out.println("-----------------------------------");
		for (int i = 0; i < primeiraPosicaoLivreNaListaDeAlunos; i++) {
			System.out.println("ID:\t" + i);
			System.out.println(listaDeAlunos[i].toString());
			System.out.println("-----------------------------------");
		}
	}

	/**
	 * Opção 3 do programa - encontrar usuário pelo nome
	 */
	private static void encontrarAlunoPeloNome() {
		String nomeParaEncontrar = Teclado.capturarString("Digite o nome do aluno que deseja encontrar:");
		int numeroDeAlunosEncontrados = 0;
		System.out.println("-----------------------------------");
		for (int i = 0; i < primeiraPosicaoLivreNaListaDeAlunos; i++) {
			if (nomeParaEncontrar.equalsIgnoreCase(listaDeAlunos[i].getNomeAluno())) {
				System.out.println(listaDeAlunos[i].toString());
				System.out.println("-----------------------------------");
				numeroDeAlunosEncontrados++;
			}
		}
		System.out.println("\n\n FORAM ENCONTRADOS " + numeroDeAlunosEncontrados + " ALUNOS COM ESSE NOME.");
	}

	/**
	 * Opção 4 do programa - atualizar todas as notas
	 */
	private static void alterarNotas() {
		int opcaoEscolhida = 9;
		do {
			System.out.println("- CADASTRO DE NOTAS -\n\n");
			System.out.println("  1 – cadastrar notas de toda a classe");
			System.out.println("  2 – alterar/cadastrar notas do primeiro bimestre");
			System.out.println("  3 – alterar/cadastrar notas do segundo bimestre");
			System.out.println("  4 – alterar nota de um aluno (Você precisa conhecer o ID do aluno)");
			System.out.println();
			System.out.println("  5 – exibir a lista de alunos cadastrados");
			System.out.println("  6 – encontrar o ID de um aluno");
			System.out.println();
			System.out.println("  9 – sair da opção de cadastro de notas)");
			opcaoEscolhida = Teclado.capturarInt();
			switch (opcaoEscolhida) {
			case 1:
				limparTela();
				atualizarTodasAsNotas();
				System.out.println("\n\n\n\nVocê cadastrou as notas de todos ou alunos.\n\n");
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 2:
				limparTela();
				atualizarNotasDoPrimeiroBimestre();
				System.out.println("\n\n\n\nVocê atualizou as notas de toda a classe.\n\n");
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 3:
				limparTela();
				atualizarNotasDoSegundoBimestre();
				System.out.println("\n\n\n\nVocê atualizou as notas de toda a classe.\n\n");
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			 case 4:
			 limparTela();
			 atualizarNotasDeUmAluno();
			 limparTela();
			 break;
			case 5:
				limparTela();
				listarTodosOsAlunos();
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 6:
				limparTela();
				encontrarAlunoPeloNome();
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 9:
				break;
			default:
				System.out.println("\n\nOpção inválida:");
				break;
			}
		} while (opcaoEscolhida != 9);

	}

	/**
	 * Opção 4.1 - atualizar todas as notas
	 */
	private static void atualizarTodasAsNotas() {
		int nota = 0;
		for (int i = 0; i < primeiraPosicaoLivreNaListaDeAlunos; i++) {
			System.out.println("Aluno: " + listaDeAlunos[i].getNomeAluno());
			Nota[] arrayTemporario = listaDeAlunos[i].getNotas();
			nota = Teclado.capturarInt("Digite a nota do 1º Bimestre: ", 0, 100);
			arrayTemporario[Aluno.POSICAO_NOTA_PRIMEIRO_BIMESTRE].setNota(nota);
			nota = Teclado.capturarInt("Digite a nota do 2º Bimestre: ", 0, 100);
			arrayTemporario[Aluno.POSICAO_NOTA_SEGUNDO_BIMESTRE].setNota(nota);
			listaDeAlunos[i].setNotas(arrayTemporario);

		}
	}

	/**
	 * Opção 4.2 - atualizar notas do primeiro bimestre
	 */
	private static void atualizarNotasDoPrimeiroBimestre() {
		int nota = 0;
		for (int i = 0; i < primeiraPosicaoLivreNaListaDeAlunos; i++) {
			System.out.println("Aluno: " + listaDeAlunos[i].getNomeAluno());
			Nota[] arrayTemporario = listaDeAlunos[i].getNotas();
			nota = Teclado.capturarInt("Digite a nota do 1º Bimestre: ", 0, 100);
			arrayTemporario[Aluno.POSICAO_NOTA_PRIMEIRO_BIMESTRE].setNota(nota);
			listaDeAlunos[i].setNotas(arrayTemporario);

		}
	}

	/**
	 * Opção 4.3 - atualizar notas do segundo bimestre
	 */
	private static void atualizarNotasDoSegundoBimestre() {
		int nota = 0;
		for (int i = 0; i < primeiraPosicaoLivreNaListaDeAlunos; i++) {
			System.out.println("Aluno: " + listaDeAlunos[i].getNomeAluno());
			Nota[] arrayTemporario = listaDeAlunos[i].getNotas();
			nota = Teclado.capturarInt("Digite a nota do 2º Bimestre: ", 0, 100);
			arrayTemporario[Aluno.POSICAO_NOTA_SEGUNDO_BIMESTRE].setNota(nota);
			listaDeAlunos[i].setNotas(arrayTemporario);

		}
	}
	
	/**
	 * Opção 4.4 - atualizar notas de um aluno
	 */
	private static void atualizarNotasDeUmAluno(){
			int idDoAluno = Teclado.capturarInt("Digite o ID do aluno que deseja alterar as notas: ");
			System.out.println(listaDeAlunos[idDoAluno].toString());
			System.out.println(
					"\n\nEsse é o aluno que você vai alterar.\nSe estiver correto \"Y\" caso contrário digite \"N\" e presione enter");
			String alunoCorreto = Teclado.capturarString();
			if (alunoCorreto.equalsIgnoreCase("y")) {
				int nota = 0;
				Nota[] arrayTemporario = listaDeAlunos[idDoAluno].getNotas();
				nota = Teclado.capturarInt("Digite a nota do 1º Bimestre: ", 0, 100);
				arrayTemporario[Aluno.POSICAO_NOTA_PRIMEIRO_BIMESTRE].setNota(nota);
				nota = Teclado.capturarInt("Digite a nota do 2º Bimestre: ", 0, 100);
				arrayTemporario[Aluno.POSICAO_NOTA_SEGUNDO_BIMESTRE].setNota(nota);
				listaDeAlunos[idDoAluno].setNotas(arrayTemporario);

			
			}
	}

	/**
	 * Opção 5 do programa - atualizar os dados de um aluno
	 */
	private static void atualizarCadastroDeUmAluno() {
		int idDoAluno = Teclado.capturarInt("Digite o ID do aluno que deseja alterar: ");
		System.out.println(listaDeAlunos[idDoAluno].toString());
		System.out.println(
				"\n\nEsse é o aluno que você vai alterar.\nSe estiver correto \"Y\" caso contrário digite \"N\" e presione enter");
		String alunoCorreto = Teclado.capturarString();
		if (alunoCorreto.equalsIgnoreCase("y")) {
			listaDeAlunos[idDoAluno].setNomeAluno(Teclado.capturarString("Digite o nome do aluno:"));
			listaDeAlunos[idDoAluno].setCpf(Teclado.capturarInt("Digite o número do CPF:"));
			listaDeAlunos[idDoAluno].setClasseDoAluno(Teclado.capturarString("Digite a classe:"));
		}

	}

	/**
	 * Option 6 of program - delete one entry
	 */
	private static void excluirAluno() {
		int idDoAluno = Teclado.capturarInt("Digite o ID do aluno que deseja excluir: ");
		System.out.println(listaDeAlunos[idDoAluno].toString());
		System.out.println(
				"\n\nEsse é o aluno que você vai deletar.\nSe estiver correto \"Y\" caso contrário digite \"N\" e presione enter");
		String alunoCorreto = Teclado.capturarString();
		if (alunoCorreto.equalsIgnoreCase("y")) {

			for (int i = idDoAluno; i < primeiraPosicaoLivreNaListaDeAlunos; i++) {
				if (i == primeiraPosicaoLivreNaListaDeAlunos - 1) {
					listaDeAlunos[i] = null;
				} else {
					listaDeAlunos[i] = listaDeAlunos[i + 1];

				}
			}
			primeiraPosicaoLivreNaListaDeAlunos--;
		}
		if ((listaDeAlunos.length - primeiraPosicaoLivreNaListaDeAlunos) > ALTERAR_TAMANHO_DA_LISTA) {
			listaDeAlunos = diminuirListaDeAlunos(listaDeAlunos);
		}
	}

	/**
	 * Opção 8 do programa - mostrar estatisticas de uso
	 */
	private static void mostrarEstatisticasDeUsoDaLista() {

		System.out.println("INFORMAÇÕES DA BASE DE DADOS\nTAMANHO TOTAL:\t" + listaDeAlunos.length);
		System.out.println("ESPAÇO LIVRE:\t" + (listaDeAlunos.length - primeiraPosicaoLivreNaListaDeAlunos));
		System.out.println("ESPAÇO OCUPADO:\t" + primeiraPosicaoLivreNaListaDeAlunos);

	}

	public static void main(String[] args) {
		int opcaoEscolhida = 9;
		do {
			limparTela();
			System.out.println("--------------------------------------------------");
			System.out.println("#### SOFTWARE DE GERENCIAMENTO DE ALUNOS 2.1.0 ####");
			System.out.println("--------------------------------------------------\n\n");
			System.out.println("  1 – cadastrar alunos");
			System.out.println("  2 – exibir a lista de alunos cadastrados");
			System.out.println("  3 – encontrar um aluno");
			System.out.println("  4 – atualizar notas");
			System.out.println("  5 – atualizar dados de um aluno");
			System.out.println("  6 – excluir aluno");
			System.out.println();
			System.out.println("  8 – mostrar número de alunos cadastrados e espaços livres");
			System.out.println("  9 – sair do programa");
			opcaoEscolhida = Teclado.capturarInt();
			switch (opcaoEscolhida) {
			case 1:
				limparTela();
				cadastrarAluno();
				limparTela();
				break;
			case 2:
				limparTela();
				listarTodosOsAlunos();
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 3:
				limparTela();
				encontrarAlunoPeloNome();
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 4:
				limparTela();
				alterarNotas();
				limparTela();
				break;
			case 5:
				limparTela();
				atualizarCadastroDeUmAluno();
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 6:
				limparTela();
				excluirAluno();
				limparTela();
				break;
			case 8:
				limparTela();
				mostrarEstatisticasDeUsoDaLista();
				Teclado.capturarString("\n\nDigite qualquer tecla para continuar.");
				limparTela();
				break;
			case 9:
				limparTela();
				System.out.println("\nAté mais!\n\n\n\n\n");
				break;
			default:
				limparTela();
				System.out.println("OPÇÃO INVÁLIDA\n\n\n\n\n");
				Teclado.capturarString("Digite qualquer tecla para continuar.");
				limparTela();
				break;
			}
		} while (opcaoEscolhida != 9);

	}

}
