package Files;

import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\bdsma\\eclipse-workspace\\ativ_fix_file_BárbaradeSousa\\src\\Files");
		if (myObj.delete()) {
			System.out.println("Exclua o arquivo: "+ myObj.getName());
		}
		else {
			System.out.println("Falha ao excluir o arquivo.");
		}
	}

}
