import java.util.ArrayList;
import java.lang.String;

public class CarrinhoCompra {
    int //acumuloValor=0,
            parcial=0;

    EstoqueProdutos estoqueCarrinho;
    ArrayList<ProdutoEstoque> CC;

    public CarrinhoCompra(EstoqueProdutos estoque) {
        estoqueCarrinho = estoque;
        this.CC = new ArrayList<ProdutoEstoque>();
        /*estoqueCarrinho.nome = estoque.nome;
        estoqueCarrinho.valor = estoque.valor;
        estoqueCarrinho.qtde = estoque.qtde;*/
    }

    public void adicionaItem(String no, int qt) {
        CC.add(new ProdutoEstoque(no, qt));
    }

    /*    int i = 0;
        for(i=0;i<estoqueCarrinho.x.size();i++){
            if(estoqueCarrinho.x.get(i).getNome()==no){
                if(estoqueCarrinho.x.get(i).getQuantidade()<=qt){
                    acumuloQtde = acumuloQtde + qt;
                    acumuloValor = acumuloValor + (qt * estoqueCarrinho.x.get(i).getValor());
                }
            }
        }
        if(acumuloQtde == 0){
            System.out.println("Não foi encontrado a quantidade suficiente\n");
        }

    }*/
    public void finalizaCompra() {
        int i = 0;
        for (i = 0; i < estoqueCarrinho.x.size(); i++) {
            for (int j = 0; j < CC.size(); j++)
                if (estoqueCarrinho.x.get(i).getNome() == CC.get(j).getNome()) {
                    if (estoqueCarrinho.x.get(i).getQuantidade() >= CC.get(j).getQuantidade()) {
                        estoqueCarrinho.x.get(i).setQuantidade(estoqueCarrinho.x.get(i).getQuantidade()-CC.get(j).getQuantidade());
                    } else {
                        System.out.println("A quantidade em estoque é insuficiente.");
                    }
                }
        }
    }

    public int calculaTotal() {
        int i = 0;
        for (i = 0; i < estoqueCarrinho.x.size(); i++) {
            for (int j = 0; j < CC.size(); j++)
                if (estoqueCarrinho.x.get(i).getNome() == CC.get(j).getNome()) {
                    if (estoqueCarrinho.x.get(i).getQuantidade() >= CC.get(j).getQuantidade()) {
                        parcial = parcial + (estoqueCarrinho.x.get(i).getValor() * CC.get(j).getQuantidade());
                        //System.out.println("Pegando as parciais " + parcial);
                        //acumuloValor = acumuloValor + parcial;
                        //System.out.println("Produto " + CC.get(j).getQuantidade() + "Preço " + estoqueCarrinho.x.get(i).getValor());
                    }
                }
        }
        return parcial;
    }

}
