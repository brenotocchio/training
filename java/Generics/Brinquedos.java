package Generics;

class Carrinho001 {
    private String modelo;

    public Carrinho001(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
}

class Boneca001 {
    private String nome;

    public Boneca001(String nome){
       this.nome = nome; 
    }

    public String getNome(){
        return nome;
    }
}

public class Brinquedos{
    public static void main(String[] args) {
        
        Carrinho c = new Carrinho("Hot Weels");
        Boneca b = new Boneca("Barbie");

        System.out.println("Carrinho: " + c.getModelo());
        System.out.println("Boneca: " + b.getNome());

    }
}