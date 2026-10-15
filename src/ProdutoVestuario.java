public class ProdutoVestuario extends Produto {

    public ProdutoVestuario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.025; // 2.5%
    }
}