
public class Principal {
    //        (j) Crie uma classe Principal com um método main(). Crie um objeto do tipo Pilha e
    //        insira os valores 10, 20 e 30. Remova 2 elementos da pilha e exiba o seu topo
    //        resultante.
    public static void main(String[] args) {
        int topoPilha;

        Pilha classePilha = new Pilha(-1);
        if(classePilha.push(10)) System.out.println("objeto incluso na pilha");
        else System.out.println("Objeto não incluso na pilha");
        if(classePilha.push(20)) System.out.println("objeto incluso na pilha");
        else System.out.println("Objeto não incluso na pilha");
        if(classePilha.push(30)) System.out.println("objeto incluso na pilha");
        else System.out.println("Objeto não incluso na pilha");

        topoPilha = classePilha.pop();
        System.out.println("Elemento "+topoPilha+" foi retirado da pilha");
        topoPilha = classePilha.pop();
        System.out.println("Elemento "+topoPilha+" foi retirado da pilha");

        System.out.println("O elemento " + classePilha.top(classePilha.getTop()));
    }
}
