package Aula_28A_HashMap_ParaCasa;

import java.awt.RenderingHints.Key;
import java.util.HashMap;


public class Aula_28A {

	public static void main(String[] args) {
		// Initial Size 
				/*Quando a gente instancia um HashMap o máximo de elementos que podem ser inseridos no Map são 16 sem 
				 * precisar criar novas posições, ou seja, sua capacidade inicial é 16, mas esse initial Size pode 
				 * ser mudado para mais ou menos que 16.*/
				
				// Load Factor
				
				/* O Load Factor mensura em que momento o HashMap deve dobrar o seu tamanho, ou seja, antes de atingir a 
				 * Initial Size em algum momento o tamanho do HashMap irá mudar de 16 para 32.*/
				
				// EXEMPLO
				/*O tamanho inicial do HashMap é 16 e o loadFactor é 0.75, então quando a lista alcançar o tamanho 12,
				 *  ela automaticamente irá dobrar sua capacidade para 32.*/
		
				HashMap<String,String> exemplo = new HashMap<String, String>();
				
				// Inserindo os 12 elementos
				
				exemplo.put("1", "valor1");
				exemplo.put("2", "valor2");
				exemplo.put("3", "valor3");
				exemplo.put("4", "valor4");
				exemplo.put("5", "valor5");
				exemplo.put("6", "valor6");
				exemplo.put("7", "valor7");
				exemplo.put("8", "valor8");
				exemplo.put("9", "valor9");
				exemplo.put("10", "valor10");
				exemplo.put("11", "valor11");
				exemplo.put("12", "valor12");
				
				// Quando o elemento 13 for inserido ocorrerá um Rehash na lista
				exemplo.put("13", "valor13");
				
				// A partir daqui o HashMap terá tamanho igual a 32
				exemplo.put("14", "valor14");
				exemplo.put("15","valor15");
				
				// Exibindo os elementos do HashMap
				for(String key : exemplo.keySet()) {
					String value = exemplo.get(key);
					System.out.println(key + " " +  value);
				}

	}

}
