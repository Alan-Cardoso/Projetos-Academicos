package org.alvorada.arvore.model;

import javax.swing.JOptionPane;

public class Node {

    private String pergunta;
    private String animalASugerir;
    private Node nodeNao = null;
    private Node nodeSim = null;


    public void setPergunta(String pergunta) {
	this.pergunta = pergunta;
    }
    
    public void setAnimalASugerir(String animalASugerir) {
	this.animalASugerir = animalASugerir;
    }

    public void setNodeNao(Node nodeNao) {
	this.nodeNao = nodeNao;
    }

    public void setNodeSim(Node nodeSim) {
	this.nodeSim = nodeSim;
    }

    

    /**
     * Se existirem nós abaixo deste o programa vai para um deles, a escolha é
     * feita através de uma pergunta sobre uma característica do animal ao
     * jogador. Se não existirem mais nós o programa entra no else
     */
    public void run() {
	/*
	 * Testa se existem nós baixo e executa um deles, caso contrário entra
	 * no else e sugere esse animal
	 */
	if (this.nodeSim != null) {
	    int questao = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + this.pergunta,
		    "Por acaso...", 0);
	    if (questao == 0) {
		nodeSim.run();
	    } else {
		nodeNao.run();
	    }

	} else {
	    boolean acerteiOAnimal = sugerirAnimal();
	    if (acerteiOAnimal) {
		mostrarAMensagemQueAcerteiOAnimal();
	    } else {
		criarUmNovoBranch();
	    }
	}

    }

    /**
     * Esse método é executado quando o computador acha que encontrou o animal,
     * ele mostra ao jogador o animal deste objeto armazenado na variavel
     * animalASugerir Como o jogador pode escolher se o computador acertou ou
     * não ele retorna um boolean ao método principal informando se o animal
     * realmente foi encontrado TRUE ou se o algoritmo falhou na tentativa de
     * descoberta FALSE.
     * 
     * @return true - right animal<br>
     *         false - wrong animal
     */
    private boolean sugerirAnimal() {
	int animalSugerido = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + this.animalASugerir,
		"Sei o animal", 0);
	return (animalSugerido == 0);
    }

    /**
     * Mensagem para o jogador qeu o computador acertou o animal que ele estava
     * pensando
     */
    private void mostrarAMensagemQueAcerteiOAnimal() {
	JOptionPane.showMessageDialog(null, "Acertei novamente");
    }

    /**
     * Quando o animal sugerido não é o animal que o Jogador havia pensado esse
     * método recolhe as informações do jogador relativas ao novo animal e cria
     * um novo ramo com dois nós dentro desse nó existente. <br>
     * O nó SIM é criado com as opções do jogador.<BR>
     * o nó NÃO é colocado o animal desse nó já que ele pertende a esse ramo mas
     * não se encaixa na descrição que o jogador forneceu
     * 
     */
    private void criarUmNovoBranch() {
	String animalQueOJogadorPensou = JOptionPane.showInputDialog(null, "Qual animal que você pensou?", "Desisto",
		0);
	String dicaDoJogadorParaOAnimalPensado = JOptionPane.showInputDialog(null,
		"O(a) " + animalQueOJogadorPensou + " ..................... e o(a) " + this.animalASugerir + " não.",
		"Qual a diferença entre os animais?", 0);
	Node novoNodeNao = new Node();
	novoNodeNao.setAnimalASugerir(this.animalASugerir);

	Node novoNodeSim = new Node();
	novoNodeSim.setAnimalASugerir(animalQueOJogadorPensou);
	
	this.pergunta = dicaDoJogadorParaOAnimalPensado;
	
	this.nodeNao = new Node();
	this.nodeSim = new Node();

	this.nodeNao = novoNodeNao;
	this.nodeSim = novoNodeSim;
    }

}
