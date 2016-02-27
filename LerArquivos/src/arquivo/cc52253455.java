/**
 * 
 */
package arquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author alan_
 */
public class cc52253455 {

	public static FileReader fileReader;
	public static BufferedReader bufferedReader;
	public static Integer QuantLinhas = 0;

	/**
	 * @param args
	 *            Método Main
	 * 
	 */
	public static void main(String[] args) {

		lerArquivoTxt();
	}

	/**
	 * Método que pega como entrada um arquivo .txt, o lê e imprime o conteudo
	 * do mesmo na tela.
	 */
	public static void lerArquivoTxt() {

		try {
			fileReader = new FileReader("Arquivo.txt");
			bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {

				System.out.println(bufferedReader.readLine());
				QuantLinhas = QuantLinhas + 1;
			}
			bufferedReader.close();

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		System.out.println("" + QuantLinhas + "");
	}
}