package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			File myObj = new File("Filename.txt");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}
	}

}
