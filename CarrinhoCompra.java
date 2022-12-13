import java.util.ArrayList;
import java.lang.String;

public class CarrinhoCompra{
    public String nomeP,no;
    public int quantidadeP,va,qt;

    public CarrinhoCompra(Object estoque) {

    }

    public void adicionaItem(String no,int qt){
        ArrayList<ProdutoEstoque> lc = new ArrayList<ProdutoEstoque>();
        lc.add(new ProdutoEstoque(no,qt));

    }

    public int calculaTotal(){

    }
    public void finalizaCompra(){

    }

    /*public double calculaTotal(){

    }*/
}
