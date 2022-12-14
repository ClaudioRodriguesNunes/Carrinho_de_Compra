import java.lang.String;
public class ProdutoEstoque {
    private String nome;
    private int valor;
    private int quantidade;

    public ProdutoEstoque(String n, int v, int q) {
        /*super();
        setNome(n);
        setValor(v);
        setQuantidade(q);*/
        this.nome = n;
        this.valor = v;
        this.quantidade = q;
    }

    public ProdutoEstoque(String n,int q){
        /*super();
        setNome(n);
        setQuantidade(q);*/
        this.nome = n;
        this.quantidade = q;
    }

    public int getQuantidade() {return quantidade;}
    public int getValor() {return valor;}
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValor(int valor) {this.valor = valor;}

}