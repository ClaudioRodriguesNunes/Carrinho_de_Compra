import java.util.ArrayList;
import java.lang.String;

public class EstoqueProdutos {
    String nome;
    int valor,qtde;
    public void adicionaProduto(ProdutoEstoque p){
        ArrayList<ProdutoEstoque> x = new ArrayList<ProdutoEstoque>();
        x.add(p);
        //ProdutoEstoque p = new ProdutoEstoque(nome,valor,qtde);
    }


}
