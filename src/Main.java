import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();

        carrinho.add(new ProdutoAlimentacao("Arroz 5kg", 30.00));
        carrinho.add(new ProdutoSaudeBemEstar("Vitamina C", 50.00));
        carrinho.add(new ProdutoVestuario("Camiseta Algodão", 80.00));
        carrinho.add(new ProdutoCultura("Livro de Java", 120.00));

        System.out.println("=== CÁLCULO DE TRIBUTOS POR CATEGORIA ===\n");

        for (Produto produto : carrinho) {
            double imposto = produto.calcularImposto();
            double precoTotal = produto.getPreco() + imposto;

            System.out.println("Produto: " + produto.getNome());
            System.out.printf("Preço Base: R$ %.2f\n", produto.getPreco());
            System.out.printf("Imposto: R$ %.2f\n", imposto);
            System.out.printf("Preço Final: R$ %.2f\n", precoTotal);
            System.out.println("-----------------------------------");
        }
    }
}