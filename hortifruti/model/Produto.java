package hortifruti.model;

public abstract class Produto {

	private int id;
	
	private float valor;
	private String nome;

	public Produto(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {


		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Id do produto: " + this.id);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Valor: " + this.valor);

	}

}