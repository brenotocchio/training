package Polimorfismo;

abstract class Animal { // Super classe

    public abstract void fazerSom();

    public void tipoObjeto(){
        System.out.println("Objeto do tipo Animal.");
    }

}

class Cachorro extends Animal { // Subclasse Cachorro

    public void fazerSom(){
        System.out.println("O cachorro faz Au Au!");
    }

}

class Gato extends Animal { // Subclasse Gato

    public void fazerSom(){
        System.out.println("O gato faz Miau Miau!");
    }

}

public class TestPolimorfismo {

    public static void main(String[] args) {
        
        // Criando Objetos Polimórficos 

        Animal meuCachorro = new Cachorro();

        Animal meuGato = new Gato();

        meuCachorro.fazerSom(); // Imprime: O cachorro faz Au Au!

        meuGato.fazerSom(); // Imprime: O gato faz Miau Miau!


        System.out.println();
        
        meuCachorro.tipoObjeto();
        meuGato.tipoObjeto();

    }

}