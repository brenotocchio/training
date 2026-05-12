package poo;

//Código com class Carro ! ! !

public class Aplicacao {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        Carro carro2 = new Carro("Toyota", "Corolla");

        Carro carro3 = new Carro("Honda", "Civic", 2024);

        // Exibindo os detalhes de cada Carro

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();

    }
}
