package ativ_fix_hashmap_02_BárbaradeSousa;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap02 {

	public static void main(String[] args) {
		
		// Instanciando o Scanner para ler os dados do teclado
		Scanner scan = new Scanner(System.in);
		
		// HashMap para guardar os logins e as senhas
		HashMap<String, String> controleAcesso = new HashMap<String, String>();
		
		// Armazendando logins e senhas no HashMap
		controleAcesso.put("login1", "senha1");
		controleAcesso.put("login2", "senha2");
		controleAcesso.put("login3", "senha3");
		controleAcesso.put("login4", "senha4");
		controleAcesso.put("login5", "senha5");
		controleAcesso.put("login6", "senha6");
		controleAcesso.put("login7", "senha7");
		controleAcesso.put("login8", "senha8");
		controleAcesso.put("login9", "senha9");
		controleAcesso.put("login10", "senha10");
		
		// Pedindo o login e senha do usuário
		System.out.println("Informe o login: ");
		String login = scan.nextLine();
		System.out.println("Informe a senha: ");
		String senha = scan.nextLine();
		
		// Verificando se o login e senha estão cadastrados
		if(controleAcesso.containsKey(login) && controleAcesso.containsValue(senha)) {
			System.out.println("ACESSO CONCEDIDO!!!");
		}
		else {
			System.out.println("ACESSO NEGADO!!!");
		}
	}

}
