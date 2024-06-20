package hortifruti.model;

import hortifruti.model.Produto;

public class Legume extends Produto {
	
	private String legume = "Legume";
	private int tipo;

	public Legume(int id, int tipo, String nome, float valor) {
		super(id, nome, valor);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}


	public void visualizar() {
		
		if(tipo == 1) {
		super.visualizar();
		System.out.println("Tipo do Produto: " + this.legume);
	}else {
		
		super.visualizar();
		System.out.println("Tipo do Produto: Fruta");
		
	}
		

}
}