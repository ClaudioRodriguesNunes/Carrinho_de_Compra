
public class ProdutoEstoque {
    private String nomeProduto;
    private int valorProduto;
    private int quantidadeProduto;

    /*
    Construtor da classe ProdutosEstoque
     */
    public ProdutoEstoque(String nomeProduto,int valorProduto, int quantidadeProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    /*Getters*/

    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public int getValorProduto() {
        return this.valorProduto;
    }
    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    /*Setters*/

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    /* Funções auxiliares*/

    public String toString() {
        return "ProdutoEstoque{" +
                "nomeProduto='" + this.nomeProduto + '\'' +
                ", valorProduto=" + this.valorProduto +
                ", quantidadeProduto=" + this.quantidadeProduto +
                '}';
    }
}
