package Iterator;

import java.util.Iterator;

public class MostraMenu {
	
	public static void main(String[] args) {
		MenuItem[] menuItens = new MenuItem[4];
		
		menuItens[0] = new MenuItem("Menu 1");
		menuItens[1] = new MenuItem("Menu 2");
		menuItens[2] = new MenuItem("Menu 3");
		menuItens[3] = new MenuItem("Menu 4");
		
		for(int i = 0; i < menuItens.length; i++) {
			System.out.println(menuItens[i].nome);
		}
		
		Iterator menuIterator = new MenuIterator(menuItens);
		while(menuIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)menuIterator.next();
			System.out.println(menuItem.nome);
		}
		
	}

}
