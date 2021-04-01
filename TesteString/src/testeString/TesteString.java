package testeString;

public class TesteString {

	public static void main(String[] args) {
		
		// MÉTODO COMPARE TO 
		// Compara duas Strings
		
		
		System.out.println("-----Comparando as strings Bárbara e Lorena-----");
		
		// Retorna um número negativo se a primeira for menor
		// Retorna 0 se forem iguais;
		// Retorna um número positivo se a segunda for menor 
		
		String primeira = "Bárbara";
		String segunda = "Lorena";
		int compara = primeira.compareTo(segunda); 
		System.out.println(compara);
		

	}

}
