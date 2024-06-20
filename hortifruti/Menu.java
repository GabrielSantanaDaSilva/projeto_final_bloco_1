package hortifruti;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import hortifruti.util.Cores;
import hortifruti.model.Produto;
import hortifruti.model.Fruta;
import hortifruti.model.Legume;
import hortifruti.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		int id, tipo;
		float valor;
		String nome;

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   HORTIFRUTI                        ");
			System.out.println("                    SANT'ANA                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar Produto por id                ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros \n");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println(
						Cores.TEXT_WHITE_BOLD + "\nHortifruti Sant'Ana - Obrigado por escolher nossos produtos!!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Produto\n\n");
				System.out.println("Digite o ID do Produto: ");
				
				id = leia.nextInt();
				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite o Valor do Produto: ");
				valor = leia.nextFloat();
				do {
					System.out.println("Digite o tipo de Produto: (1- Fruta | 2- Legume");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("O seu Produto é uma fruta? (1- SIM  | 2- NÃO)");
					tipo = leia.nextInt();
					if (tipo == 1) {
						produtos.cadastrar(new Fruta(produtos.gerarID(), tipo, nome, valor));
					} else {
						produtos.cadastrar(new Legume(produtos.gerarID(), tipo, nome, valor));
					}
					break;
				}
				case 2 -> {
					System.out.println("O seu Produto é um Legume? (2- SIM  | 1- NÃO)");
					tipo = leia.nextInt();
					if (tipo == 2 ) {
						produtos.cadastrar(new Legume(produtos.gerarID(), tipo, nome, valor));
					} else {
						produtos.cadastrar(new Fruta(produtos.gerarID(), tipo, nome, valor));
					}
					break;
				}

				}
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os Produtos\n\n");
				produtos.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar Produtos - por id\n\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do Produto\n\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Produto\n\n");
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}

	}

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "Pressione enter para continuar: \n\n");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter");
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Gabriel Sant'Ana da Silva");
		System.out.println("*********************************************************");
	}
}
