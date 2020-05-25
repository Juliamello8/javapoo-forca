package com.github.juliamello8.classes;

public class Menu {
	private int codMenu;
	public int getCodMenu() {
		return codMenu;
	}
	public void setCodMenu(int codMenu) {
		this.codMenu = codMenu;
		if (this.codMenu == 3) {
			Regras r = new Regras();
			r.mostrarRegras();
		}else if( this.codMenu == 2) {
			Temas t = new Temas();
			t.mostrarTemas();
		}else if (this.codMenu == 1) {
			ExibirPerfil ep = new ExibirPerfil();
			ep.verPerfil();
		};
	}
}
