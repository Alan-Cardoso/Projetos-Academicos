/**
 * 
 */
package classe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author AlanCardoso
 *
 */
public class LeArquivoFinal {

	ArrayList<String> list = new ArrayList<String>();
	private FileReader arq;
	@SuppressWarnings("unused")
	private BufferedReader bufferedReader;

	@SuppressWarnings("unused")
	private String LeArquivo(String urlArquivo, ArrayList<String> list) {

		String[] strArray = new String[3];
		int minimum = 1000000000;
		int index = 0;
		try {
			arq = new FileReader("nome");
			bufferedReader = new BufferedReader(arq);

			for (int i = 0; i < list.size(); i++) {

				strArray = list.get(i).split(";");
				if (minimum > Integer.parseInt(strArray[2])) {
					minimum = Integer.parseInt(strArray[2]);
					index = i;
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list.get(index);
	}
}