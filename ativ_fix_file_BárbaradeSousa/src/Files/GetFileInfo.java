package Files;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		File myObj = new File("Filename.txt");
		if (myObj.exists()) {
			System.out.println("Nome do arquivo: "+ myObj.getName());
			System.out.println("Caminho absoluto: "+ myObj.getAbsolutePath());
			System.out.println("Gravável: "+ myObj.canWrite());
			System.out.println("Legível: "+ myObj.canRead());
			System.out.println("Tamanho do arquivo em bytes: "+myObj.length());
		}
		else {
			System.out.println("O arquivo não existe.");
		}
	}

}
