package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Estoque {
    Scanner scanner = new Scanner(System.in);
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto() {
        Produto produto = new Produto();
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        produto.setNome(nomeProduto);
        System.out.println("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();
        produto.setPreco(precoProduto);
        System.out.println("Digite o quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();
        produto.setQuantidade(quantidadeProduto);
        produtos.add(produto);
        scanner.nextLine();
    }

    public void removerProdutoPeloNome() {
        Produto produto = new Produto();
        produtos.forEach(p -> System.out.println(p.getNome()));
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine().toUpperCase();
        boolean removido = produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nomeProduto));
        System.out.println(removido ? "Produto removido com sucesso!" : "Produto não encontrado.");
    }

    public void buscarProdutoNome() {
        Produto produto = new Produto();
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        Optional<Produto> produtoBusca = produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nomeProduto))
                .findFirst();
        if (produtoBusca.isPresent()) {
            System.out.println(produtoBusca);
        } else {
            System.out.println("Não foi possível encontrar o produto buscado");
        }
    }

    public void valorTotalNoEstoque(){
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += (produto.getPreco() * produto.getQuantidade());
        }
        System.out.println("R$" + valorTotal);
    }

    public void listarTodosOsProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}
