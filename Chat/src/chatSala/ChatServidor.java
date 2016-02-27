package chatSala;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServidor {
	List<PrintWriter> escritores = new ArrayList<>();

	@SuppressWarnings("unused")
	private Scanner leitor;
	private ServerSocket server;
	@SuppressWarnings("unused")
	private Map<String, ObjectOutputStream> map = new HashMap<String, ObjectOutputStream>();

	public ChatServidor() {

		try {
			server = new ServerSocket(5000);
			// Socket socket = server.accept();

			// byte[] objectAsByte = new byte[socket.getReceiveBufferSize()];
			// BufferedInputStream bf = new BufferedInputStream(
			// socket.getInputStream());
			// bf.read(objectAsByte);
			// File arquivo = (File) getObjectFromByte(objectAsByte);
			//
			// String dir = arquivo.getDiretorioDestino().endsWith("/") != null
			// ?
			// arquivo.getDiretorioDestino() + arquivo.getName() :
			// arquivo.getDiretorioDestino() + "/" + arquivo.getName();
			//
			// System.out.println("Escrevendo arquivo " + dir);
			// FileOutputStream fos = new FileOutputStream(dir);
			// fos.write(arquivo.getConteudo());
			// fos.close();

			while (true) {

				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private void encaminhaParaTodos(String texto) {
		for (PrintWriter PrintWriter : escritores) {
			try {

				PrintWriter.println(texto);
				PrintWriter.flush();
			} catch (Exception e) {
			}
		}
	}

	private class EscutaCliente implements Runnable {
		private Scanner leitor;

		// @SuppressWarnings("unused")
		// private ObjectOutputStream outputStream;
		// @SuppressWarnings("unused")
		// private ObjectInputStream inputStream;

		public EscutaCliente(Socket socket) {

			try {
				leitor = new Scanner(socket.getInputStream());
				// this.outputStream = new
				// ObjectOutputStream(socket.getOutputStream());
				// this.inputStream = new
				// ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				String texto;
				while ((texto = leitor.nextLine()) != null) {
					encaminhaParaTodos(texto);
				}
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new ChatServidor();
	}

	// ###################################################
	// private static Object getObjectFromByte(byte[] objectAsByte) {
	// Object obj = null;
	// ByteArrayInputStream bis = null;
	// ObjectInputStream ois = null;
	// try {
	// bis = new ByteArrayInputStream(objectAsByte);
	// ois = new ObjectInputStream(bis);
	// obj = ois.readObject();
	// bis.close();
	// ois.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// } catch (ClassNotFoundException e) {
	// e.printStackTrace();
	// }
	// return obj;
	// }
}