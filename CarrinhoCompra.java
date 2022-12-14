import java.util.ArrayList;
import java.lang.String;

public class CarrinhoCompra {
    int     parcial=0;

    EstoqueProdutos estoqueCarrinho;
    ArrayList<ProdutoEstoque> CC;

    public CarrinhoCompra(EstoqueProdutos estoque) {
        estoqueCarrinho = estoque;
        this.CC = new ArrayList<>();
    }

    public void adicionaItem(String no, int qt) {
        CC.add(new ProdutoEstoque(no, qt));
    }
    public void finalizaCompra() {
        int i;
        for (i = 0; i < estoqueCarrinho.x.size(); i++) {
            for (ProdutoEstoque produtoEstoque : CC)
                if (estoqueCarrinho.x.get(i).getNome().equals(produtoEstoque.getNome())) {
                    if (estoqueCarrinho.x.get(i).getQuantidade() >= produtoEstoque.getQuantidade()) {
                        estoqueCarrinho.x.get(i).setQuantidade(estoqueCarrinho.x.get(i).getQuantidade() - produtoEstoque.getQuantidade());
                    } else {
                        System.out.println("A quantidade em estoque é insuficiente.");
                    }
                }
        }
    }

    public int calculaTotal() {
        int i;
        for (i = 0; i < estoqueCarrinho.x.size(); i++) {
            for (ProdutoEstoque produtoEstoque : CC)
                if (estoqueCarrinho.x.get(i).getNome().equals(produtoEstoque.getNome())) {
                    if (estoqueCarrinho.x.get(i).getQuantidade() >= produtoEstoque.getQuantidade()) {
                        parcial = parcial + (estoqueCarrinho.x.get(i).getValor() * produtoEstoque.getQuantidade());
                    }
                }
        }
        return parcial;
    }

}
