import Model.Estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (menu) {
            System.out.println("""
                    ============= MENU ESTOQUE =============
                    1 - Adicionar um novo produto
                    2 - Remover Produto
                    3 - Buscar Produto
                    4 - Listar todos os produtos
                    5 - Mostrar valor total do estoque
                    0 - Sair""");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    estoque.adicionarProduto();
                    break;
                case 2:
                    estoque.removerProdutoPeloNome();
                    break;
                case 3:
                    estoque.buscarProdutoNome();
                    break;
                case 4:
                    estoque.listarTodosOsProdutos();
                    break;
                case 5:
                    estoque.valorTotalNoEstoque();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    menu = false;
                    break;
            }
        }
    }
}