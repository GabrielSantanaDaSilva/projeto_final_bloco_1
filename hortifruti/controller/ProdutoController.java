package hortifruti.controller;

import java.util.ArrayList;

import hortifruti.model.Produto;
import hortifruti.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList <Produto> listaProdutos = new ArrayList <Produto>();
	int numero = 0;

	@Override
	public void procurarPorID(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			produto.visualizar();
		}else {
				System.out.println("O produto número"+ id +" não foi encontrado");
			}
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
		var buscaProduto = buscarNaCollection(numero);
		
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("O produto "+ produto.getId()+ " Foi atualizada com sucesso!");
		}else {
			System.out.println("O produto" + produto.getId()+ " Não foi encontrado");
		}
		
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(numero);
		if (produto != null) {
			if(listaProdutos.remove(produto) == true) {
				System.out.println("O produto numero: "+numero+" Foi deletada com sucesso!");
			}else {
				System.out.println("O produto numero: "+numero+" Não foi encontrada");
			}
		}
		
	}
	
	public int gerarID() {
		
		return ++ numero;
	}
	
	public Produto buscarNaCollection(int id) {
		for (var produtos : listaProdutos) {
			if (produtos.getId() == id) {
				return produtos;
			}
			
		}
		return null;
		
	}

}
