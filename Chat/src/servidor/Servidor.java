package servidor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		ServerSocket serv = null;
		Socket s = null;
		BufferedReader entrada = null;
		try {
			serv = new ServerSocket(5000);
			s = serv.accept();
			entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(entrada.readLine());

			s.close();
			serv.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}