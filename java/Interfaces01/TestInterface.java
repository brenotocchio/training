package Interfaces01;

interface Animal {
    void fazerSom(); // Método abstrato
}

// Classe cachorro que implementa a interface animal
class Cachorro implements Animal{

    public void fazerSom(){
        System.out.println("O cachorro faz Au Au!");
    }

}

// Classe gato que também implementa a interface animal
class Gato implements Animal{
    public void fazerSom(){
        System.out.println("O gato faz Miau Miau!");
    }
}

public class TestInterface{

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(); // Deve imprimir "O cachorro faz Au Au!"

        Gato gato = new Gato();
        gato.fazerSom(); // Deve imprimir "O gato faz Miau Miau!"


    }

}