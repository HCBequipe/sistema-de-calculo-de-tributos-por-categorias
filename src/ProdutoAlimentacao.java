public class ProdutoAlimentacao extends Produto {

    public ProdutoAlimentacao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.01; // 1%
    }
}