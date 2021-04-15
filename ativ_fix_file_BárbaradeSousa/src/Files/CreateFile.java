package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("Filename.txt");
			if(myObj.createNewFile()) {
				System.out.println("Arquivo criado: "+ myObj.getName());
			}else {
				System.out.println("Arquivo já existe!");
			}
			
		}
		catch(IOException e) {
			System.out.println("Ocorreu um erro");
			e.printStackTrace();
		}

	}

}
