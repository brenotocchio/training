package Interfaces01;

interface Produto{
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
    String getNome();
    int getQuantidade();
}

class ProdutoImpl implements Produto{

    private String nome;
    private int quantidade = 0;

    ProdutoImpl(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int quantidadeInit){
        quantidade += quantidadeInit;
    }

    public void removerQuantidade(int quantidadeInit){
        if (quantidade >= quantidadeInit) {
            quantidade -= quantidadeInit;
        }
        else
            System.out.println("Estoque insuficiente.");
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

}

public class LojinhaDoSeuZe {

    public static void main(String[] args) {
        
        ProdutoImpl produto1 = new ProdutoImpl("Arroz", 5);
        ProdutoImpl produto2 = new ProdutoImpl("Biz branco", 10);
        ProdutoImpl produto3 = new ProdutoImpl("Desodorizador", 15);

        produto1.adicionarQuantidade(5);

        produto2.removerQuantidade(5);

        produto3.removerQuantidade(5);

        //

        System.out.println("Nome: " + produto1.getNome() + "\nQuantidade estoque: " + produto1.getQuantidade());

        System.out.println();

        System.out.println("Nome: " + produto2.getNome() + "\nQuantidade estoque: " + produto2.getQuantidade());

        System.out.println();

        System.out.println("Nome: " + produto3.getNome() + "\nQuantidade estoque: " + produto3.getQuantidade());

    }
    
}