package hortifruti.controller;

import java.util.ArrayList;

import hortifruti.model.Produto;
import hortifruti.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList <Produto> listaProdutos = new ArrayList <Produto>();
	int numero = 0;

	@Override
	public void procurarPorID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for (var produtos : listaProdutos ) {
			
			produtos.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {

		listaProdutos.add(produto);
		System.out.println("O produto: "+produto.getId()+ " Foi criado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarID() {
		
		return ++ numero;
	}

}
