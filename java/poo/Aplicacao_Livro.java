package poo;

class Livro {
    
    public String titulo;
    // private String autor;
    protected int anoPublicacao;
    double preco;
    

    public Livro(){
    }

    public Livro(String tituloInit, String autorInit){
        titulo = tituloInit;
        // autor = autorInit;
    }

    public Livro(String tituloInit, String autorInit, int anoPublicacaoInit, double precoInit){
        titulo = tituloInit;
        // autor = autorInit;
        anoPublicacao = anoPublicacaoInit;
        preco = precoInit;
    }

}

public class Aplicacao_Livro{

    public static void main(String[] args) {
            
        //Livro 1

        Livro Livro = new Livro();

        System.out.println("Título: " + Livro.titulo);
        // System.out.println("Autor: " + Livro.autor);
        //Não é possível acessar diretamente o autor do livro pois é private.
        System.out.println("Ano de publicação: " + Livro.anoPublicacao);
        System.out.println("Preço: " + Livro.preco);
        
        System.out.println("--------------------------------------------------");

        //Livro 2

        Livro Livro2 = new Livro("Monalisa", "Leonardo da Vinci");

        System.out.println("Título: " + Livro2.titulo);
        // System.out.println("Autor: " + Livro2.autor);
        //Não é possível acessar diretamente o autor do livro pois é private.
        System.out.println("Ano de publicação: " + Livro2.anoPublicacao);
        System.out.println("Preço: " + Livro2.preco);

        System.out.println("--------------------------------------------------");

    
        //Livro 3

        Livro Livro3 = new Livro("Harry Potter", "Penisvaldo", 1945, 80);

        System.out.println("Título: " + Livro3.titulo);
        // System.out.println("Autor: " + Livro3.autor);
        //Não é possível acessar diretamente o autor do livro pois é private.
        System.out.println("Ano de publicação: " + Livro3.anoPublicacao);
        System.out.println("Preço: " + Livro3.preco);

        System.out.println("--------------------------------------------------");

    }

}
