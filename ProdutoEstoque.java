public class ProdutoEstoque {
    private char nome;
    private int valor;
    private int quantidade;

    public ProdutoEstoque(char n, int v, int q) {
        this.nome = n;
        this.valor = v;
        this.quantidade = q;
    }

    public int getQuantidade() {return quantidade;}
    public int getValor() {return valor;}
    public char getNome() {return nome;}

    public void setNome(char nome) {this.nome = nome;}
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}