public class ProdutoSaudeBemEstar extends Produto {

    public ProdutoSaudeBemEstar(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.015; // 1.5%
    }
}