package hortifruti.repository;

import hortifruti.model.Produto;

public interface ProdutoRepository {
		//CRUD
		public void procurarPorID(int id);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int id);

}
