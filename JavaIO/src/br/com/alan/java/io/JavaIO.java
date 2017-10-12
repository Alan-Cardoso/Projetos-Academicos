package br.com.alan.java.io;

import java.io.File;
import java.io.IOException;

public class JavaIO {

	public static void main(String[] args) {

		// CreateFile("C:\\Users\\alan_\\OneDrive\\Projetos\\Eclipse\\JavaIO\\src\\br\\com\\alan\\java\\io\\arquivos\\","CriandoArquivo.txt");
		//CreatePath("Criando_path.txt");
		//CreatePathAllSystensOperations("criando_path_todos_Sistemas_Operacionais");
	}

	public static void CreateFile(String caminho, String nomeArquivo) {

		File file = new File(caminho + nomeArquivo);

		try {
			if (file.createNewFile()) {
				System.out.println("Arquivo Criado!");
			} else {
				System.out.println("Arquivo já existe!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void CreatePath(String nomeArquivo) {

		String fileName = nomeArquivo;
		String WorkingDir = System.getProperty("user.dir");

		File file = new File(WorkingDir, fileName);
		
		System.out.println("Caminho final " + file.getAbsolutePath() + "\n");

		try {
			if (file.createNewFile()) {
				System.out.println("Arquivo Criado!");
			} else {
				System.out.println("Arquivo já existe!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void CreatePathAllSystensOperations(String nomeArquivo) {

		String fileName = nomeArquivo;
		String WorkingDir = System.getProperty("user.dir");
		String absolutePath = "";
		String meu_os = System.getProperty("os.name").toLowerCase();

		if (meu_os.indexOf("win") >= 0) {
			absolutePath = WorkingDir + "\\"+fileName;
		} else if (meu_os.indexOf("nix") >= 0 || meu_os.indexOf("nux") >= 0 || meu_os.indexOf("mac") >= 0) {
			absolutePath = WorkingDir + "/"+fileName;
		} else {
			absolutePath = WorkingDir + "/"+fileName;
		}

		System.out.println("Caminho final " + absolutePath + "\n");
		File file = new File(WorkingDir, fileName);
		
		try {
			if (file.createNewFile()) {
				System.out.println("Arquivo Criado!");
			} else {
				System.out.println("Arquivo já existe!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void name() {
		
	}
}