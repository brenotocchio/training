package Generics;

public class CaixaGenerica<T> {

    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        
        // Criando uma caixa para guardar carrinhos
        CaixaGenerica<Carrinho> caixaDeCarrinho = new CaixaGenerica<>();

        caixaDeCarrinho.guardar( new Carrinho("Hot Wheels"));

        // Criando uma caixa para guardar bonecas

        CaixaGenerica<Boneca> caixaDeBonecas = new CaixaGenerica<>();

        caixaDeBonecas.guardar(new Boneca("Barbie"));

        // Não precisamos fazer um cast,
        // pois o método pegar() retorna um carrinho e uma boneca,
        // respectivamente

        Carrinho carrinho = caixaDeCarrinho.pegar();
        Boneca boneca = caixaDeBonecas.pegar();

        System.out.println(carrinho.getModelo());
        System.out.println(boneca.getNome());

    }
    
}
