package Atividade17;

public class Principal {

	public static void main(String[] args) {
		Sistema sis = new Sistema(); // Instancia��o da classe
		sis.setNome("Maria"); // Preenchimento do nome
		new Thread(sis).start();
		
		Sistema sis2 = new Sistema();
		sis2.setNome("Jo�o");
		new Thread(sis2).start();
		
		Sistema sis3 = new Sistema();
		sis3.setNome("Pedro");
		new Thread(sis3).start();
		
		Sistema sis4 = new Sistema();
		sis4.setNome("J�lia");
		new Thread(sis4).start();
	}

}
