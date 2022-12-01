import java.util.Arrays;

public class Principal{
    public static void main(String[] args) {

        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionaProduto("monitor",500,100);
        produtos.adicionaProduto("ssd",250,200);
        produtos.adicionaProduto("placa mãe",1100,10);

        Arrays.stream(new EstoqueProdutos[]{produtos}).forEach(System.out::print;
    }
}