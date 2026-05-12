package poo;

public class Produtos {
    
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produtos(String nomeInit, double precoInit, int quantidadeEmEstoqueInit){

        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;

    }

    public void exibirDados(){

        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);

    }

    public static void main(String[] args) {
        
        Produtos produtos = new Produtos("Arroz",15,10);

        produtos.exibirDados();

    }

}
