public class Pilha {
    private static final int TAM_MAX = 100;
    private int[] valores;
    private int top;

    private int[] pilha;

    /*Construtor*/
    public Pilha(int t){
        setTop(t);
        setPilha(new int[getTamMax()]);
    }
    //Verifica se a pilha está vazia.
    public boolean empty(){
        return (this.top) == -1;
    }

    public int tamanhoPilha(){
        if(empty())
            return 0;
        return this.top+1;
    }
    public boolean push(int valor){
        //Declare o método push, o qual insere um valor no topo da pilha.
        if(this.top < this.pilha.length-1){
            this.pilha[++top] = valor;
            return true;
        }
        return false;
    }

    public int pop(){
        //(g) Declare o método pop, o qual remove um valor do topo da pilha e o retorna.
            if(empty()){
                System.out.println("Pilha vazia");
            }
            return this.pilha[this.top--];
    }

    public int top(int topo) {
        //        (i) Declare o método top, o qual apenas retorna o valor do topo da pilha, sem
        //        modificá-la
        if (empty()) {
            System.out.println("Pilha esvaziou");
        }
        return this.pilha[topo];
    }
    public int[] getValores(){return valores;}
    public int getTop(){return top;}

    public int[] getPilha() {return pilha;}

    public static int getTamMax() {return TAM_MAX;}

    public void setValores(int[] valores){this.valores = valores;}
    public void setTop(int top) {this.top = top;}

    public void setPilha(int[] pilha) {this.pilha = pilha;}
}
