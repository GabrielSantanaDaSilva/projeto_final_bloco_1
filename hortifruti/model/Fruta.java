package hortifruti.model;

import hortifruti.model.Produto;

public class Fruta extends Produto {
	
	private String fruta = "Fruta";
	private int tipo;

	public Fruta(int id, int tipo, String nome, float valor) {
		super(id, nome, valor);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}


	public void visualizar() {
		
		if(tipo == 1) {
		super.visualizar();
		System.out.println("Tipo do Produto: " + this.fruta);
	}else {
		super.visualizar();
		System.out.println("Tipo do Produto: Fruta");
	}
		

}
}
