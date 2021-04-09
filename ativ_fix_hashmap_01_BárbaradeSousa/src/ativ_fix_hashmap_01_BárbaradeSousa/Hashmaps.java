package ativ_fix_hashmap_01_B�rbaradeSousa;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<String, String> capitalEstados = new HashMap<String, String>();
		
		// Put()
		capitalEstados.put("Minas Gerais", "Belo Horizonte");
		capitalEstados.put("S�o Paulo", "S�o Paulo");
		capitalEstados.put("Rio Grande do Sul", "Porto Alegre");
		capitalEstados.put("Santa Catarina", "Florian�polis");
		
		// Get()
		capitalEstados.get("Porto Alegre");
		
		// Remove()
		capitalEstados.remove("Florian�polis");
		
		// Clear()
		capitalEstados.clear();
		
		// Size()
		capitalEstados.size();
		
		// Imprimir chaves key.Set()
		for(String i : capitalEstados.keySet()) {
			System.out.println(i);
		}
		
		// Imprimir valores values()
		for(String i : capitalEstados.values()) {
			System.out.println(i);
		}
		
		// Imprimir chaves e valores
		for(String i : capitalEstados.keySet()) {
			System.out.println("Chave: " + i + " valor: " + capitalEstados.get(i));
		}
		}

}
