/*
Crie a classe EstoqueProdutos, cujo objeto é criado na linha 3. Esta classe deve
permitir que produtos possam ser armazenados, como indica o método
adicionaProduto, chamado das linhas 4 a 7
 */

import java.util.ArrayList;

public class EstoqueProdutos{
    /*
    declarando o vetor dos itens cadastrados nos objetos criados a partir da classe ProdutoEstoque
     */
    private ArrayList<ProdutoEstoque> produtos;

    /*
    construtor da calsse EstoqueProdutos
    criando o objetor vetor
     */
    public EstoqueProdutos(){

        this.produtos = new ArrayList<ProdutoEstoque>();
    }

    public void adicionaProduto(String nome, int valor, int quantidade) {
        for (ProdutoEstoque produtos : this.produtos)
            if (produtos.getNomeProduto().equalsIgnoreCase(nome)) {
                produtos.setValorProduto(valor);
                produtos.setQuantidadeProduto(quantidade);
            }
        this.produtos.add(new ProdutoEstoque(nome, valor, quantidade));
    }

    public ProdutoEstoque buscar(String Nome)
    {
        for (ProdutoEstoque produtos : this.produtos) {
            if (produtos.getNomeProduto().toUpperCase().contains(Nome.toUpperCase()))
                return produtos;
        }
        return null;
    }

    public boolean alterar(String nome, int valor, int quantidade)
    {
        for (ProdutoEstoque produto : this.produtos)
            if(produto.getNomeProduto().equalsIgnoreCase(nome))
            {
                produto.setQuantidadeProduto(quantidade);
                produto.setValorProduto(valor);
                return true;
            }
        return false;
    }

    public String toString(){
        return "nome: ";
    }
}
