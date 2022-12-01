import java.util.Arrays;

public class Principal{
    public static void main(String[] args) {

        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionaProduto("monitor",500,100);
        produtos.adicionaProduto("ssd",250,200);
        produtos.adicionaProduto("placa mãe",1100,10);

        produtos.buscar("ssd");

        produtos.alterar("ssd",250,115);
        produtos.alterar("placa mãe",1000,10);

        System.out.println(produtos);
    }
}