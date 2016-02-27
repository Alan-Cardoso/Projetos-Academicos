package chatSala;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatCliente extends JFrame {

	private JTextField textFieldEnviar;
	private Socket socket;
	private PrintWriter escritor;
	@SuppressWarnings("unused")
	private String name;
	private JTextArea textAreaRecebido;
	private Scanner leitor;
	private Icon ImagemArquivos = new ImageIcon("src//fotos//Arquivos.png");
	private Icon ImagemMensagem = new ImageIcon("src//fotos//Mensagem.png");

	private class EscutaServidor implements Runnable {

		@Override
		public void run() {

			String text;
			while ((text = leitor.nextLine()) != null) {
				textAreaRecebido.append(text + "\n");
			}
		}
	}

	public ChatCliente(String name) {
		super("Chat: " + name);
		Font fonte = new Font("Arial", Font.PLAIN, 26);
		textFieldEnviar = new JTextField(14);
		textFieldEnviar.setFont(fonte);

		JButton botaoMensagens = new JButton(ImagemMensagem);
		botaoMensagens.setFont(fonte);
		botaoMensagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				escritor.println(name + ": " + textFieldEnviar.getText());
				escritor.flush();
				textFieldEnviar.setText(" ");
				textFieldEnviar.requestFocus();
			}
		});

		JButton botaoArquivos = new JButton(ImagemArquivos);
		botaoArquivos.setFont(fonte);
		botaoArquivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		Container container = new JPanel();
		container.setLayout(new BorderLayout());
		container.add(BorderLayout.WEST, textFieldEnviar);
		container.add(BorderLayout.CENTER, botaoMensagens);
		container.add(BorderLayout.EAST, botaoArquivos);

		textAreaRecebido = new JTextArea();
		textAreaRecebido.setFont(fonte);
		JScrollPane scroll = new JScrollPane(textAreaRecebido);

		getContentPane().add(BorderLayout.CENTER, scroll);
		getContentPane().add(BorderLayout.SOUTH, container);
		Network();

		textAreaRecebido.setEditable(false);
		this.name = name;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	private void Network() {
		try {
			socket = new Socket("127.0.0.1", 5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatCliente("Alan");
		new ChatCliente("Naiara");
	}
}