public class ProdutoCultura extends Produto {

    public ProdutoCultura(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.04; // 4%
    }
}