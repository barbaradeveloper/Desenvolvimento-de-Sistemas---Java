package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
try {
			
			FileWriter myWriter = new FileWriter("Filename.txt");
			myWriter.write("Arquivos em Java podem ser complicados, é divertido o suficiente!");
			myWriter.close();
			System.out.println("Gravado com sucesso no arquivo");
			
		}catch(IOException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}


	}

}
